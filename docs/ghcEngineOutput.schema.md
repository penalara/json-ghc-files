# EngineOutputGHCSchema

- [1. Property `EngineOutputGHCSchema > date`](#date)
- [2. Property `EngineOutputGHCSchema > weight`](#weight)
- [3. Property `EngineOutputGHCSchema > timetable`](#timetable)
  - [3.1. Property `EngineOutputGHCSchema > timetable > anonymousClassRooms`](#timetable_anonymousClassRooms)
    - [3.1.1. EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom](#timetable_anonymousClassRooms_items)
      - [3.1.1.1. Property `EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > refClassRoomsSet`](#timetable_anonymousClassRooms_items_refClassRoomsSet)
      - [3.1.1.2. Property `EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated`](#timetable_anonymousClassRooms_items_classRoomsCreated)
        - [3.1.1.2.1. EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated > AnonymousRoom](#timetable_anonymousClassRooms_items_classRoomsCreated_items)
  - [3.2. Property `EngineOutputGHCSchema > timetable > assignedSections`](#timetable_assignedSections)
    - [3.2.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection](#timetable_assignedSections_items)
      - [3.2.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > refFrame`](#timetable_assignedSections_items_refFrame)
      - [3.2.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > day`](#timetable_assignedSections_items_day)
      - [3.2.1.3. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > realIndex`](#timetable_assignedSections_items_realIndex)
      - [3.2.1.4. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > fictionalIndex`](#timetable_assignedSections_items_fictionalIndex)
      - [3.2.1.5. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > startTime`](#timetable_assignedSections_items_startTime)
      - [3.2.1.6. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > endTime`](#timetable_assignedSections_items_endTime)
      - [3.2.1.7. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment`](#timetable_assignedSections_items_assignment)
        - [3.2.1.7.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions`](#timetable_assignedSections_items_assignment_teachingSessions)
          - [3.2.1.7.1.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession](#timetable_assignedSections_items_assignment_teachingSessions_items)
            - [3.2.1.7.1.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refSession`](#timetable_assignedSections_items_assignment_teachingSessions_items_refSession)
            - [3.2.1.7.1.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms`](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms)
              - [3.2.1.7.1.1.2.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms > RefclassRomm](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items)
            - [3.2.1.7.1.1.3. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers`](#timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers)
              - [3.2.1.7.1.1.3.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers > RefTeacher](#timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items)
        - [3.2.1.7.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings`](#timetable_assignedSections_items_assignment_meetings)
          - [3.2.1.7.2.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting](#timetable_assignedSections_items_assignment_meetings_items)
            - [3.2.1.7.2.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refMeeting`](#timetable_assignedSections_items_assignment_meetings_items_refMeeting)
            - [3.2.1.7.2.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refClassRomms`](#timetable_assignedSections_items_assignment_meetings_items_refClassRomms)
        - [3.2.1.7.3. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities`](#timetable_assignedSections_items_assignment_complementaryActivities)
          - [3.2.1.7.3.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary](#timetable_assignedSections_items_assignment_complementaryActivities_items)
            - [3.2.1.7.3.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refComplementary`](#timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary)
            - [3.2.1.7.3.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refClassRomms`](#timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms)
        - [3.2.1.7.4. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices`](#timetable_assignedSections_items_assignment_onCallServices)
          - [3.2.1.7.4.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService](#timetable_assignedSections_items_assignment_onCallServices_items)
            - [3.2.1.7.4.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refOnCall`](#timetable_assignedSections_items_assignment_onCallServices_items_refOnCall)
            - [3.2.1.7.4.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refTeacher`](#timetable_assignedSections_items_assignment_onCallServices_items_refTeacher)

**Title:** EngineOutputGHCSchema

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Schema document to format in Json the timetable created by PenalaraGHC.

| Property                   | Pattern | Type    | Deprecated | Definition | Title/Description      |
| -------------------------- | ------- | ------- | ---------- | ---------- | ---------------------- |
| - [date](#date )           | No      | string  | No         | -          | JsonGenerationDate     |
| + [weight](#weight )       | No      | integer | No         | -          | ResultWeight           |
| + [timetable](#timetable ) | No      | object  | No         | -          | GeneratedJsonTimetable |

## <a name="date"></a>1. Property `EngineOutputGHCSchema > date`

**Title:** JsonGenerationDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | No          |
| **Format**   | `date-time` |

**Description:** Date of result creation.

## <a name="weight"></a>2. Property `EngineOutputGHCSchema > weight`

**Title:** ResultWeight

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Weight of the result according to the non-mandatory conditions not fulfilled.

## <a name="timetable"></a>3. Property `EngineOutputGHCSchema > timetable`

**Title:** GeneratedJsonTimetable

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Object with timetable specification resolved.

| Property                                                 | Pattern | Type            | Deprecated | Definition | Title/Description        |
| -------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------ |
| - [anonymousClassRooms](#timetable_anonymousClassRooms ) | No      | array of object | No         | -          | SetOfAnonymousClassRooms |
| + [assignedSections](#timetable_assignedSections )       | No      | array of object | No         | -          | AssignedSections         |

### <a name="timetable_anonymousClassRooms"></a>3.1. Property `EngineOutputGHCSchema > timetable > anonymousClassRooms`

**Title:** SetOfAnonymousClassRooms

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Collection with anonymous classrooms created by the engine. The classrooms are grouped by set of classrooms.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                            | Description                                                      |
| ---------------------------------------------------------- | ---------------------------------------------------------------- |
| [AnonymousClassRoom](#timetable_anonymousClassRooms_items) | Object with anonymous classrooms created in a set of classrooms. |

#### <a name="timetable_anonymousClassRooms_items"></a>3.1.1. EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom

**Title:** AnonymousClassRoom

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Object with anonymous classrooms created in a set of classrooms.

| Property                                                                       | Pattern | Type            | Deprecated | Definition | Title/Description                   |
| ------------------------------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | ----------------------------------- |
| + [refClassRoomsSet](#timetable_anonymousClassRooms_items_refClassRoomsSet )   | No      | string          | No         | -          | Identifier of the ClassRooms group. |
| + [classRoomsCreated](#timetable_anonymousClassRooms_items_classRoomsCreated ) | No      | array of string | No         | -          | ListOfAnonymousRooms                |

##### <a name="timetable_anonymousClassRooms_items_refClassRoomsSet"></a>3.1.1.1. Property `EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > refClassRoomsSet`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the ClassRooms group.

##### <a name="timetable_anonymousClassRooms_items_classRoomsCreated"></a>3.1.1.2. Property `EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated`

**Title:** ListOfAnonymousRooms

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** List of anonymous classroom created in one set of classrooms.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                               | Description                            |
| ----------------------------------------------------------------------------- | -------------------------------------- |
| [AnonymousRoom](#timetable_anonymousClassRooms_items_classRoomsCreated_items) | Identifier of the anonymous classroom. |

###### <a name="timetable_anonymousClassRooms_items_classRoomsCreated_items"></a>3.1.1.2.1. EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated > AnonymousRoom

**Title:** AnonymousRoom

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the anonymous classroom.

### <a name="timetable_assignedSections"></a>3.2. Property `EngineOutputGHCSchema > timetable > assignedSections`

**Title:** AssignedSections

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of sections assigned in the Timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                      | Description                                               |
| ---------------------------------------------------- | --------------------------------------------------------- |
| [AssignedSection](#timetable_assignedSections_items) | Section with one class units (or on call hours) assigned. |

#### <a name="timetable_assignedSections_items"></a>3.2.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection

**Title:** AssignedSection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Section with one class units (or on call hours) assigned.

| Property                                                              | Pattern | Type    | Deprecated | Definition | Title/Description                                                             |
| --------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------- |
| + [refFrame](#timetable_assignedSections_items_refFrame )             | No      | string  | No         | -          | Frame timetable section with assignment.                                      |
| + [day](#timetable_assignedSections_items_day )                       | No      | integer | No         | -          | Day of the week when the section is located.                                  |
| + [realIndex](#timetable_assignedSections_items_realIndex )           | No      | integer | No         | -          | Position on the day, of the real section, in the frame.                       |
| + [fictionalIndex](#timetable_assignedSections_items_fictionalIndex ) | No      | integer | No         | -          | Position on the day, of the fictional section, in the frame.                  |
| + [startTime](#timetable_assignedSections_items_startTime )           | No      | string  | No         | -          | Start time of the section with a fictional index where sessions are assigned. |
| + [endTime](#timetable_assignedSections_items_endTime )               | No      | string  | No         | -          | End time of the section with a fictional index where sessions are assigned.   |
| + [assignment](#timetable_assignedSections_items_assignment )         | No      | object  | No         | -          | Assignment                                                                    |

##### <a name="timetable_assignedSections_items_refFrame"></a>3.2.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame timetable section with assignment.

##### <a name="timetable_assignedSections_items_day"></a>3.2.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

##### <a name="timetable_assignedSections_items_realIndex"></a>3.2.1.3. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > realIndex`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Position on the day, of the real section, in the frame.

##### <a name="timetable_assignedSections_items_fictionalIndex"></a>3.2.1.4. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > fictionalIndex`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Position on the day, of the fictional section, in the frame.

##### <a name="timetable_assignedSections_items_startTime"></a>3.2.1.5. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > startTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** Start time of the section with a fictional index where sessions are assigned.

##### <a name="timetable_assignedSections_items_endTime"></a>3.2.1.6. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > endTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** End time of the section with a fictional index where sessions are assigned.

##### <a name="timetable_assignedSections_items_assignment"></a>3.2.1.7. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment`

**Title:** Assignment

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).

| Property                                                                                           | Pattern | Type            | Deprecated | Definition | Title/Description               |
| -------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------- |
| - [teachingSessions](#timetable_assignedSections_items_assignment_teachingSessions )               | No      | array of object | No         | -          | TeachingSessions                |
| - [meetings](#timetable_assignedSections_items_assignment_meetings )                               | No      | array of object | No         | -          | AssignedMeetings                |
| - [complementaryActivities](#timetable_assignedSections_items_assignment_complementaryActivities ) | No      | array of object | No         | -          | ComplementaryActivitiesAssigned |
| - [onCallServices](#timetable_assignedSections_items_assignment_onCallServices )                   | No      | array of object | No         | -          | OnCallServices                  |

###### <a name="timetable_assignedSections_items_assignment_teachingSessions"></a>3.2.1.7.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions`

**Title:** TeachingSessions

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of teaching sessions assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                | Description                                           |
| ---------------------------------------------------------------------------------------------- | ----------------------------------------------------- |
| [AssignedTeachingSession](#timetable_assignedSections_items_assignment_teachingSessions_items) | Class unit or on call hour assigned in the timetable. |

###### <a name="timetable_assignedSections_items_assignment_teachingSessions_items"></a>3.2.1.7.1.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession

**Title:** AssignedTeachingSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Class unit or on call hour assigned in the timetable.

| Property                                                                                              | Pattern | Type            | Deprecated | Definition               | Title/Description                            |
| ----------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------ | -------------------------------------------- |
| + [refSession](#timetable_assignedSections_items_assignment_teachingSessions_items_refSession )       | No      | integer         | No         | -                        | Identifier of the teaching session assigned. |
| + [refClassRomms](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | No      | array of string | No         | In #/$defs/refClassRomms | RefclassRomms                                |
| - [refTeachers](#timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers )     | No      | array of string | No         | -                        | RefTeachers                                  |

###### <a name="timetable_assignedSections_items_assignment_teachingSessions_items_refSession"></a>3.2.1.7.1.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refSession`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Identifier of the teaching session assigned.

###### <a name="timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms"></a>3.2.1.7.1.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms`

**Title:** RefclassRomms

|                |                       |
| -------------- | --------------------- |
| **Type**       | `array of string`     |
| **Required**   | Yes                   |
| **Defined in** | #/$defs/refClassRomms |

**Description:** List of classrooms assigned to teach the class unit.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                         | Description                                    |
| ------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| [RefclassRomm](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items) | Identifier of the classroom in the input file. |

###### <a name="timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items"></a>3.2.1.7.1.1.2.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms > RefclassRomm

**Title:** RefclassRomm

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the classroom in the input file.

###### <a name="timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers"></a>3.2.1.7.1.1.3. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers`

**Title:** RefTeachers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Optional. List of teachers assigned to the class unit. If the field is not informed, the teachers configured in the session are taken. The first is always the main teacher. It is used only in the case that alternative teachers have been configured.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                     | Description                                  |
| --------------------------------------------------------------------------------------------------- | -------------------------------------------- |
| [RefTeacher](#timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items) | Identifier of the teacher in the input file. |

###### <a name="timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items"></a>3.2.1.7.1.1.3.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers > RefTeacher

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the teacher in the input file.

###### <a name="timetable_assignedSections_items_assignment_meetings"></a>3.2.1.7.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings`

**Title:** AssignedMeetings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of meetings assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                | Description                                    |
| ------------------------------------------------------------------------------ | ---------------------------------------------- |
| [AssignedMeeting](#timetable_assignedSections_items_assignment_meetings_items) | Meeting of teachers assigned in the timetable. |

###### <a name="timetable_assignedSections_items_assignment_meetings_items"></a>3.2.1.7.2.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting

**Title:** AssignedMeeting

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Meeting of teachers assigned in the timetable.

| Property                                                                                      | Pattern | Type            | Deprecated | Definition                                                                                                  | Title/Description                   |
| --------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ----------------------------------------------------------------------------------------------------------- | ----------------------------------- |
| + [refMeeting](#timetable_assignedSections_items_assignment_meetings_items_refMeeting )       | No      | string          | No         | -                                                                                                           | Identifier of the meeting assigned. |
| - [refClassRomms](#timetable_assignedSections_items_assignment_meetings_items_refClassRomms ) | No      | array of string | No         | Same as [refClassRomms](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | RefclassRomms                       |

###### <a name="timetable_assignedSections_items_assignment_meetings_items_refMeeting"></a>3.2.1.7.2.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refMeeting`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the meeting assigned.

###### <a name="timetable_assignedSections_items_assignment_meetings_items_refClassRomms"></a>3.2.1.7.2.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refClassRomms`

**Title:** RefclassRomms

|                        |                                                                                                    |
| ---------------------- | -------------------------------------------------------------------------------------------------- |
| **Type**               | `array of string`                                                                                  |
| **Required**           | No                                                                                                 |
| **Same definition as** | [refClassRomms](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms) |

**Description:** List of classrooms assigned to teach the class unit.

###### <a name="timetable_assignedSections_items_assignment_complementaryActivities"></a>3.2.1.7.3. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities`

**Title:** ComplementaryActivitiesAssigned

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of meetings assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                     | Description                                                 |
| --------------------------------------------------------------------------------------------------- | ----------------------------------------------------------- |
| [AssignedComplementary](#timetable_assignedSections_items_assignment_complementaryActivities_items) | Teacher's complementary activity assigned in the timetable. |

###### <a name="timetable_assignedSections_items_assignment_complementaryActivities_items"></a>3.2.1.7.3.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary

**Title:** AssignedComplementary

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher's complementary activity assigned in the timetable.

| Property                                                                                                           | Pattern | Type            | Deprecated | Definition                                                                                                  | Title/Description                                  |
| ------------------------------------------------------------------------------------------------------------------ | ------- | --------------- | ---------- | ----------------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
| + [refComplementary](#timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary ) | No      | string          | No         | -                                                                                                           | Identifier of the Complementary Activity assigned. |
| - [refClassRomms](#timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms )       | No      | array of string | No         | Same as [refClassRomms](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | RefclassRomms                                      |

###### <a name="timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary"></a>3.2.1.7.3.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refComplementary`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the Complementary Activity assigned.

###### <a name="timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms"></a>3.2.1.7.3.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refClassRomms`

**Title:** RefclassRomms

|                        |                                                                                                    |
| ---------------------- | -------------------------------------------------------------------------------------------------- |
| **Type**               | `array of string`                                                                                  |
| **Required**           | No                                                                                                 |
| **Same definition as** | [refClassRomms](#timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms) |

**Description:** List of classrooms assigned to teach the class unit.

###### <a name="timetable_assignedSections_items_assignment_onCallServices"></a>3.2.1.7.4. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices`

**Title:** OnCallServices

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of teaching on call hours assigned in the section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                            | Description                          |
| ------------------------------------------------------------------------------------------ | ------------------------------------ |
| [AssignedOnCallService](#timetable_assignedSections_items_assignment_onCallServices_items) | Call hour assigned in the timetable. |

###### <a name="timetable_assignedSections_items_assignment_onCallServices_items"></a>3.2.1.7.4.1. EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService

**Title:** AssignedOnCallService

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Call hour assigned in the timetable.

| Property                                                                                      | Pattern | Type   | Deprecated | Definition | Title/Description                            |
| --------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | -------------------------------------------- |
| + [refOnCall](#timetable_assignedSections_items_assignment_onCallServices_items_refOnCall )   | No      | string | No         | -          | Identifier of the teaching session assigned. |
| + [refTeacher](#timetable_assignedSections_items_assignment_onCallServices_items_refTeacher ) | No      | string | No         | -          | RefTeachers                                  |

###### <a name="timetable_assignedSections_items_assignment_onCallServices_items_refOnCall"></a>3.2.1.7.4.1.1. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refOnCall`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the teaching session assigned.

###### <a name="timetable_assignedSections_items_assignment_onCallServices_items_refTeacher"></a>3.2.1.7.4.1.2. Property `EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refTeacher`

**Title:** RefTeachers

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher assigned in section on call service.

----------------------------------------------------------------------------------------------------------------------------
Generated using [json-schema-for-humans](https://github.com/coveooss/json-schema-for-humans) on 2026-11-09 at 11:34:13 +0100
