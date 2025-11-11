#!/usr/bin/env python3
import re
from collections import defaultdict

# Input data
data = """3407,depd-proxy
3407,depd-proxy
"2909, 2908",depd-ermo-gw
2909,depd-ermo-gw
2908,depd-ermo-statuses
"2908,2909","depd-ermo-gw, бд"
3286,depd-ermo-gw
3291,depd-ermo-gw
3206,depd-ermo-gw
3206,depd-ermo-gw
3206,depd-ermo-gw
3300,depd-ermo-gw
3300,depd-ermo-gw
3300,depd-ermo-gw
3302,depd-ui-ermo-statuses
3302,depd-ui-ermo-statuses
3302,depd-ui-ermo-statuses
3347,depd-ermo-gw
3350,depd-ermo-gw
3347,depd-ermo-gw
3350,depd-ermo-gw
2947,depd-ui-ermo-statuses
2947,depd-ui-ermo-statuses
2947,depd-ui-ermo-statuses
3420,depd-ermo-gw
3420,depd-ermo-gw
3392,depd-ui-ermo-statuses
3392,
3355,depd-ui-ermo-statuses
3355,depd-ui-ermo-statuses
3412,depd-ermo-gw
3412,depd-ermo-gw
3412,depd-ermo-gw
3414,depd-ui-ermo-statuses
3414,depd-ui-ermo-statuses
3413,depd-ui-ermo-statuses
3413,depd-ui-ermo-statuses
3413,depd-ui-ermo-statuses
3417,
3417,
3417,
3422,depd-ui-ermo-statuses
3348,depd-ui-ermo-statuses
3349,depd-ui-ermo-statuses
3348,depd-ui-ermo-statuses
3349,depd-ui-ermo-statuses
,
2914,depd-ermo-gw
2914,depd-ermo-gw
2914,depd-ermo-gw
2914,depd-ermo-gw
2914,depd-ermo-gw
3307,depd-ermo-gw
3307,depd-ermo-gw
3307,depd-ermo-gw
3290,depd-ermo-gw
3290,depd-ermo-gw
3290,depd-ermo-gw
,
,
,
,
,
,
,
,
,
,
2910,depd-ermo-gw
2911,depd-ermo-gw
"2910, 2911",depd-ermo-gw
3338,depd-ui-ermo-statuses
3338,depd-ui-ermo-statuses
3338,depd-ui-ermo-statuses
3408,depd-ui-ermo-statuses
3408,depd-ui-ermo-statuses
3403,depd-ermo-gw
3403,depd-ermo-gw
3415,depd-ui-ermo-statuses
3415,depd-ui-ermo-statuses
,
,
2943,depd-ermo-gw
2943,depd-ermo-gw
3419,depd-ui-ermo-statuses
3419,depd-ui-ermo-statuses
2949,depd-ermo-statuses
3177,depd-ermo-statuses
3269,depd-ermo-gw
2945,depd-ermo-statuses
2945,depd-ermo-statuses
2945,depd-ermo-statuses
3301,depd-ermo-statuses
,
"3166,3165",
3166,"depd-ermo-gw, depd-ermo-statuses"
3165,depd-ermo-gw
"3165, 3166","depd-ermo-gw, depd-ermo-statuses"
3299,depd-ermo-statuses
3299,depd-ermo-statuses
3299,depd-ermo-statuses
3410,
3410,
3410,
3411,
3411,
,
2950,depd-ui-ermo-statuses
2944,depd-ermo-gw
"2950, 2944","depd-ermo-gw, depd-ermo-statuses"
2945, depd-ermo-statuses
2945, depd-ermo-statuses
2945, depd-ermo-statuses
3301, depd-ermo-statuses
3295 (3203),"depd-init-db, depd-ermo-gw"
3295 (3203),"depd-init-db, depd-ermo-gw"
3288,depd-ermo-gw
3288,depd-ermo-gw
3288,depd-ermo-gw
3341,"depd-init-db, depd-ermo-gw"
3341,"depd-init-db, depd-ermo-gw"
3344,depd-ui-statuses
3344,depd-ui-statuses
3310,depd-ermo-gw
3310,depd-ermo-gw
3354,depd-ui-scans
3354,depd-ui-scans
2913,
2913,
2870,depd-ermo-gw
3173,depd-dictionary
3173,depd-dictionaty
3202,depd-ermo-gw
3202,depd-ermo-gw
2933,depd-ermo-gw
3214,depd-ermo-gw
3292,"depd-ermo-gw, depd-init-bd"
3292,"depd-ermo-gw, depd-init-bd"
3292,"depd-ermo-gw, depd-init-bd"
3339,"depd-init-db, depd-ermo-gw"
3339,"depd-init-db, depd-ermo-gw"
,
3345,ermo-ui-bulk-orders
3345,ermo-ui-bulk-orders
3340,depd-ui-bulk-orders
3351,ermo-ui-statuses
3351,ermo-ui-statuses
3352,ermo-ui-scans
3352,ermo-ui-scans
3353,ermo-ui-bulk-orders
3353,ermo-ui-bulk-orders
3421,depd-ermo-gw
3421,"""

# Dictionary to store service -> set of task IDs
services = defaultdict(set)

# Parse each line
for line in data.strip().split('\n'):
    line = line.strip()
    if not line or line == ',':
        continue
    
    # Split by comma, handling quoted values
    parts = []
    current = ''
    in_quotes = False
    
    for char in line:
        if char == '"':
            in_quotes = not in_quotes
        elif char == ',' and not in_quotes:
            parts.append(current.strip())
            current = ''
        else:
            current += char
    
    if current:
        parts.append(current.strip())
    
    if len(parts) < 2:
        continue
    
    task_ids_str = parts[0].strip('"')
    services_str = parts[1].strip('"') if len(parts) > 1 else ''
    
    # Skip if no service name
    if not services_str or services_str == ',':
        continue
    
    # Extract task IDs (handle multiple IDs separated by comma)
    task_ids = []
    for tid in re.split(r'[,\s]+', task_ids_str):
        tid = tid.strip()
        # Handle cases like "3295 (3203)"
        if '(' in tid:
            # Extract main ID and ID in parentheses
            match = re.match(r'(\d+)\s*\((\d+)\)', tid)
            if match:
                task_ids.append(match.group(1))
                task_ids.append(match.group(2))
            else:
                task_ids.append(re.sub(r'\s*\(.*?\)', '', tid))
        elif tid and tid.isdigit():
            task_ids.append(tid)
    
    # Extract service names (handle multiple services separated by comma)
    service_names = []
    for svc in re.split(r'[,\s]+', services_str):
        svc = svc.strip()
        if svc and svc != 'бд':  # Skip non-English service names like "бд"
            service_names.append(svc)
    
    # Add task IDs to each service
    for service in service_names:
        for task_id in task_ids:
            if task_id:
                services[service].add(task_id)

# Sort services alphabetically
sorted_services = sorted(services.items())

# Generate markdown output
output = []
for service, task_ids in sorted_services:
    output.append(f"- [ ] {service}:")
    # Sort task IDs numerically
    sorted_task_ids = sorted(task_ids, key=lambda x: int(x) if x.isdigit() else 0)
    for task_id in sorted_task_ids:
        output.append(f"\t- [ ] {task_id}")

print('\n'.join(output))
