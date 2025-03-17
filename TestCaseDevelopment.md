# Test Case Development
## Functional Test Cases

| Test Case ID | Requirement ID | Description                 | Steps                                   | Expected Result                         | Actual Result | Status |
|-------------|---------------|-----------------------------|-----------------------------------------|-----------------------------------------|--------------|--------|
| TC001       | FR-001        | Student records attendance | 1. Login<br>2. Select class<br>3. Complete verification | Attendance recorded as "Present"        |              |        |
| TC002       | FR-002        | Geolocation verification   | 1. Login outside classroom<br>2. Attempt attendance | Warning displayed                        |              |        |
| TC003       | FR-004        | Submit absence request     | 1. Select absence<br>2. Upload documentation | Request status "Pending"                 |              |        |
| TC004       | FR-006        | Record class attendance    | 1. Select session<br>2. Mark all students | All records updated                      |              |        |
| TC005       | FR-007        | Threshold alert            | 1. Set 80% threshold<br>2. Record 75% attendance | Alert sent                              |              |        |
| TC006       | FR-010        | Approve absence            | 1. View request<br>2. Approve with comment | Status updated to "Excused"              |              |        |
| TC007       | FR-013        | Generate report            | 1. Set parameters<br>2. Generate institutional report | Report with statistics created          |              |        |
| TC008       | FR-015        | Set department policy      | 1. Access policy settings<br>2. Set 85% minimum | Policy applied to department             |              |        |


## Non-Functional Test Cases
### Performance Test
| Test Case ID | Requirement ID | Description               | Steps                                           | Expected Result              | Actual Result | Status |
|-------------|---------------|---------------------------|-------------------------------------------------|------------------------------|--------------|--------|
| NF001       | NFR-002       | System handles peak load  | 1. Simulate 500 concurrent users<br>2. Monitor response time | Processing within 5 seconds |              |        |

### Security Test


| Test Case ID | Requirement ID | Description               | Steps                                             | Expected Result                 | Actual Result | Status |
|-------------|---------------|---------------------------|---------------------------------------------------|---------------------------------|--------------|--------|
| NF002       | NFR-005       | Prevent attendance fraud  | 1. Attempt unauthorized actions<br>2. Try to bypass verification | All attempts blocked and logged |              |        |
