# PlanningGhcData

- [1. Property `PlanningGhcData > periods`](#periods)
  - [1.1. Property `PlanningGhcData > periods > followedPeriods`](#periods_followedPeriods)
  - [1.2. Property `PlanningGhcData > periods > periodsList`](#periods_periodsList)
    - [1.2.1. PlanningGhcData > periods > periodsList > Period](#periods_periodsList_items)
      - [1.2.1.1. Property `PlanningGhcData > periods > periodsList > Period > id`](#periods_periodsList_items_id)
      - [1.2.1.2. Property `PlanningGhcData > periods > periodsList > Period > alias`](#periods_periodsList_items_alias)
      - [1.2.1.3. Property `PlanningGhcData > periods > periodsList > Period > lastDay`](#periods_periodsList_items_lastDay)
      - [1.2.1.4. Property `PlanningGhcData > periods > periodsList > Period > dayAliases`](#periods_periodsList_items_dayAliases)
        - [1.2.1.4.1. PlanningGhcData > periods > periodsList > Period > dayAliases > AliasDayDeifinition](#periods_periodsList_items_dayAliases_items)
          - [1.2.1.4.1.1. Property `PlanningGhcData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > dayId`](#periods_periodsList_items_dayAliases_items_dayId)
          - [1.2.1.4.1.2. Property `PlanningGhcData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > alias`](#periods_periodsList_items_dayAliases_items_alias)
  - [1.3. Property `PlanningGhcData > periods > periodsSets`](#periods_periodsSets)
    - [1.3.1. PlanningGhcData > periods > periodsSets > PeriodsSet](#periods_periodsSets_items)
      - [1.3.1.1. Property `PlanningGhcData > periods > periodsSets > PeriodsSet > id`](#periods_periodsSets_items_id)
      - [1.3.1.2. Property `PlanningGhcData > periods > periodsSets > PeriodsSet > periodList`](#periods_periodsSets_items_periodList)
        - [1.3.1.2.1. PlanningGhcData > periods > periodsSets > PeriodsSet > periodList > periodList items](#periods_periodsSets_items_periodList_items)
- [2. Property `PlanningGhcData > frames`](#frames)
  - [2.1. PlanningGhcData > frames > Frame](#frames_items)
    - [2.1.1. Property `PlanningGhcData > frames > Frame > id`](#frames_items_id)
    - [2.1.2. Property `PlanningGhcData > frames > Frame > exKey`](#frames_items_exKey)
    - [2.1.3. Property `PlanningGhcData > frames > Frame > days`](#frames_items_days)
      - [2.1.3.1. PlanningGhcData > frames > Frame > days > FrameDay](#frames_items_days_items)
        - [2.1.3.1.1. Property `PlanningGhcData > frames > Frame > days > FrameDay > day`](#frames_items_days_items_day)
        - [2.1.3.1.2. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections`](#frames_items_days_items_sections)
          - [2.1.3.1.2.1. PlanningGhcData > frames > Frame > days > FrameDay > sections > Section](#frames_items_days_items_sections_items)
            - [2.1.3.1.2.1.1. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > index`](#frames_items_days_items_sections_items_index)
            - [2.1.3.1.2.1.2. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > entryTime`](#frames_items_days_items_sections_items_entryTime)
            - [2.1.3.1.2.1.3. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > exitTime`](#frames_items_days_items_sections_items_exitTime)
            - [2.1.3.1.2.1.4. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > exKey`](#frames_items_days_items_sections_items_exKey)
            - [2.1.3.1.2.1.5. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > duration`](#frames_items_days_items_sections_items_duration)
            - [2.1.3.1.2.1.6. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > type`](#frames_items_days_items_sections_items_type)
            - [2.1.3.1.2.1.7. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > allowed`](#frames_items_days_items_sections_items_allowed)
- [3. Property `PlanningGhcData > buildings`](#buildings)
  - [3.1. PlanningGhcData > buildings > Building](#buildings_items)
    - [3.1.1. Property `PlanningGhcData > buildings > Building > id`](#buildings_items_id)
    - [3.1.2. Property `PlanningGhcData > buildings > Building > fullName`](#buildings_items_fullName)
    - [3.1.3. Property `PlanningGhcData > buildings > Building > distances`](#buildings_items_distances)
      - [3.1.3.1. PlanningGhcData > buildings > Building > distances > Distance](#buildings_items_distances_items)
        - [3.1.3.1.1. Property `PlanningGhcData > buildings > Building > distances > Distance > refBuilding`](#buildings_items_distances_items_refBuilding)
        - [3.1.3.1.2. Property `PlanningGhcData > buildings > Building > distances > Distance > minutes`](#buildings_items_distances_items_minutes)
- [4. Property `PlanningGhcData > classRooms`](#classRooms)
  - [4.1. PlanningGhcData > classRooms > Classroom](#classRooms_items)
    - [4.1.1. Property `PlanningGhcData > classRooms > Classroom > id`](#classRooms_items_id)
    - [4.1.2. Property `PlanningGhcData > classRooms > Classroom > shortName`](#classRooms_items_shortName)
    - [4.1.3. Property `PlanningGhcData > classRooms > Classroom > fullName`](#classRooms_items_fullName)
    - [4.1.4. Property `PlanningGhcData > classRooms > Classroom > isDedicated`](#classRooms_items_isDedicated)
    - [4.1.5. Property `PlanningGhcData > classRooms > Classroom > exKey`](#classRooms_items_exKey)
    - [4.1.6. Property `PlanningGhcData > classRooms > Classroom > capacity`](#classRooms_items_capacity)
    - [4.1.7. Property `PlanningGhcData > classRooms > Classroom > frameTemplate`](#classRooms_items_frameTemplate)
      - [4.1.7.1. PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference](#classRooms_items_frameTemplate_items)
        - [4.1.7.1.1. Property `PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference > day`](#classRooms_items_frameTemplate_items_day)
        - [4.1.7.1.2. Property `PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference > index`](#classRooms_items_frameTemplate_items_index)
        - [4.1.7.1.3. Property `PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference > frame`](#classRooms_items_frameTemplate_items_frame)
    - [4.1.8. Property `PlanningGhcData > classRooms > Classroom > refBuilding`](#classRooms_items_refBuilding)
    - [4.1.9. Property `PlanningGhcData > classRooms > Classroom > fullDay`](#classRooms_items_fullDay)
- [5. Property `PlanningGhcData > classRoomsSets`](#classRoomsSets)
  - [5.1. PlanningGhcData > classRoomsSets > ClassRoomSet](#classRoomsSets_items)
    - [5.1.1. Property `PlanningGhcData > classRoomsSets > ClassRoomSet > id`](#classRoomsSets_items_id)
    - [5.1.2. Property `PlanningGhcData > classRoomsSets > ClassRoomSet > rooms`](#classRoomsSets_items_rooms)
      - [5.1.2.1. PlanningGhcData > classRoomsSets > ClassRoomSet > rooms > ClassRoomRef](#classRoomsSets_items_rooms_items)
    - [5.1.3. Property `PlanningGhcData > classRoomsSets > ClassRoomSet > anonymousRooms`](#classRoomsSets_items_anonymousRooms)
- [6. Property `PlanningGhcData > tasks`](#tasks)
  - [6.1. PlanningGhcData > tasks > Task](#tasks_items)
    - [6.1.1. Property `PlanningGhcData > tasks > Task > id`](#tasks_items_id)
    - [6.1.2. Property `PlanningGhcData > tasks > Task > frameTemplate`](#tasks_items_frameTemplate)
      - [6.1.2.1. PlanningGhcData > tasks > Task > frameTemplate > SectionPreference](#tasks_items_frameTemplate_items)
        - [6.1.2.1.1. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > day`](#tasks_items_frameTemplate_items_day)
        - [6.1.2.1.2. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > index`](#tasks_items_frameTemplate_items_index)
        - [6.1.2.1.3. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > frame`](#tasks_items_frameTemplate_items_frame)
        - [6.1.2.1.4. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > type`](#tasks_items_frameTemplate_items_type)
    - [6.1.3. Property `PlanningGhcData > tasks > Task > fullName`](#tasks_items_fullName)
    - [6.1.4. Property `PlanningGhcData > tasks > Task > exKey`](#tasks_items_exKey)
    - [6.1.5. Property `PlanningGhcData > tasks > Task > refColourInResult`](#tasks_items_refColourInResult)
- [7. Property `PlanningGhcData > teachers`](#teachers)
  - [7.1. PlanningGhcData > teachers > Teacher](#teachers_items)
    - [7.1.1. Property `PlanningGhcData > teachers > Teacher > id`](#teachers_items_id)
    - [7.1.2. Property `PlanningGhcData > teachers > Teacher > shortName`](#teachers_items_shortName)
    - [7.1.3. Property `PlanningGhcData > teachers > Teacher > fullName`](#teachers_items_fullName)
    - [7.1.4. Property `PlanningGhcData > teachers > Teacher > exKey`](#teachers_items_exKey)
    - [7.1.5. Property `PlanningGhcData > teachers > Teacher > associationIdentifier`](#teachers_items_associationIdentifier)
    - [7.1.6. Property `PlanningGhcData > teachers > Teacher > overlappedAssessment`](#teachers_items_overlappedAssessment)
    - [7.1.7. Property `PlanningGhcData > teachers > Teacher > frameTemplate`](#teachers_items_frameTemplate)
    - [7.1.8. Property `PlanningGhcData > teachers > Teacher > generalSettings`](#teachers_items_generalSettings)
      - [7.1.8.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay`](#teachers_items_generalSettings_weeklyStay)
        - [7.1.8.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay > strict`](#teachers_items_generalSettings_weeklyStay_strict)
        - [7.1.8.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay > preferable`](#teachers_items_generalSettings_weeklyStay_preferable)
        - [7.1.8.1.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay > countAroundMidday`](#teachers_items_generalSettings_weeklyStay_countAroundMidday)
      - [7.1.8.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay`](#teachers_items_generalSettings_dailyStay)
        - [7.1.8.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay > strict`](#teachers_items_generalSettings_dailyStay_strict)
        - [7.1.8.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay > preferable`](#teachers_items_generalSettings_dailyStay_preferable)
        - [7.1.8.2.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay > countAroundMidday`](#teachers_items_generalSettings_dailyStay_countAroundMidday)
      - [7.1.8.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > avoidGapsBetweenSesions`](#teachers_items_generalSettings_avoidGapsBetweenSesions)
      - [7.1.8.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching`](#teachers_items_generalSettings_maxContinuousTeaching)
        - [7.1.8.4.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching > type`](#teachers_items_generalSettings_maxContinuousTeaching_type)
        - [7.1.8.4.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching > minutes`](#teachers_items_generalSettings_maxContinuousTeaching_minutes)
        - [7.1.8.4.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching > minBreak`](#teachers_items_generalSettings_maxContinuousTeaching_minBreak)
      - [7.1.8.5. Property `PlanningGhcData > teachers > Teacher > generalSettings > avoidClassesAroundBreak`](#teachers_items_generalSettings_avoidClassesAroundBreak)
      - [7.1.8.6. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes`](#teachers_items_generalSettings_freeTimes)
        - [7.1.8.6.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > fullDay`](#teachers_items_generalSettings_freeTimes_fullDay)
          - [7.1.8.6.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > fullDay > strictDays`](#teachers_items_generalSettings_freeTimes_fullDay_strictDays)
          - [7.1.8.6.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > fullDay > preferredDays`](#teachers_items_generalSettings_freeTimes_fullDay_preferredDays)
        - [7.1.8.6.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes`](#teachers_items_generalSettings_freeTimes_firstMinutes)
          - [7.1.8.6.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > strictDays`](#teachers_items_generalSettings_freeTimes_firstMinutes_strictDays)
          - [7.1.8.6.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > preferredDays`](#teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays)
          - [7.1.8.6.2.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > minutes`](#teachers_items_generalSettings_freeTimes_firstMinutes_minutes)
        - [7.1.8.6.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes`](#teachers_items_generalSettings_freeTimes_lastMinutes)
          - [7.1.8.6.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > strictDays`](#teachers_items_generalSettings_freeTimes_lastMinutes_strictDays)
          - [7.1.8.6.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > preferredDays`](#teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays)
          - [7.1.8.6.3.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > minutes`](#teachers_items_generalSettings_freeTimes_lastMinutes_minutes)
        - [7.1.8.6.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime`](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime)
          - [7.1.8.6.4.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > strictDays`](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays)
          - [7.1.8.6.4.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > preferredDays`](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays)
          - [7.1.8.6.4.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > minutes`](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes)
      - [7.1.8.7. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes`](#teachers_items_generalSettings_freePartTimes)
        - [7.1.8.7.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > mornings`](#teachers_items_generalSettings_freePartTimes_mornings)
          - [7.1.8.7.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > mornings > strict`](#teachers_items_generalSettings_freePartTimes_mornings_strict)
          - [7.1.8.7.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > mornings > preferable`](#teachers_items_generalSettings_freePartTimes_mornings_preferable)
        - [7.1.8.7.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > afternoons`](#teachers_items_generalSettings_freePartTimes_afternoons)
          - [7.1.8.7.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > afternoons > strict`](#teachers_items_generalSettings_freePartTimes_afternoons_strict)
          - [7.1.8.7.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > afternoons > preferable`](#teachers_items_generalSettings_freePartTimes_afternoons_preferable)
        - [7.1.8.7.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > indistinctly`](#teachers_items_generalSettings_freePartTimes_indistinctly)
          - [7.1.8.7.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > strict`](#teachers_items_generalSettings_freePartTimes_indistinctly_strict)
          - [7.1.8.7.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > preferable`](#teachers_items_generalSettings_freePartTimes_indistinctly_preferable)
      - [7.1.8.8. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities`](#teachers_items_generalSettings_incompatibilities)
        - [7.1.8.8.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent)
          - [7.1.8.8.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
          - [7.1.8.8.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
        - [7.1.8.8.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenEndWeekAndStartWeekDays`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays)
          - [7.1.8.8.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
          - [7.1.8.8.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
        - [7.1.8.8.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeFirstOrLastHoursDay`](#teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay)
          - [7.1.8.8.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
          - [7.1.8.8.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
        - [7.1.8.8.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection)
        - [7.1.8.8.5. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection)
        - [7.1.8.8.6. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection)
        - [7.1.8.8.7. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment)
        - [7.1.8.8.8. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`](#teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment)
        - [7.1.8.8.9. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeAroundMidday`](#teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday)
          - [7.1.8.8.9.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
          - [7.1.8.8.9.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
      - [7.1.8.9. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation`](#teachers_items_generalSettings_dailyOcupation)
        - [7.1.8.9.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > allowFreeDays`](#teachers_items_generalSettings_dailyOcupation_allowFreeDays)
        - [7.1.8.9.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching)
          - [7.1.8.9.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
          - [7.1.8.9.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
          - [7.1.8.9.2.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
          - [7.1.8.9.2.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
        - [7.1.8.9.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > maximumTeaching`](#teachers_items_generalSettings_dailyOcupation_maximumTeaching)
          - [7.1.8.9.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
          - [7.1.8.9.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
          - [7.1.8.9.3.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
          - [7.1.8.9.3.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
        - [7.1.8.9.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumOccupancy`](#teachers_items_generalSettings_dailyOcupation_minimumOccupancy)
          - [7.1.8.9.4.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
          - [7.1.8.9.4.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
          - [7.1.8.9.4.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
          - [7.1.8.9.4.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
        - [7.1.8.9.5. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > maximumOccupancy`](#teachers_items_generalSettings_dailyOcupation_maximumOccupancy)
          - [7.1.8.9.5.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
          - [7.1.8.9.5.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
          - [7.1.8.9.5.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
          - [7.1.8.9.5.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
      - [7.1.8.10. Property `PlanningGhcData > teachers > Teacher > generalSettings > middayReference`](#teachers_items_generalSettings_middayReference)
        - [7.1.8.10.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > middayReference > refFrame`](#teachers_items_generalSettings_middayReference_refFrame)
        - [7.1.8.10.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > middayReference > strict`](#teachers_items_generalSettings_middayReference_strict)
      - [7.1.8.11. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyBuildingTransfers`](#teachers_items_generalSettings_dailyBuildingTransfers)
        - [7.1.8.11.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyBuildingTransfers > strict`](#teachers_items_generalSettings_dailyBuildingTransfers_strict)
        - [7.1.8.11.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyBuildingTransfers > preferable`](#teachers_items_generalSettings_dailyBuildingTransfers_preferable)
    - [7.1.9. Property `PlanningGhcData > teachers > Teacher > periodsSettings`](#teachers_items_periodsSettings)
      - [7.1.9.1. PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting](#teachers_items_periodsSettings_items)
        - [7.1.9.1.1. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > refPeriod`](#teachers_items_periodsSettings_items_refPeriod)
        - [7.1.9.1.2. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > weeklyStay`](#teachers_items_periodsSettings_items_weeklyStay)
        - [7.1.9.1.3. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > dailyStay`](#teachers_items_periodsSettings_items_dailyStay)
        - [7.1.9.1.4. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > avoidGapsBetweenSesions`](#teachers_items_periodsSettings_items_avoidGapsBetweenSesions)
        - [7.1.9.1.5. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > maxContinuousTeaching`](#teachers_items_periodsSettings_items_maxContinuousTeaching)
        - [7.1.9.1.6. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > avoidClassesAroundBreak`](#teachers_items_periodsSettings_items_avoidClassesAroundBreak)
        - [7.1.9.1.7. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > freeTimes`](#teachers_items_periodsSettings_items_freeTimes)
        - [7.1.9.1.8. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > freePartTimes`](#teachers_items_periodsSettings_items_freePartTimes)
        - [7.1.9.1.9. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > incompatibilities`](#teachers_items_periodsSettings_items_incompatibilities)
        - [7.1.9.1.10. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > dailyOcupation`](#teachers_items_periodsSettings_items_dailyOcupation)
        - [7.1.9.1.11. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > middayReference`](#teachers_items_periodsSettings_items_middayReference)
        - [7.1.9.1.12. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > dailyBuildingTransfers`](#teachers_items_periodsSettings_items_dailyBuildingTransfers)
- [8. Property `PlanningGhcData > subjects`](#subjects)
  - [8.1. PlanningGhcData > subjects > Subject](#subjects_items)
    - [8.1.1. Property `PlanningGhcData > subjects > Subject > id`](#subjects_items_id)
    - [8.1.2. Property `PlanningGhcData > subjects > Subject > shortName`](#subjects_items_shortName)
    - [8.1.3. Property `PlanningGhcData > subjects > Subject > fullName`](#subjects_items_fullName)
    - [8.1.4. Property `PlanningGhcData > subjects > Subject > exKey`](#subjects_items_exKey)
    - [8.1.5. Property `PlanningGhcData > subjects > Subject > technicalTeacher`](#subjects_items_technicalTeacher)
    - [8.1.6. Property `PlanningGhcData > subjects > Subject > type`](#subjects_items_type)
    - [8.1.7. Property `PlanningGhcData > subjects > Subject > refClassroom`](#subjects_items_refClassroom)
    - [8.1.8. Property `PlanningGhcData > subjects > Subject > refClassRoomSetsList`](#subjects_items_refClassRoomSetsList)
      - [8.1.8.1. PlanningGhcData > subjects > Subject > refClassRoomSetsList > ClassRoomSetRef](#subjects_items_refClassRoomSetsList_items)
    - [8.1.9. Property `PlanningGhcData > subjects > Subject > refColourInResult`](#subjects_items_refColourInResult)
    - [8.1.10. Property `PlanningGhcData > subjects > Subject > frameTemplate`](#subjects_items_frameTemplate)
- [9. Property `PlanningGhcData > groups`](#groups)
  - [9.1. PlanningGhcData > groups > Group](#groups_items)
    - [9.1.1. Property `PlanningGhcData > groups > Group > id`](#groups_items_id)
    - [9.1.2. Property `PlanningGhcData > groups > Group > shortName`](#groups_items_shortName)
    - [9.1.3. Property `PlanningGhcData > groups > Group > fullName`](#groups_items_fullName)
    - [9.1.4. Property `PlanningGhcData > groups > Group > exKey`](#groups_items_exKey)
    - [9.1.5. Property `PlanningGhcData > groups > Group > refFrame`](#groups_items_refFrame)
    - [9.1.6. Property `PlanningGhcData > groups > Group > frameTemplate`](#groups_items_frameTemplate)
    - [9.1.7. Property `PlanningGhcData > groups > Group > numStudents`](#groups_items_numStudents)
    - [9.1.8. Property `PlanningGhcData > groups > Group > freeAfternoons`](#groups_items_freeAfternoons)
    - [9.1.9. Property `PlanningGhcData > groups > Group > notGaps`](#groups_items_notGaps)
    - [9.1.10. Property `PlanningGhcData > groups > Group > gapsAlwaysInNonPreferred`](#groups_items_gapsAlwaysInNonPreferred)
    - [9.1.11. Property `PlanningGhcData > groups > Group > refCourse`](#groups_items_refCourse)
    - [9.1.12. Property `PlanningGhcData > groups > Group > includedGroups`](#groups_items_includedGroups)
      - [9.1.12.1. PlanningGhcData > groups > Group > includedGroups > refGroups](#groups_items_includedGroups_items)
    - [9.1.13. Property `PlanningGhcData > groups > Group > refTeacher`](#groups_items_refTeacher)
    - [9.1.14. Property `PlanningGhcData > groups > Group > refClassroom`](#groups_items_refClassroom)
    - [9.1.15. Property `PlanningGhcData > groups > Group > refClassRoomSetsList`](#groups_items_refClassRoomSetsList)
      - [9.1.15.1. PlanningGhcData > groups > Group > refClassRoomSetsList > ClassRoomSetRef](#groups_items_refClassRoomSetsList_items)
- [10. Property `PlanningGhcData > groupSetRelations`](#groupSetRelations)
  - [10.1. PlanningGhcData > groupSetRelations > GroupSetRelation](#groupSetRelations_items)
    - [10.1.1. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > id`](#groupSetRelations_items_id)
    - [10.1.2. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > alias`](#groupSetRelations_items_alias)
    - [10.1.3. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression`](#groupSetRelations_items_expression)
      - [10.1.3.1. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression > operator`](#groupSetRelations_items_expression_operator)
      - [10.1.3.2. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression > refGroupSet`](#groupSetRelations_items_expression_refGroupSet)
        - [10.1.3.2.1. PlanningGhcData > groupSetRelations > GroupSetRelation > expression > refGroupSet > GroupSetReference](#groupSetRelations_items_expression_refGroupSet_items)
      - [10.1.3.3. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions`](#groupSetRelations_items_expression_nestedRelationExpressions)
        - [10.1.3.3.1. PlanningGhcData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions > GroupSetRelationExpression](#groupSetRelations_items_expression_nestedRelationExpressions_items)
- [11. Property `PlanningGhcData > courses`](#courses)
  - [11.1. PlanningGhcData > courses > Course](#courses_items)
    - [11.1.1. Property `PlanningGhcData > courses > Course > id`](#courses_items_id)
    - [11.1.2. Property `PlanningGhcData > courses > Course > fullName`](#courses_items_fullName)
    - [11.1.3. Property `PlanningGhcData > courses > Course > exKey`](#courses_items_exKey)
    - [11.1.4. Property `PlanningGhcData > courses > Course > courseSubjects`](#courses_items_courseSubjects)
      - [11.1.4.1. PlanningGhcData > courses > Course > courseSubjects > CourseSubject](#courses_items_courseSubjects_items)
        - [11.1.4.1.1. Property `PlanningGhcData > courses > Course > courseSubjects > CourseSubject > numHours`](#courses_items_courseSubjects_items_numHours)
        - [11.1.4.1.2. Property `PlanningGhcData > courses > Course > courseSubjects > CourseSubject > refSubject`](#courses_items_courseSubjects_items_refSubject)
- [12. Property `PlanningGhcData > departments`](#departments)
  - [12.1. PlanningGhcData > departments > Department](#departments_items)
    - [12.1.1. Property `PlanningGhcData > departments > Department > id`](#departments_items_id)
    - [12.1.2. Property `PlanningGhcData > departments > Department > fullName`](#departments_items_fullName)
    - [12.1.3. Property `PlanningGhcData > departments > Department > messageToDepartment`](#departments_items_messageToDepartment)
    - [12.1.4. Property `PlanningGhcData > departments > Department > isNew`](#departments_items_isNew)
    - [12.1.5. Property `PlanningGhcData > departments > Department > exKey`](#departments_items_exKey)
    - [12.1.6. Property `PlanningGhcData > departments > Department > email`](#departments_items_email)
    - [12.1.7. Property `PlanningGhcData > departments > Department > refTeacher`](#departments_items_refTeacher)
      - [12.1.7.1. PlanningGhcData > departments > Department > refTeacher > refTeacher items](#departments_items_refTeacher_items)
    - [12.1.8. Property `PlanningGhcData > departments > Department > refSubjects`](#departments_items_refSubjects)
      - [12.1.8.1. PlanningGhcData > departments > Department > refSubjects > refSubjects items](#departments_items_refSubjects_items)
- [13. Property `PlanningGhcData > sessions`](#sessions)
  - [13.1. PlanningGhcData > sessions > Session](#sessions_items)
    - [13.1.1. Property `PlanningGhcData > sessions > Session > id`](#sessions_items_id)
    - [13.1.2. Property `PlanningGhcData > sessions > Session > refFrame`](#sessions_items_refFrame)
    - [13.1.3. Property `PlanningGhcData > sessions > Session > refMainTask`](#sessions_items_refMainTask)
    - [13.1.4. Property `PlanningGhcData > sessions > Session > refMainTeacher`](#sessions_items_refMainTeacher)
    - [13.1.5. Property `PlanningGhcData > sessions > Session > refMainSubject`](#sessions_items_refMainSubject)
    - [13.1.6. Property `PlanningGhcData > sessions > Session > refMainGroup`](#sessions_items_refMainGroup)
      - [13.1.6.1. Property `PlanningGhcData > sessions > Session > refMainGroup > refIdGroup`](#sessions_items_refMainGroup_refIdGroup)
      - [13.1.6.2. Property `PlanningGhcData > sessions > Session > refMainGroup > numStudents`](#sessions_items_refMainGroup_numStudents)
    - [13.1.7. Property `PlanningGhcData > sessions > Session > refColourInResult`](#sessions_items_refColourInResult)
    - [13.1.8. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms`](#sessions_items_otherElementsInClassRooms)
      - [13.1.8.1. PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms](#sessions_items_otherElementsInClassRooms_items)
        - [13.1.8.1.1. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refSubject`](#sessions_items_otherElementsInClassRooms_items_refSubject)
        - [13.1.8.1.2. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTeacher`](#sessions_items_otherElementsInClassRooms_items_refTeacher)
        - [13.1.8.1.3. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refGroup`](#sessions_items_otherElementsInClassRooms_items_refGroup)
        - [13.1.8.1.4. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTask`](#sessions_items_otherElementsInClassRooms_items_refTask)
    - [13.1.9. Property `PlanningGhcData > sessions > Session > distribution`](#sessions_items_distribution)
      - [13.1.9.1. Property `PlanningGhcData > sessions > Session > distribution > periods`](#sessions_items_distribution_periods)
        - [13.1.9.1.1. PlanningGhcData > sessions > Session > distribution > periods > RefPeriod](#sessions_items_distribution_periods_items)
      - [13.1.9.2. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods`](#sessions_items_distribution_stablePeriods)
        - [13.1.9.2.1. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTiming`](#sessions_items_distribution_stablePeriods_stableTiming)
          - [13.1.9.2.1.1. PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTiming > DailyMinutes](#sessions_items_distribution_stablePeriods_stableTiming_items)
        - [13.1.9.2.2. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming`](#sessions_items_distribution_stablePeriods_variableTiming)
          - [13.1.9.2.2.1. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > minutesAmount`](#sessions_items_distribution_stablePeriods_variableTiming_minutesAmount)
          - [13.1.9.2.2.2. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > maxMinutesDaily`](#sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily)
          - [13.1.9.2.2.3. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > minMinutesDaily`](#sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily)
          - [13.1.9.2.2.4. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMaxDuration`](#sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration)
          - [13.1.9.2.2.5. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMinDuration`](#sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration)
          - [13.1.9.2.2.6. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > allowDiscontinuity`](#sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity)
        - [13.1.9.2.3. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTimingList`](#sessions_items_distribution_stablePeriods_stableTimingList)
          - [13.1.9.2.3.1. PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTimingList > StableTiming](#sessions_items_distribution_stablePeriods_stableTimingList_items)
      - [13.1.9.3. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods`](#sessions_items_distribution_variablePeriods)
        - [13.1.9.3.1. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > timing`](#sessions_items_distribution_variablePeriods_timing)
          - [13.1.9.3.1.1. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > timing > stableTiming`](#sessions_items_distribution_variablePeriods_timing_stableTiming)
          - [13.1.9.3.1.2. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > timing > variableTiming`](#sessions_items_distribution_variablePeriods_timing_variableTiming)
        - [13.1.9.3.2. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > maximunTimeInPeriod`](#sessions_items_distribution_variablePeriods_maximunTimeInPeriod)
        - [13.1.9.3.3. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > minimnunTimeInPeriod`](#sessions_items_distribution_variablePeriods_minimnunTimeInPeriod)
        - [13.1.9.3.4. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > maximumTimeframe`](#sessions_items_distribution_variablePeriods_maximumTimeframe)
    - [13.1.10. Property `PlanningGhcData > sessions > Session > sessionClassRooms`](#sessions_items_sessionClassRooms)
      - [13.1.10.1. Property `PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign`](#sessions_items_sessionClassRooms_classRoomsToAssign)
        - [13.1.10.1.1. PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign](#sessions_items_sessionClassRooms_classRoomsToAssign_items)
          - [13.1.10.1.1.1. Property `PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoom`](#sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom)
          - [13.1.10.1.1.2. Property `PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList`](#sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList)
            - [13.1.10.1.1.2.1. PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList > ClassRoomSetRef](#sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items)
      - [13.1.10.2. Property `PlanningGhcData > sessions > Session > sessionClassRooms > capacityPreference`](#sessions_items_sessionClassRooms_capacityPreference)
      - [13.1.10.3. Property `PlanningGhcData > sessions > Session > sessionClassRooms > capacityType`](#sessions_items_sessionClassRooms_capacityType)
      - [13.1.10.4. Property `PlanningGhcData > sessions > Session > sessionClassRooms > alwaysSameClassRoom`](#sessions_items_sessionClassRooms_alwaysSameClassRoom)
    - [13.1.11. Property `PlanningGhcData > sessions > Session > frameTemplate`](#sessions_items_frameTemplate)
      - [13.1.11.1. PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference](#sessions_items_frameTemplate_items)
        - [13.1.11.1.1. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > day`](#sessions_items_frameTemplate_items_day)
        - [13.1.11.1.2. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > index`](#sessions_items_frameTemplate_items_index)
        - [13.1.11.1.3. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > frame`](#sessions_items_frameTemplate_items_frame)
        - [13.1.11.1.4. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > type`](#sessions_items_frameTemplate_items_type)
    - [13.1.12. Property `PlanningGhcData > sessions > Session > sessionSettings`](#sessions_items_sessionSettings)
      - [13.1.12.1. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidFirstHourSessions`](#sessions_items_sessionSettings_avoidFirstHourSessions)
      - [13.1.12.2. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidLastHourSessions`](#sessions_items_sessionSettings_avoidLastHourSessions)
      - [13.1.12.3. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidAssingLastHourAndFirstNextDay`](#sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay)
      - [13.1.12.4. Property `PlanningGhcData > sessions > Session > sessionSettings > sameHourPreference`](#sessions_items_sessionSettings_sameHourPreference)
      - [13.1.12.5. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidAfternoonSessions`](#sessions_items_sessionSettings_avoidAfternoonSessions)
      - [13.1.12.6. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidAfterBreakSessions`](#sessions_items_sessionSettings_avoidAfterBreakSessions)
      - [13.1.12.7. Property `PlanningGhcData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfConsecutiveSession`](#sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession)
      - [13.1.12.8. Property `PlanningGhcData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfSession`](#sessions_items_sessionSettings_nonBreakInTheMiddleOfSession)
      - [13.1.12.9. Property `PlanningGhcData > sessions > Session > sessionSettings > followedDaysPreference`](#sessions_items_sessionSettings_followedDaysPreference)
      - [13.1.12.10. Property `PlanningGhcData > sessions > Session > sessionSettings > consecutiveWeeksBorders`](#sessions_items_sessionSettings_consecutiveWeeksBorders)
      - [13.1.12.11. Property `PlanningGhcData > sessions > Session > sessionSettings > samePositionEveryPeriod`](#sessions_items_sessionSettings_samePositionEveryPeriod)
    - [13.1.13. Property `PlanningGhcData > sessions > Session > sessionRelations`](#sessions_items_sessionRelations)
      - [13.1.13.1. Property `PlanningGhcData > sessions > Session > sessionRelations > refSimultaneusGroup`](#sessions_items_sessionRelations_refSimultaneusGroup)
      - [13.1.13.2. Property `PlanningGhcData > sessions > Session > sessionRelations > differentDays`](#sessions_items_sessionRelations_differentDays)
        - [13.1.13.2.1. Property `PlanningGhcData > sessions > Session > sessionRelations > differentDays > refSesions`](#sessions_items_sessionRelations_differentDays_refSesions)
          - [13.1.13.2.1.1. PlanningGhcData > sessions > Session > sessionRelations > differentDays > refSesions > SessionRef](#sessions_items_sessionRelations_differentDays_refSesions_items)
        - [13.1.13.2.2. Property `PlanningGhcData > sessions > Session > sessionRelations > differentDays > daysSetting`](#sessions_items_sessionRelations_differentDays_daysSetting)
      - [13.1.13.3. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup`](#sessions_items_sessionRelations_consecutiveGroup)
        - [13.1.13.3.1. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > id`](#sessions_items_sessionRelations_consecutiveGroup_id)
        - [13.1.13.3.2. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > refSessions`](#sessions_items_sessionRelations_consecutiveGroup_refSessions)
          - [13.1.13.3.2.1. PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > refSessions > SessionRef](#sessions_items_sessionRelations_consecutiveGroup_refSessions_items)
        - [13.1.13.3.3. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > order`](#sessions_items_sessionRelations_consecutiveGroup_order)
        - [13.1.13.3.4. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > allowBreakBetweenSessions`](#sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions)
      - [13.1.13.4. Property `PlanningGhcData > sessions > Session > sessionRelations > nonConsecutiveSessions`](#sessions_items_sessionRelations_nonConsecutiveSessions)
        - [13.1.13.4.1. PlanningGhcData > sessions > Session > sessionRelations > nonConsecutiveSessions > SessionRef](#sessions_items_sessionRelations_nonConsecutiveSessions_items)
      - [13.1.13.5. Property `PlanningGhcData > sessions > Session > sessionRelations > nonSimultaneus`](#sessions_items_sessionRelations_nonSimultaneus)
        - [13.1.13.5.1. PlanningGhcData > sessions > Session > sessionRelations > nonSimultaneus > SessionRef](#sessions_items_sessionRelations_nonSimultaneus_items)
      - [13.1.13.6. Property `PlanningGhcData > sessions > Session > sessionRelations > previousTo`](#sessions_items_sessionRelations_previousTo)
        - [13.1.13.6.1. PlanningGhcData > sessions > Session > sessionRelations > previousTo > SessionRef](#sessions_items_sessionRelations_previousTo_items)
      - [13.1.13.7. Property `PlanningGhcData > sessions > Session > sessionRelations > afterTo`](#sessions_items_sessionRelations_afterTo)
        - [13.1.13.7.1. PlanningGhcData > sessions > Session > sessionRelations > afterTo > SessionRef](#sessions_items_sessionRelations_afterTo_items)
      - [13.1.13.8. Property `PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo`](#sessions_items_sessionRelations_maximumSeparationTo)
        - [13.1.13.8.1. PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession](#sessions_items_sessionRelations_maximumSeparationTo_items)
          - [13.1.13.8.1.1. Property `PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions`](#sessions_items_sessionRelations_maximumSeparationTo_items_refSessions)
            - [13.1.13.8.1.1.1. PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions > SessionRef](#sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items)
          - [13.1.13.8.1.2. Property `PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > days`](#sessions_items_sessionRelations_maximumSeparationTo_items_days)
      - [13.1.13.9. Property `PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo`](#sessions_items_sessionRelations_minimumSeparationTo)
        - [13.1.13.9.1. PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession](#sessions_items_sessionRelations_minimumSeparationTo_items)
          - [13.1.13.9.1.1. Property `PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions`](#sessions_items_sessionRelations_minimumSeparationTo_items_refSessions)
            - [13.1.13.9.1.1.1. PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions > SessionRef](#sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items)
          - [13.1.13.9.1.2. Property `PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > days`](#sessions_items_sessionRelations_minimumSeparationTo_items_days)
    - [13.1.14. Property `PlanningGhcData > sessions > Session > department`](#sessions_items_department)
- [14. Property `PlanningGhcData > meetings`](#meetings)
  - [14.1. PlanningGhcData > meetings > Meeting](#meetings_items)
    - [14.1.1. Property `PlanningGhcData > meetings > Meeting > id`](#meetings_items_id)
    - [14.1.2. Property `PlanningGhcData > meetings > Meeting > refFrame`](#meetings_items_refFrame)
    - [14.1.3. Property `PlanningGhcData > meetings > Meeting > refTask`](#meetings_items_refTask)
    - [14.1.4. Property `PlanningGhcData > meetings > Meeting > refTeachers`](#meetings_items_refTeachers)
      - [14.1.4.1. PlanningGhcData > meetings > Meeting > refTeachers > RefTeacher](#meetings_items_refTeachers_items)
    - [14.1.5. Property `PlanningGhcData > meetings > Meeting > refColourInResult`](#meetings_items_refColourInResult)
    - [14.1.6. Property `PlanningGhcData > meetings > Meeting > distribution`](#meetings_items_distribution)
    - [14.1.7. Property `PlanningGhcData > meetings > Meeting > frameTemplate`](#meetings_items_frameTemplate)
    - [14.1.8. Property `PlanningGhcData > meetings > Meeting > refClassRoomToAssign`](#meetings_items_refClassRoomToAssign)
    - [14.1.9. Property `PlanningGhcData > meetings > Meeting > refBuilding`](#meetings_items_refBuilding)
    - [14.1.10. Property `PlanningGhcData > meetings > Meeting > settings`](#meetings_items_settings)
      - [14.1.10.1. Property `PlanningGhcData > meetings > Meeting > settings > computeForMaxMinOccupancy`](#meetings_items_settings_computeForMaxMinOccupancy)
      - [14.1.10.2. Property `PlanningGhcData > meetings > Meeting > settings > samePositionEveryPeriod`](#meetings_items_settings_samePositionEveryPeriod)
- [15. Property `PlanningGhcData > complementaryActivities`](#complementaryActivities)
  - [15.1. PlanningGhcData > complementaryActivities > Complementary](#complementaryActivities_items)
    - [15.1.1. Property `PlanningGhcData > complementaryActivities > Complementary > id`](#complementaryActivities_items_id)
    - [15.1.2. Property `PlanningGhcData > complementaryActivities > Complementary > refFrame`](#complementaryActivities_items_refFrame)
    - [15.1.3. Property `PlanningGhcData > complementaryActivities > Complementary > refTask`](#complementaryActivities_items_refTask)
    - [15.1.4. Property `PlanningGhcData > complementaryActivities > Complementary > refTeacher`](#complementaryActivities_items_refTeacher)
    - [15.1.5. Property `PlanningGhcData > complementaryActivities > Complementary > refColourInResult`](#complementaryActivities_items_refColourInResult)
    - [15.1.6. Property `PlanningGhcData > complementaryActivities > Complementary > distribution`](#complementaryActivities_items_distribution)
    - [15.1.7. Property `PlanningGhcData > complementaryActivities > Complementary > frameTemplate`](#complementaryActivities_items_frameTemplate)
    - [15.1.8. Property `PlanningGhcData > complementaryActivities > Complementary > refClassRoomToAssign`](#complementaryActivities_items_refClassRoomToAssign)
    - [15.1.9. Property `PlanningGhcData > complementaryActivities > Complementary > refBuilding`](#complementaryActivities_items_refBuilding)
    - [15.1.10. Property `PlanningGhcData > complementaryActivities > Complementary > settings`](#complementaryActivities_items_settings)
- [16. Property `PlanningGhcData > onCallServices`](#onCallServices)
  - [16.1. PlanningGhcData > onCallServices > OnCallService](#onCallServices_items)
    - [16.1.1. Property `PlanningGhcData > onCallServices > OnCallService > id`](#onCallServices_items_id)
    - [16.1.2. Property `PlanningGhcData > onCallServices > OnCallService > refFrame`](#onCallServices_items_refFrame)
    - [16.1.3. Property `PlanningGhcData > onCallServices > OnCallService > refPeriods`](#onCallServices_items_refPeriods)
      - [16.1.3.1. PlanningGhcData > onCallServices > OnCallService > refPeriods > RefPeriod](#onCallServices_items_refPeriods_items)
    - [16.1.4. Property `PlanningGhcData > onCallServices > OnCallService > refTask`](#onCallServices_items_refTask)
    - [16.1.5. Property `PlanningGhcData > onCallServices > OnCallService > inBreak`](#onCallServices_items_inBreak)
    - [16.1.6. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection`](#onCallServices_items_teachersEachSection)
      - [16.1.6.1. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > byDefault`](#onCallServices_items_teachersEachSection_byDefault)
      - [16.1.6.2. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection`](#onCallServices_items_teachersEachSection_bySection)
        - [16.1.6.2.1. PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection](#onCallServices_items_teachersEachSection_bySection_items)
          - [16.1.6.2.1.1. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > day`](#onCallServices_items_teachersEachSection_bySection_items_day)
          - [16.1.6.2.1.2. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > index`](#onCallServices_items_teachersEachSection_bySection_items_index)
          - [16.1.6.2.1.3. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > numTeachers`](#onCallServices_items_teachersEachSection_bySection_items_numTeachers)
    - [16.1.7. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers`](#onCallServices_items_refTeachers)
      - [16.1.7.1. PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher](#onCallServices_items_refTeachers_items)
        - [16.1.7.1.1. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherId`](#onCallServices_items_refTeachers_items_teacherId)
        - [16.1.7.1.2. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > numOfSections`](#onCallServices_items_refTeachers_items_numOfSections)
        - [16.1.7.1.3. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate`](#onCallServices_items_refTeachers_items_teacherFrameTemplate)
          - [16.1.7.1.3.1. PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items)
            - [16.1.7.1.3.1.1. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > day`](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day)
            - [16.1.7.1.3.1.2. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > index`](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index)
            - [16.1.7.1.3.1.3. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > frame`](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame)
            - [16.1.7.1.3.1.4. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > type`](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type)
    - [16.1.8. Property `PlanningGhcData > onCallServices > OnCallService > refColourInResult`](#onCallServices_items_refColourInResult)
    - [16.1.9. Property `PlanningGhcData > onCallServices > OnCallService > frameTemplate`](#onCallServices_items_frameTemplate)
    - [16.1.10. Property `PlanningGhcData > onCallServices > OnCallService > refBuilding`](#onCallServices_items_refBuilding)
    - [16.1.11. Property `PlanningGhcData > onCallServices > OnCallService > settings`](#onCallServices_items_settings)
- [17. Property `PlanningGhcData > optimizationWeights`](#optimizationWeights)
  - [17.1. Property `PlanningGhcData > optimizationWeights > timetableGaps`](#optimizationWeights_timetableGaps)
    - [17.1.1. Property `PlanningGhcData > optimizationWeights > timetableGaps > groupGaps`](#optimizationWeights_timetableGaps_groupGaps)
    - [17.1.2. Property `PlanningGhcData > optimizationWeights > timetableGaps > teacherGaps`](#optimizationWeights_timetableGaps_teacherGaps)
  - [17.2. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions`](#optimizationWeights_nonPreferredPositions)
    - [17.2.1. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inGroups`](#optimizationWeights_nonPreferredPositions_inGroups)
    - [17.2.2. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inTeachers`](#optimizationWeights_nonPreferredPositions_inTeachers)
    - [17.2.3. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inSubjectsAndTask`](#optimizationWeights_nonPreferredPositions_inSubjectsAndTask)
    - [17.2.4. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inSessions`](#optimizationWeights_nonPreferredPositions_inSessions)
  - [17.3. Property `PlanningGhcData > optimizationWeights > sessions`](#optimizationWeights_sessions)
    - [17.3.1. Property `PlanningGhcData > optimizationWeights > sessions > nonPreferredClassRoom`](#optimizationWeights_sessions_nonPreferredClassRoom)
    - [17.3.2. Property `PlanningGhcData > optimizationWeights > sessions > samePositionEveryPeriod`](#optimizationWeights_sessions_samePositionEveryPeriod)
    - [17.3.3. Property `PlanningGhcData > optimizationWeights > sessions > consecutiveDays`](#optimizationWeights_sessions_consecutiveDays)
    - [17.3.4. Property `PlanningGhcData > optimizationWeights > sessions > bordersTimetable`](#optimizationWeights_sessions_bordersTimetable)
    - [17.3.5. Property `PlanningGhcData > optimizationWeights > sessions > afternoonOrAfterBreakClasses`](#optimizationWeights_sessions_afternoonOrAfterBreakClasses)
    - [17.3.6. Property `PlanningGhcData > optimizationWeights > sessions > sameHourSessionClasses`](#optimizationWeights_sessions_sameHourSessionClasses)
    - [17.3.7. Property `PlanningGhcData > optimizationWeights > sessions > classRoomsChanges`](#optimizationWeights_sessions_classRoomsChanges)
  - [17.4. Property `PlanningGhcData > optimizationWeights > teachers`](#optimizationWeights_teachers)
    - [17.4.1. Property `PlanningGhcData > optimizationWeights > teachers > teacherIncompatibities`](#optimizationWeights_teachers_teacherIncompatibities)
    - [17.4.2. Property `PlanningGhcData > optimizationWeights > teachers > uniformDailyDistribution`](#optimizationWeights_teachers_uniformDailyDistribution)
    - [17.4.3. Property `PlanningGhcData > optimizationWeights > teachers > excessContinuousTeaching`](#optimizationWeights_teachers_excessContinuousTeaching)
    - [17.4.4. Property `PlanningGhcData > optimizationWeights > teachers > excessPermanence`](#optimizationWeights_teachers_excessPermanence)
    - [17.4.5. Property `PlanningGhcData > optimizationWeights > teachers > continuousSessionsWithGroup`](#optimizationWeights_teachers_continuousSessionsWithGroup)
    - [17.4.6. Property `PlanningGhcData > optimizationWeights > teachers > onCallSectionsOnBorders`](#optimizationWeights_teachers_onCallSectionsOnBorders)
    - [17.4.7. Property `PlanningGhcData > optimizationWeights > teachers > teacherOrder`](#optimizationWeights_teachers_teacherOrder)
- [18. Property `PlanningGhcData > engineSettings`](#engineSettings)
  - [18.1. Property `PlanningGhcData > engineSettings > teacherBalance`](#engineSettings_teacherBalance)
  - [18.2. Property `PlanningGhcData > engineSettings > countGapsAroundMidday`](#engineSettings_countGapsAroundMidday)

**Title:** PlanningGhcData

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Schema of the object that contains the timetable planning data.

| Property                                               | Pattern | Type            | Deprecated | Definition | Title/Description       |
| ------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | ----------------------- |
| - [periods](#periods )                                 | No      | object          | No         | -          | Periods                 |
| - [frames](#frames )                                   | No      | array of object | No         | -          | Frames                  |
| - [buildings](#buildings )                             | No      | array of object | No         | -          | Buildings               |
| - [classRooms](#classRooms )                           | No      | array of object | No         | -          | ClassRooms              |
| - [classRoomsSets](#classRoomsSets )                   | No      | array of object | No         | -          | ClassRoomsSets          |
| - [tasks](#tasks )                                     | No      | array of object | No         | -          | Tasks                   |
| - [teachers](#teachers )                               | No      | array of object | No         | -          | Teachers                |
| - [subjects](#subjects )                               | No      | array of object | No         | -          | Subjects                |
| - [groups](#groups )                                   | No      | array of object | No         | -          | Groups                  |
| - [groupSetRelations](#groupSetRelations )             | No      | array           | No         | -          | GroupSetRelations       |
| - [courses](#courses )                                 | No      | array of object | No         | -          | Courses                 |
| - [departments](#departments )                         | No      | array of object | No         | -          | Departments             |
| - [sessions](#sessions )                               | No      | array of object | No         | -          | Sessions                |
| - [meetings](#meetings )                               | No      | array of object | No         | -          | Meetings                |
| - [complementaryActivities](#complementaryActivities ) | No      | array of object | No         | -          | ComplementaryActivities |
| - [onCallServices](#onCallServices )                   | No      | array of object | No         | -          | OnCallServices          |
| - [optimizationWeights](#optimizationWeights )         | No      | object          | No         | -          | OptimizationWeights     |
| - [engineSettings](#engineSettings )                   | No      | object          | No         | -          | EngineSettings          |

## <a name="periods"></a>1. Property `PlanningGhcData > periods`

**Title:** Periods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Weeks or periods with different assignments which contains the timetable.

| Property                                       | Pattern | Type            | Deprecated | Definition | Title/Description |
| ---------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------- |
| - [followedPeriods](#periods_followedPeriods ) | No      | boolean         | No         | -          | FollowedPeriods   |
| + [periodsList](#periods_periodsList )         | No      | array of object | No         | -          | PeriodsList       |
| - [periodsSets](#periods_periodsSets )         | No      | array of object | No         | -          | PeriodsSets       |

### <a name="periods_followedPeriods"></a>1.1. Property `PlanningGhcData > periods > followedPeriods`

**Title:** FollowedPeriods

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.

### <a name="periods_periodsList"></a>1.2. Property `PlanningGhcData > periods > periodsList`

**Title:** PeriodsList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of periods.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be      | Description |
| ------------------------------------ | ----------- |
| [Period](#periods_periodsList_items) | -           |

#### <a name="periods_periodsList_items"></a>1.2.1. PlanningGhcData > periods > periodsList > Period

**Title:** Period

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                               | Pattern | Type            | Deprecated | Definition | Title/Description                                                                                                                                                                              |
| ------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#periods_periodsList_items_id )                 | No      | string          | No         | -          | Period identifier.                                                                                                                                                                             |
| - [alias](#periods_periodsList_items_alias )           | No      | string          | No         | -          | Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to. |
| + [lastDay](#periods_periodsList_items_lastDay )       | No      | integer         | No         | -          | The end day of the period (included).                                                                                                                                                          |
| - [dayAliases](#periods_periodsList_items_dayAliases ) | No      | array of object | No         | -          | AliasDayList                                                                                                                                                                                   |

##### <a name="periods_periodsList_items_id"></a>1.2.1.1. Property `PlanningGhcData > periods > periodsList > Period > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Period identifier.

##### <a name="periods_periodsList_items_alias"></a>1.2.1.2. Property `PlanningGhcData > periods > periodsList > Period > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to.

##### <a name="periods_periodsList_items_lastDay"></a>1.2.1.3. Property `PlanningGhcData > periods > periodsList > Period > lastDay`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** The end day of the period (included).

##### <a name="periods_periodsList_items_dayAliases"></a>1.2.1.4. Property `PlanningGhcData > periods > periodsList > Period > dayAliases`

**Title:** AliasDayList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Alias for each day of the period. It is an optional definition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                    | Description |
| ------------------------------------------------------------------ | ----------- |
| [AliasDayDeifinition](#periods_periodsList_items_dayAliases_items) | -           |

###### <a name="periods_periodsList_items_dayAliases_items"></a>1.2.1.4.1. PlanningGhcData > periods > periodsList > Period > dayAliases > AliasDayDeifinition

**Title:** AliasDayDeifinition

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                      | Pattern | Type    | Deprecated | Definition | Title/Description                                                     |
| ------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------- |
| + [dayId](#periods_periodsList_items_dayAliases_items_dayId ) | No      | integer | No         | -          | Identifier of the day of the week, it is unique across all weeks.     |
| + [alias](#periods_periodsList_items_dayAliases_items_alias ) | No      | string  | No         | -          | Header to identify the day in the results table and the frame column. |

###### <a name="periods_periodsList_items_dayAliases_items_dayId"></a>1.2.1.4.1.1. Property `PlanningGhcData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > dayId`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Identifier of the day of the week, it is unique across all weeks.

###### <a name="periods_periodsList_items_dayAliases_items_alias"></a>1.2.1.4.1.2. Property `PlanningGhcData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Header to identify the day in the results table and the frame column.

### <a name="periods_periodsSets"></a>1.3. Property `PlanningGhcData > periods > periodsSets`

**Title:** PeriodsSets

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of sets of periods, which are groupings of multiple periods to make it easier to assign periods to sessions in batches, and many of them overlap by sharing several weeks in common.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be          | Description |
| ---------------------------------------- | ----------- |
| [PeriodsSet](#periods_periodsSets_items) | -           |

#### <a name="periods_periodsSets_items"></a>1.3.1. PlanningGhcData > periods > periodsSets > PeriodsSet

**Title:** PeriodsSet

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                               | Pattern | Type            | Deprecated | Definition | Title/Description                                        |
| ------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | -------------------------------------------------------- |
| + [id](#periods_periodsSets_items_id )                 | No      | string          | No         | -          | Period identifier.                                       |
| + [periodList](#periods_periodsSets_items_periodList ) | No      | array of string | No         | -          | List of identifiers of the weeks that belong to the set. |

##### <a name="periods_periodsSets_items_id"></a>1.3.1.1. Property `PlanningGhcData > periods > periodsSets > PeriodsSet > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Period identifier.

##### <a name="periods_periodsSets_items_periodList"></a>1.3.1.2. Property `PlanningGhcData > periods > periodsSets > PeriodsSet > periodList`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** List of identifiers of the weeks that belong to the set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                 | Description |
| --------------------------------------------------------------- | ----------- |
| [periodList items](#periods_periodsSets_items_periodList_items) | -           |

###### <a name="periods_periodsSets_items_periodList_items"></a>1.3.1.2.1. PlanningGhcData > periods > periodsSets > PeriodsSet > periodList > periodList items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

## <a name="frames"></a>2. Property `PlanningGhcData > frames`

**Title:** Frames

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Tables of the timetable that contain sections where the class units are located.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description |
| ------------------------------- | ----------- |
| [Frame](#frames_items)          | -           |

### <a name="frames_items"></a>2.1. PlanningGhcData > frames > Frame

**Title:** Frame

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                        | Pattern | Type            | Deprecated | Definition | Title/Description          |
| ------------------------------- | ------- | --------------- | ---------- | ---------- | -------------------------- |
| + [id](#frames_items_id )       | No      | string          | No         | -          | Frame identifier.          |
| - [exKey](#frames_items_exKey ) | No      | string          | No         | -          | External key of the frame. |
| + [days](#frames_items_days )   | No      | array of object | No         | -          | Days                       |

#### <a name="frames_items_id"></a>2.1.1. Property `PlanningGhcData > frames > Frame > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

#### <a name="frames_items_exKey"></a>2.1.2. Property `PlanningGhcData > frames > Frame > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the frame.

#### <a name="frames_items_days"></a>2.1.3. Property `PlanningGhcData > frames > Frame > days`

**Title:** Days

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of the days in the frame

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be      | Description            |
| ------------------------------------ | ---------------------- |
| [FrameDay](#frames_items_days_items) | Day with its sections. |

##### <a name="frames_items_days_items"></a>2.1.3.1. PlanningGhcData > frames > Frame > days > FrameDay

**Title:** FrameDay

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Day with its sections.

| Property                                         | Pattern | Type            | Deprecated | Definition | Title/Description |
| ------------------------------------------------ | ------- | --------------- | ---------- | ---------- | ----------------- |
| + [day](#frames_items_days_items_day )           | No      | integer         | No         | -          | Day of the week.  |
| + [sections](#frames_items_days_items_sections ) | No      | array of object | No         | -          | Sections          |

###### <a name="frames_items_days_items_day"></a>2.1.3.1.1. Property `PlanningGhcData > frames > Frame > days > FrameDay > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week.

###### <a name="frames_items_days_items_sections"></a>2.1.3.1.2. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections`

**Title:** Sections

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** Timetable cells where class units are located.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                    | Description |
| -------------------------------------------------- | ----------- |
| [Section](#frames_items_days_items_sections_items) | -           |

###### <a name="frames_items_days_items_sections_items"></a>2.1.3.1.2.1. PlanningGhcData > frames > Frame > days > FrameDay > sections > Section

**Title:** Section

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                          | Pattern | Type             | Deprecated | Definition | Title/Description                                                           |
| ----------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------------------- |
| + [index](#frames_items_days_items_sections_items_index )         | No      | integer          | No         | -          | Index built into the day where the section is located.                      |
| + [entryTime](#frames_items_days_items_sections_items_entryTime ) | No      | string           | No         | -          | Start time of the section.                                                  |
| + [exitTime](#frames_items_days_items_sections_items_exitTime )   | No      | string           | No         | -          | End time of the section.                                                    |
| - [exKey](#frames_items_days_items_sections_items_exKey )         | No      | string           | No         | -          | External key of the section.                                                |
| + [duration](#frames_items_days_items_sections_items_duration )   | No      | integer          | No         | -          | It indicates the duration (real or proportional) of the section in minutes. |
| + [type](#frames_items_days_items_sections_items_type )           | No      | enum (of string) | No         | -          | SectionType                                                                 |
| - [allowed](#frames_items_days_items_sections_items_allowed )     | No      | boolean          | No         | -          | It indicates if the section is available to assign.                         |

###### <a name="frames_items_days_items_sections_items_index"></a>2.1.3.1.2.1.1. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="frames_items_days_items_sections_items_entryTime"></a>2.1.3.1.2.1.2. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > entryTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** Start time of the section.

###### <a name="frames_items_days_items_sections_items_exitTime"></a>2.1.3.1.2.1.3. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > exitTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** End time of the section.

###### <a name="frames_items_days_items_sections_items_exKey"></a>2.1.3.1.2.1.4. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the section.

###### <a name="frames_items_days_items_sections_items_duration"></a>2.1.3.1.2.1.5. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > duration`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** It indicates the duration (real or proportional) of the section in minutes.

###### <a name="frames_items_days_items_sections_items_type"></a>2.1.3.1.2.1.6. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > type`

**Title:** SectionType

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Kind of section.

Must be one of:
* "teaching"
* "break"
* "midday"

###### <a name="frames_items_days_items_sections_items_allowed"></a>2.1.3.1.2.1.7. Property `PlanningGhcData > frames > Frame > days > FrameDay > sections > Section > allowed`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates if the section is available to assign.

## <a name="buildings"></a>3. Property `PlanningGhcData > buildings`

**Title:** Buildings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains the school or educational institution buildings.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description |
| ------------------------------- | ----------- |
| [Building](#buildings_items)    | -           |

### <a name="buildings_items"></a>3.1. PlanningGhcData > buildings > Building

**Title:** Building

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                   | Pattern | Type            | Deprecated | Definition | Title/Description    |
| ------------------------------------------ | ------- | --------------- | ---------- | ---------- | -------------------- |
| + [id](#buildings_items_id )               | No      | string          | No         | -          | Building identifier. |
| - [fullName](#buildings_items_fullName )   | No      | string          | No         | -          | Building full name.  |
| - [distances](#buildings_items_distances ) | No      | array of object | No         | -          | Distances            |

#### <a name="buildings_items_id"></a>3.1.1. Property `PlanningGhcData > buildings > Building > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Building identifier.

#### <a name="buildings_items_fullName"></a>3.1.2. Property `PlanningGhcData > buildings > Building > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building full name.

#### <a name="buildings_items_distances"></a>3.1.3. Property `PlanningGhcData > buildings > Building > distances`

**Title:** Distances

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Distance in minutes to another school building.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be              | Description |
| -------------------------------------------- | ----------- |
| [Distance](#buildings_items_distances_items) | -           |

##### <a name="buildings_items_distances_items"></a>3.1.3.1. PlanningGhcData > buildings > Building > distances > Distance

**Title:** Distance

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                       | Pattern | Type    | Deprecated | Definition | Title/Description                                               |
| -------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------- |
| + [refBuilding](#buildings_items_distances_items_refBuilding ) | No      | string  | No         | -          | Identifier of the other building that refers to the distance.   |
| + [minutes](#buildings_items_distances_items_minutes )         | No      | integer | No         | -          | Distance in minutes from the building of the referred building. |

###### <a name="buildings_items_distances_items_refBuilding"></a>3.1.3.1.1. Property `PlanningGhcData > buildings > Building > distances > Distance > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the other building that refers to the distance.

###### <a name="buildings_items_distances_items_minutes"></a>3.1.3.1.2. Property `PlanningGhcData > buildings > Building > distances > Distance > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Distance in minutes from the building of the referred building.

## <a name="classRooms"></a>4. Property `PlanningGhcData > classRooms`

**Title:** ClassRooms

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains the classrooms to organize the class units.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description |
| ------------------------------- | ----------- |
| [Classroom](#classRooms_items)  | -           |

### <a name="classRooms_items"></a>4.1. PlanningGhcData > classRooms > Classroom

**Title:** Classroom

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                            | Pattern | Type            | Deprecated | Definition | Title/Description                                                                               |
| --------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------------------------------------------------------------------------------------- |
| + [id](#classRooms_items_id )                       | No      | string          | No         | -          | Identifier name of the classroom.                                                               |
| - [shortName](#classRooms_items_shortName )         | No      | string          | No         | -          | Short name of the classroom                                                                     |
| - [fullName](#classRooms_items_fullName )           | No      | string          | No         | -          | Complete name of the classroom.                                                                 |
| - [isDedicated](#classRooms_items_isDedicated )     | No      | boolean         | No         | -          | Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom |
| - [exKey](#classRooms_items_exKey )                 | No      | string          | No         | -          | External key of the classroom                                                                   |
| - [capacity](#classRooms_items_capacity )           | No      | integer         | No         | -          | The maximum number of students the classroom can hold.                                          |
| - [frameTemplate](#classRooms_items_frameTemplate ) | No      | array of object | No         | -          | BannedFrameTemplate                                                                             |
| - [refBuilding](#classRooms_items_refBuilding )     | No      | string          | No         | -          | Building identifier where the class is located.                                                 |
| - [fullDay](#classRooms_items_fullDay )             | No      | boolean         | No         | -          | This indicates whether the classroom should be booked all day after holding a subject.          |

#### <a name="classRooms_items_id"></a>4.1.1. Property `PlanningGhcData > classRooms > Classroom > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the classroom.

#### <a name="classRooms_items_shortName"></a>4.1.2. Property `PlanningGhcData > classRooms > Classroom > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the classroom

#### <a name="classRooms_items_fullName"></a>4.1.3. Property `PlanningGhcData > classRooms > Classroom > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the classroom.

#### <a name="classRooms_items_isDedicated"></a>4.1.4. Property `PlanningGhcData > classRooms > Classroom > isDedicated`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom

#### <a name="classRooms_items_exKey"></a>4.1.5. Property `PlanningGhcData > classRooms > Classroom > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the classroom

#### <a name="classRooms_items_capacity"></a>4.1.6. Property `PlanningGhcData > classRooms > Classroom > capacity`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** The maximum number of students the classroom can hold.

#### <a name="classRooms_items_frameTemplate"></a>4.1.7. Property `PlanningGhcData > classRooms > Classroom > frameTemplate`

**Title:** BannedFrameTemplate

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Template with only banned preferences.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                  | Description                                              |
| ---------------------------------------------------------------- | -------------------------------------------------------- |
| [BannedSectionPreference](#classRooms_items_frameTemplate_items) | Template with only banned section assignment preference. |

##### <a name="classRooms_items_frameTemplate_items"></a>4.1.7.1. PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference

**Title:** BannedSectionPreference

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Template with only banned section assignment preference.

| Property                                                | Pattern | Type    | Deprecated | Definition | Title/Description                                      |
| ------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------ |
| + [day](#classRooms_items_frameTemplate_items_day )     | No      | integer | No         | -          | Day of the week when the section is located.           |
| + [index](#classRooms_items_frameTemplate_items_index ) | No      | integer | No         | -          | Index built into the day where the section is located. |
| + [frame](#classRooms_items_frameTemplate_items_frame ) | No      | string  | No         | -          | Frame identifier.                                      |

###### <a name="classRooms_items_frameTemplate_items_day"></a>4.1.7.1.1. Property `PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="classRooms_items_frameTemplate_items_index"></a>4.1.7.1.2. Property `PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="classRooms_items_frameTemplate_items_frame"></a>4.1.7.1.3. Property `PlanningGhcData > classRooms > Classroom > frameTemplate > BannedSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

#### <a name="classRooms_items_refBuilding"></a>4.1.8. Property `PlanningGhcData > classRooms > Classroom > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier where the class is located.

#### <a name="classRooms_items_fullDay"></a>4.1.9. Property `PlanningGhcData > classRooms > Classroom > fullDay`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** This indicates whether the classroom should be booked all day after holding a subject.

## <a name="classRoomsSets"></a>5. Property `PlanningGhcData > classRoomsSets`

**Title:** ClassRoomsSets

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** A division of the classrooms, grouped by organizational characteristics or needs.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be       | Description |
| ------------------------------------- | ----------- |
| [ClassRoomSet](#classRoomsSets_items) | -           |

### <a name="classRoomsSets_items"></a>5.1. PlanningGhcData > classRoomsSets > ClassRoomSet

**Title:** ClassRoomSet

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                  | Pattern | Type            | Deprecated | Definition | Title/Description                                                  |
| --------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------------------------------------------ |
| + [id](#classRoomsSets_items_id )                         | No      | string          | No         | -          | ClassRooms group identifier.                                       |
| + [rooms](#classRoomsSets_items_rooms )                   | No      | array of string | No         | -          | ClassRoomEntries                                                   |
| - [anonymousRooms](#classRoomsSets_items_anonymousRooms ) | No      | integer         | No         | -          | Number of non-specific defined classrooms that the group contains. |

#### <a name="classRoomsSets_items_id"></a>5.1.1. Property `PlanningGhcData > classRoomsSets > ClassRoomSet > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** ClassRooms group identifier.

#### <a name="classRoomsSets_items_rooms"></a>5.1.2. Property `PlanningGhcData > classRoomsSets > ClassRoomSet > rooms`

**Title:** ClassRoomEntries

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** Classrooms identifiers which contain the group.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                   | Description           |
| ------------------------------------------------- | --------------------- |
| [ClassRoomRef](#classRoomsSets_items_rooms_items) | Classroom identifier. |

##### <a name="classRoomsSets_items_rooms_items"></a>5.1.2.1. PlanningGhcData > classRoomsSets > ClassRoomSet > rooms > ClassRoomRef

**Title:** ClassRoomRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom identifier.

#### <a name="classRoomsSets_items_anonymousRooms"></a>5.1.3. Property `PlanningGhcData > classRoomsSets > ClassRoomSet > anonymousRooms`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of non-specific defined classrooms that the group contains.

## <a name="tasks"></a>6. Property `PlanningGhcData > tasks`

**Title:** Tasks

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Types of tasks or activities for the teachers.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description            |
| ------------------------------- | ---------------------- |
| [Task](#tasks_items)            | Teacher activity type. |

### <a name="tasks_items"></a>6.1. PlanningGhcData > tasks > Task

**Title:** Task

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher activity type.

| Property                                               | Pattern | Type            | Deprecated | Definition               | Title/Description                                     |
| ------------------------------------------------------ | ------- | --------------- | ---------- | ------------------------ | ----------------------------------------------------- |
| + [id](#tasks_items_id )                               | No      | string          | No         | -                        | Task identifier.                                      |
| - [frameTemplate](#tasks_items_frameTemplate )         | No      | array of object | No         | In #/$defs/frameTemplate | FrameTemplate                                         |
| - [fullName](#tasks_items_fullName )                   | No      | string          | No         | -                        | Complete name of the task.                            |
| - [exKey](#tasks_items_exKey )                         | No      | string          | No         | -                        | External key of the task                              |
| - [refColourInResult](#tasks_items_refColourInResult ) | No      | string          | No         | -                        | Colour code used to represent the task in the result. |

#### <a name="tasks_items_id"></a>6.1.1. Property `PlanningGhcData > tasks > Task > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

#### <a name="tasks_items_frameTemplate"></a>6.1.2. Property `PlanningGhcData > tasks > Task > frameTemplate`

**Title:** FrameTemplate

|                |                       |
| -------------- | --------------------- |
| **Type**       | `array of object`     |
| **Required**   | No                    |
| **Defined in** | #/$defs/frameTemplate |

**Description:** Templates with frame sections assignment preferences.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                       | Description                                    |
| ----------------------------------------------------- | ---------------------------------------------- |
| [SectionPreference](#tasks_items_frameTemplate_items) | Template with a section assignment preference. |

##### <a name="tasks_items_frameTemplate_items"></a>6.1.2.1. PlanningGhcData > tasks > Task > frameTemplate > SectionPreference

**Title:** SectionPreference

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Template with a section assignment preference.

| Property                                           | Pattern | Type             | Deprecated | Definition | Title/Description                                  |
| -------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | -------------------------------------------------- |
| + [day](#tasks_items_frameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when is located the section.       |
| + [index](#tasks_items_frameTemplate_items_index ) | No      | integer          | No         | -          | Index inside the day where is located the section. |
| + [frame](#tasks_items_frameTemplate_items_frame ) | No      | string           | No         | -          | Identifier name of the frame.                      |
| + [type](#tasks_items_frameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeWithOutPreset                 |

###### <a name="tasks_items_frameTemplate_items_day"></a>6.1.2.1.1. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when is located the section.

###### <a name="tasks_items_frameTemplate_items_index"></a>6.1.2.1.2. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index inside the day where is located the section.

###### <a name="tasks_items_frameTemplate_items_frame"></a>6.1.2.1.3. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the frame.

###### <a name="tasks_items_frameTemplate_items_type"></a>6.1.2.1.4. Property `PlanningGhcData > tasks > Task > frameTemplate > SectionPreference > type`

**Title:** SectionPreferenceTypeWithOutPreset

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Element availability to be assigned to the section.

Must be one of:
* "banned"
* "strong-non-preferred"
* "weak-non-preferred"

#### <a name="tasks_items_fullName"></a>6.1.3. Property `PlanningGhcData > tasks > Task > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the task.

#### <a name="tasks_items_exKey"></a>6.1.4. Property `PlanningGhcData > tasks > Task > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the task

#### <a name="tasks_items_refColourInResult"></a>6.1.5. Property `PlanningGhcData > tasks > Task > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the task in the result.

## <a name="teachers"></a>7. Property `PlanningGhcData > teachers`

**Title:** Teachers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Teachers list of the timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description                                                 |
| ------------------------------- | ----------------------------------------------------------- |
| [Teacher](#teachers_items)      | Object with personal information and teachers' preferences. |

### <a name="teachers_items"></a>7.1. PlanningGhcData > teachers > Teacher

**Title:** Teacher

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Object with personal information and teachers' preferences.

| Property                                                          | Pattern | Type            | Deprecated | Definition                                           | Title/Description                                                                                                                                    |
| ----------------------------------------------------------------- | ------- | --------------- | ---------- | ---------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#teachers_items_id )                                       | No      | string          | No         | -                                                    | Identifier of the teacher.                                                                                                                           |
| - [shortName](#teachers_items_shortName )                         | No      | string          | No         | -                                                    | Short name of the teacher.                                                                                                                           |
| - [fullName](#teachers_items_fullName )                           | No      | string          | No         | -                                                    | Complete name of the teacher.                                                                                                                        |
| - [exKey](#teachers_items_exKey )                                 | No      | string          | No         | -                                                    | External key of the teacher                                                                                                                          |
| - [associationIdentifier](#teachers_items_associationIdentifier ) | No      | string          | No         | -                                                    | Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport. |
| - [overlappedAssessment](#teachers_items_overlappedAssessment )   | No      | integer         | No         | -                                                    | Number of overlapped evaluation sessions.                                                                                                            |
| - [frameTemplate](#teachers_items_frameTemplate )                 | No      | array of object | No         | Same as [frameTemplate](#tasks_items_frameTemplate ) | FrameTemplate                                                                                                                                        |
| - [generalSettings](#teachers_items_generalSettings )             | No      | object          | No         | -                                                    | GeneralSettings                                                                                                                                      |
| - [periodsSettings](#teachers_items_periodsSettings )             | No      | array of object | No         | -                                                    | PeriodsSettings                                                                                                                                      |

#### <a name="teachers_items_id"></a>7.1.1. Property `PlanningGhcData > teachers > Teacher > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the teacher.

#### <a name="teachers_items_shortName"></a>7.1.2. Property `PlanningGhcData > teachers > Teacher > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the teacher.

#### <a name="teachers_items_fullName"></a>7.1.3. Property `PlanningGhcData > teachers > Teacher > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the teacher.

#### <a name="teachers_items_exKey"></a>7.1.4. Property `PlanningGhcData > teachers > Teacher > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the teacher

#### <a name="teachers_items_associationIdentifier"></a>7.1.5. Property `PlanningGhcData > teachers > Teacher > associationIdentifier`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.

#### <a name="teachers_items_overlappedAssessment"></a>7.1.6. Property `PlanningGhcData > teachers > Teacher > overlappedAssessment`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** Number of overlapped evaluation sessions.

| Restrictions |        |
| ------------ | ------ |
| **Minimum**  | &ge; 1 |

#### <a name="teachers_items_frameTemplate"></a>7.1.7. Property `PlanningGhcData > teachers > Teacher > frameTemplate`

**Title:** FrameTemplate

|                        |                                             |
| ---------------------- | ------------------------------------------- |
| **Type**               | `array of object`                           |
| **Required**           | No                                          |
| **Same definition as** | [frameTemplate](#tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

#### <a name="teachers_items_generalSettings"></a>7.1.8. Property `PlanningGhcData > teachers > Teacher > generalSettings`

**Title:** GeneralSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.

| Property                                                                              | Pattern | Type             | Deprecated | Definition                         | Title/Description                                                                                               |
| ------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| - [weeklyStay](#teachers_items_generalSettings_weeklyStay )                           | No      | object           | No         | In #/$defs/weeklyStay              | WeeklyStay                                                                                                      |
| - [dailyStay](#teachers_items_generalSettings_dailyStay )                             | No      | object           | No         | In #/$defs/dailyStay               | DailyStay                                                                                                       |
| - [avoidGapsBetweenSesions](#teachers_items_generalSettings_avoidGapsBetweenSesions ) | No      | boolean          | No         | In #/$defs/avoidGapsBetweenSesions | It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition. |
| - [maxContinuousTeaching](#teachers_items_generalSettings_maxContinuousTeaching )     | No      | object           | No         | In #/$defs/maxContinuousTeaching   | MaxContinuousTeaching                                                                                           |
| - [avoidClassesAroundBreak](#teachers_items_generalSettings_avoidClassesAroundBreak ) | No      | enum (of string) | No         | In #/$defs/avoidClassesAroundBreak | ConditionType                                                                                                   |
| - [freeTimes](#teachers_items_generalSettings_freeTimes )                             | No      | object           | No         | In #/$defs/freeTimes               | FreeTimes                                                                                                       |
| - [freePartTimes](#teachers_items_generalSettings_freePartTimes )                     | No      | object           | No         | In #/$defs/freePartTimes           | FreePartTime                                                                                                    |
| - [incompatibilities](#teachers_items_generalSettings_incompatibilities )             | No      | object           | No         | In #/$defs/incompatibilities       | Incompatibilities                                                                                               |
| - [dailyOcupation](#teachers_items_generalSettings_dailyOcupation )                   | No      | object           | No         | In #/$defs/dailyOcupation          | DailyOcupation                                                                                                  |
| - [middayReference](#teachers_items_generalSettings_middayReference )                 | No      | object           | No         | In #/$defs/middayReference         | MiddayReference                                                                                                 |
| - [dailyBuildingTransfers](#teachers_items_generalSettings_dailyBuildingTransfers )   | No      | object           | No         | In #/$defs/dailyBuildingTransfers  | DailyBuildingTransfers                                                                                          |

##### <a name="teachers_items_generalSettings_weeklyStay"></a>7.1.8.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay`

**Title:** WeeklyStay

|                           |                    |
| ------------------------- | ------------------ |
| **Type**                  | `object`           |
| **Required**              | No                 |
| **Additional properties** | Not allowed        |
| **Defined in**            | #/$defs/weeklyStay |

**Description:** It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

| Property                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                            |
| ------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| - [strict](#teachers_items_generalSettings_weeklyStay_strict )                       | No      | integer | No         | -          | Strict time in minutes of maximum weekly stay.                                                                                               |
| - [preferable](#teachers_items_generalSettings_weeklyStay_preferable )               | No      | integer | No         | -          | Ponderable Time in minutes of maximum weeekly stay.                                                                                          |
| - [countAroundMidday](#teachers_items_generalSettings_weeklyStay_countAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day. |

###### <a name="teachers_items_generalSettings_weeklyStay_strict"></a>7.1.8.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict time in minutes of maximum weekly stay.

###### <a name="teachers_items_generalSettings_weeklyStay_preferable"></a>7.1.8.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Ponderable Time in minutes of maximum weeekly stay.

###### <a name="teachers_items_generalSettings_weeklyStay_countAroundMidday"></a>7.1.8.1.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > weeklyStay > countAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

##### <a name="teachers_items_generalSettings_dailyStay"></a>7.1.8.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay`

**Title:** DailyStay

|                           |                   |
| ------------------------- | ----------------- |
| **Type**                  | `object`          |
| **Required**              | No                |
| **Additional properties** | Not allowed       |
| **Defined in**            | #/$defs/dailyStay |

**Description:** This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.

| Property                                                                            | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                            |
| ----------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| - [strict](#teachers_items_generalSettings_dailyStay_strict )                       | No      | integer | No         | -          | Strict time in minutes of maximum daily stay.                                                                                                |
| - [preferable](#teachers_items_generalSettings_dailyStay_preferable )               | No      | integer | No         | -          | Ponderable Time in minutes of maximum daily stay.                                                                                            |
| - [countAroundMidday](#teachers_items_generalSettings_dailyStay_countAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day. |

###### <a name="teachers_items_generalSettings_dailyStay_strict"></a>7.1.8.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict time in minutes of maximum daily stay.

###### <a name="teachers_items_generalSettings_dailyStay_preferable"></a>7.1.8.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Ponderable Time in minutes of maximum daily stay.

###### <a name="teachers_items_generalSettings_dailyStay_countAroundMidday"></a>7.1.8.2.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyStay > countAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

##### <a name="teachers_items_generalSettings_avoidGapsBetweenSesions"></a>7.1.8.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > avoidGapsBetweenSesions`

|                |                                 |
| -------------- | ------------------------------- |
| **Type**       | `boolean`                       |
| **Required**   | No                              |
| **Default**    | `true`                          |
| **Defined in** | #/$defs/avoidGapsBetweenSesions |

**Description:** It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.

##### <a name="teachers_items_generalSettings_maxContinuousTeaching"></a>7.1.8.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching`

**Title:** MaxContinuousTeaching

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Not allowed                   |
| **Defined in**            | #/$defs/maxContinuousTeaching |

**Description:** It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

| Property                                                                      | Pattern | Type             | Deprecated | Definition               | Title/Description                                  |
| ----------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------ | -------------------------------------------------- |
| - [type](#teachers_items_generalSettings_maxContinuousTeaching_type )         | No      | enum (of string) | No         | In #/$defs/conditionType | ConditionType                                      |
| - [minutes](#teachers_items_generalSettings_maxContinuousTeaching_minutes )   | No      | integer          | No         | -                        | Maximum continuous teaching time in minutes.       |
| - [minBreak](#teachers_items_generalSettings_maxContinuousTeaching_minBreak ) | No      | integer          | No         | -                        | Minimum time period to be considered as break time |

###### <a name="teachers_items_generalSettings_maxContinuousTeaching_type"></a>7.1.8.4.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching > type`

**Title:** ConditionType

|                |                       |
| -------------- | --------------------- |
| **Type**       | `enum (of string)`    |
| **Required**   | No                    |
| **Defined in** | #/$defs/conditionType |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="teachers_items_generalSettings_maxContinuousTeaching_minutes"></a>7.1.8.4.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum continuous teaching time in minutes.

###### <a name="teachers_items_generalSettings_maxContinuousTeaching_minBreak"></a>7.1.8.4.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > maxContinuousTeaching > minBreak`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Minimum time period to be considered as break time

##### <a name="teachers_items_generalSettings_avoidClassesAroundBreak"></a>7.1.8.5. Property `PlanningGhcData > teachers > Teacher > generalSettings > avoidClassesAroundBreak`

**Title:** ConditionType

|                |                                 |
| -------------- | ------------------------------- |
| **Type**       | `enum (of string)`              |
| **Required**   | No                              |
| **Default**    | `"ignore"`                      |
| **Defined in** | #/$defs/avoidClassesAroundBreak |

**Description:** It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised or forbidden.

Must be one of:
* "ignore"
* "avoid"
* "strict"

##### <a name="teachers_items_generalSettings_freeTimes"></a>7.1.8.6. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes`

**Title:** FreeTimes

|                           |                   |
| ------------------------- | ----------------- |
| **Type**                  | `object`          |
| **Required**              | No                |
| **Additional properties** | Not allowed       |
| **Defined in**            | #/$defs/freeTimes |

**Description:** It contains the free time spaces that the teacher must have.

| Property                                                                              | Pattern | Type   | Deprecated | Definition | Title/Description           |
| ------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | --------------------------- |
| - [fullDay](#teachers_items_generalSettings_freeTimes_fullDay )                       | No      | object | No         | -          | FullDaysFreeTimes           |
| - [firstMinutes](#teachers_items_generalSettings_freeTimes_firstMinutes )             | No      | object | No         | -          | FirstMinutesFreeTimes       |
| - [lastMinutes](#teachers_items_generalSettings_freeTimes_lastMinutes )               | No      | object | No         | -          | LastMinutesFreeTimes        |
| - [consecutiveAnyTime](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime ) | No      | object | No         | -          | ConsecutiveAnyTimeFreeTimes |

###### <a name="teachers_items_generalSettings_freeTimes_fullDay"></a>7.1.8.6.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > fullDay`

**Title:** FullDaysFreeTimes

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher's full days of free time.

| Property                                                                            | Pattern | Type    | Deprecated | Definition | Title/Description                                     |
| ----------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------- |
| - [strictDays](#teachers_items_generalSettings_freeTimes_fullDay_strictDays )       | No      | integer | No         | -          | Number of strict days when teacher should be free.    |
| - [preferredDays](#teachers_items_generalSettings_freeTimes_fullDay_preferredDays ) | No      | integer | No         | -          | Number of preferred days when teacher should be free. |

###### <a name="teachers_items_generalSettings_freeTimes_fullDay_strictDays"></a>7.1.8.6.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > fullDay > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of strict days when teacher should be free.

###### <a name="teachers_items_generalSettings_freeTimes_fullDay_preferredDays"></a>7.1.8.6.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > fullDay > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of preferred days when teacher should be free.

###### <a name="teachers_items_generalSettings_freeTimes_firstMinutes"></a>7.1.8.6.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes`

**Title:** FirstMinutesFreeTimes

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher's free intervals at the beginning of the day.

| Property                                                                                 | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                        |
| ---------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------- |
| - [strictDays](#teachers_items_generalSettings_freeTimes_firstMinutes_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free at the beginning of the day.      |
| - [preferredDays](#teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free at the beginning of the day. |
| + [minutes](#teachers_items_generalSettings_freeTimes_firstMinutes_minutes )             | No      | integer | No         | -          | Minutes of free time at the beginning of the day.                                                        |

###### <a name="teachers_items_generalSettings_freeTimes_firstMinutes_strictDays"></a>7.1.8.6.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free at the beginning of the day.

###### <a name="teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays"></a>7.1.8.6.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free at the beginning of the day.

###### <a name="teachers_items_generalSettings_freeTimes_firstMinutes_minutes"></a>7.1.8.6.2.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time at the beginning of the day.

###### <a name="teachers_items_generalSettings_freeTimes_lastMinutes"></a>7.1.8.6.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes`

**Title:** LastMinutesFreeTimes

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher's free intervals at the end of the day.

| Property                                                                                | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                    |
| --------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------- |
| - [strictDays](#teachers_items_generalSettings_freeTimes_lastMinutes_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free at the end of the day.        |
| - [preferredDays](#teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free at the end of the day. . |
| + [minutes](#teachers_items_generalSettings_freeTimes_lastMinutes_minutes )             | No      | integer | No         | -          | Minutes of free time at the end of the day.                                                          |

###### <a name="teachers_items_generalSettings_freeTimes_lastMinutes_strictDays"></a>7.1.8.6.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free at the end of the day.

###### <a name="teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays"></a>7.1.8.6.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free at the end of the day. .

###### <a name="teachers_items_generalSettings_freeTimes_lastMinutes_minutes"></a>7.1.8.6.3.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time at the end of the day.

###### <a name="teachers_items_generalSettings_freeTimes_consecutiveAnyTime"></a>7.1.8.6.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime`

**Title:** ConsecutiveAnyTimeFreeTimes

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher's free intervals at any time of the day.

| Property                                                                                       | Pattern | Type    | Deprecated | Definition | Title/Description                                                             |
| ---------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------- |
| - [strictDays](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free.       |
| - [preferredDays](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free.  |
| + [minutes](#teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes )             | No      | integer | No         | -          | Minutes of free time interval.                                                |

###### <a name="teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays"></a>7.1.8.6.4.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free. 

###### <a name="teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays"></a>7.1.8.6.4.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free. 

###### <a name="teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes"></a>7.1.8.6.4.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time interval.

##### <a name="teachers_items_generalSettings_freePartTimes"></a>7.1.8.7. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes`

**Title:** FreePartTime

|                           |                       |
| ------------------------- | --------------------- |
| **Type**                  | `object`              |
| **Required**              | No                    |
| **Additional properties** | Not allowed           |
| **Defined in**            | #/$defs/freePartTimes |

**Description:** Free half-time periods .

| Property                                                                      | Pattern | Type   | Deprecated | Definition | Title/Description         |
| ----------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | ------------------------- |
| - [mornings](#teachers_items_generalSettings_freePartTimes_mornings )         | No      | object | No         | -          | MorningsFreePartTimes     |
| - [afternoons](#teachers_items_generalSettings_freePartTimes_afternoons )     | No      | object | No         | -          | AfternoonFreePartTimes    |
| - [indistinctly](#teachers_items_generalSettings_freePartTimes_indistinctly ) | No      | object | No         | -          | IndistinctlyFreePartTimes |

###### <a name="teachers_items_generalSettings_freePartTimes_mornings"></a>7.1.8.7.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > mornings`

**Title:** MorningsFreePartTimes

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Mornings off.

| Property                                                                           | Pattern | Type    | Deprecated | Definition | Title/Description                  |
| ---------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------- |
| - [strict](#teachers_items_generalSettings_freePartTimes_mornings_strict )         | No      | integer | No         | -          | Strict number of mornings off.     |
| - [preferable](#teachers_items_generalSettings_freePartTimes_mornings_preferable ) | No      | integer | No         | -          | Preferable number of mornings off. |

###### <a name="teachers_items_generalSettings_freePartTimes_mornings_strict"></a>7.1.8.7.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > mornings > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of mornings off.

###### <a name="teachers_items_generalSettings_freePartTimes_mornings_preferable"></a>7.1.8.7.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > mornings > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of mornings off.

###### <a name="teachers_items_generalSettings_freePartTimes_afternoons"></a>7.1.8.7.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > afternoons`

**Title:** AfternoonFreePartTimes

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Afternoons off.

| Property                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                    |
| ------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | ------------------------------------ |
| - [strict](#teachers_items_generalSettings_freePartTimes_afternoons_strict )         | No      | integer | No         | -          | Strict number of afternoons off..    |
| - [preferable](#teachers_items_generalSettings_freePartTimes_afternoons_preferable ) | No      | integer | No         | -          | Preferable number of afternoons off. |

###### <a name="teachers_items_generalSettings_freePartTimes_afternoons_strict"></a>7.1.8.7.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > afternoons > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of afternoons off..

###### <a name="teachers_items_generalSettings_freePartTimes_afternoons_preferable"></a>7.1.8.7.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > afternoons > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of afternoons off.

###### <a name="teachers_items_generalSettings_freePartTimes_indistinctly"></a>7.1.8.7.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > indistinctly`

**Title:** IndistinctlyFreePartTimes

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Free mornings or evenings indistinctly.

| Property                                                                               | Pattern | Type    | Deprecated | Definition | Title/Description                                             |
| -------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------- |
| - [strict](#teachers_items_generalSettings_freePartTimes_indistinctly_strict )         | No      | integer | No         | -          | Strict number of mornings or afternoons indistinctly off.     |
| - [preferable](#teachers_items_generalSettings_freePartTimes_indistinctly_preferable ) | No      | integer | No         | -          | Preferable number of mornings or afternoons indistinctly off. |

###### <a name="teachers_items_generalSettings_freePartTimes_indistinctly_strict"></a>7.1.8.7.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of mornings or afternoons indistinctly off.

###### <a name="teachers_items_generalSettings_freePartTimes_indistinctly_preferable"></a>7.1.8.7.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of mornings or afternoons indistinctly off.

##### <a name="teachers_items_generalSettings_incompatibilities"></a>7.1.8.8. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities`

**Title:** Incompatibilities

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Not allowed               |
| **Defined in**            | #/$defs/incompatibilities |

**Description:** It contains the teacher's incompatibilities on the allocation of class units and rest periods.

| Property                                                                                                                                                                                    | Pattern | Type             | Deprecated | Definition                       | Title/Description                                      |
| ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | -------------------------------- | ------------------------------------------------------ |
| - [freeTimeBetweenDayBeforeAndCurrent](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent )                                                               | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeBetweenDays                                    |
| - [freeTimeBetweenEndWeekAndStartWeekDays](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays )                                                       | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeBetweenWeeksBorders                            |
| - [freeTimeFirstOrLastHoursDay](#teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay )                                                                             | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeFirstOrLastHoursDay                            |
| - [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection ) | No      | enum (of string) | No         | -                                | DoNotFinishAtLastAfternoonSection                      |
| - [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection )         | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSection                        |
| - [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection )         | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon |
| - [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment )                     | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSectionIfHasAfternoon          |
| - [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment )                     | No      | enum (of string) | No         | -                                | DoNotStartAtFirstMorningSection                        |
| - [freeTimeAroundMidday](#teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday )                                                                                           | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeAroundMidday                                   |

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent"></a>7.1.8.8.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent`

**Title:** FreeTimeBetweenDays

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Not allowed                   |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes between departure and arrival of the following day.

| Property                                                                                                   | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                     |
| ---------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                           | Custom time in minutes for condition. |

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>7.1.8.8.1.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | Yes                                                                |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>7.1.8.8.1.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays"></a>7.1.8.8.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenEndWeekAndStartWeekDays`

**Title:** FreeTimeBetweenWeeksBorders

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Not allowed                   |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes between the end time of the last day of the week and the start time of the following week.

| Property                                                                                                   | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                     |
| ---------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                           | Custom time in minutes for condition. |

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>7.1.8.8.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | Yes                                                                |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>7.1.8.8.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay"></a>7.1.8.8.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeFirstOrLastHoursDay`

**Title:** FreeTimeFirstOrLastHoursDay

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Not allowed                   |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes of free time at first or last hours of the day.

| Property                                                                                                   | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                     |
| ---------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                           | Custom time in minutes for condition. |

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>7.1.8.8.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | Yes                                                                |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>7.1.8.8.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection"></a>7.1.8.8.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

**Title:** DoNotFinishAtLastAfternoonSection

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** o not finish at the last hour of the evening and start at the first.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection"></a>7.1.8.8.5. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

**Title:** DoNotFinishAtLastMorningSection

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not start at the first hour and finish at the last hour of the morning.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection"></a>7.1.8.8.6. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

**Title:** DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not finish at the last hour of the morning and start at the first hour of the evening.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment"></a>7.1.8.8.7. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

**Title:** DoNotFinishAtLastMorningSectionIfHasAfternoon

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not finish at the last hour in the morning and have the evening busy.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment"></a>7.1.8.8.8. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

**Title:** DoNotStartAtFirstMorningSection

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Do not start at the first hour and keep the evening busy.

Must be one of:
* "ignore"
* "avoid"
* "strict"

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday"></a>7.1.8.8.9. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeAroundMidday`

**Title:** FreeTimeAroundMidday

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Not allowed                   |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Do not have less than a custom free time around noon pause.

| Property                                                                                                   | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                     |
| ---------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                           | Custom time in minutes for condition. |

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>7.1.8.8.9.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | Yes                                                                |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>7.1.8.8.9.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

##### <a name="teachers_items_generalSettings_dailyOcupation"></a>7.1.8.9. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation`

**Title:** DailyOcupation

|                           |                        |
| ------------------------- | ---------------------- |
| **Type**                  | `object`               |
| **Required**              | No                     |
| **Additional properties** | Not allowed            |
| **Defined in**            | #/$defs/dailyOcupation |

**Description:** Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

| Property                                                                               | Pattern | Type    | Deprecated | Definition                   | Title/Description                                                                                                        |
| -------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| - [allowFreeDays](#teachers_items_generalSettings_dailyOcupation_allowFreeDays )       | No      | boolean | No         | -                            | It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked. |
| - [minimumTeaching](#teachers_items_generalSettings_dailyOcupation_minimumTeaching )   | No      | object  | No         | In #/$defs/conditionOcupancy | MinimumTeaching                                                                                                          |
| - [maximumTeaching](#teachers_items_generalSettings_dailyOcupation_maximumTeaching )   | No      | object  | No         | In #/$defs/conditionOcupancy | MaximumTeaching                                                                                                          |
| - [minimumOccupancy](#teachers_items_generalSettings_dailyOcupation_minimumOccupancy ) | No      | object  | No         | In #/$defs/conditionOcupancy | MinimumOccupancy                                                                                                         |
| - [maximumOccupancy](#teachers_items_generalSettings_dailyOcupation_maximumOccupancy ) | No      | object  | No         | In #/$defs/conditionOcupancy | MaximumOccupancy                                                                                                         |

###### <a name="teachers_items_generalSettings_dailyOcupation_allowFreeDays"></a>7.1.8.9.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > allowFreeDays`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching"></a>7.1.8.9.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching`

**Title:** MinimumTeaching

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Not allowed               |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Minimum teaching time of the teacher with students.

| Property                                                                                         | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                           | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                           | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                           | time in minutes you add to the assisted time so you generate the total time |

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>7.1.8.9.2.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | No                                                                 |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>7.1.8.9.2.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>7.1.8.9.2.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>7.1.8.9.2.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="teachers_items_generalSettings_dailyOcupation_maximumTeaching"></a>7.1.8.9.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > maximumTeaching`

**Title:** MaximumTeaching

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Not allowed               |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Maximun teaching time of the teacher with students.

| Property                                                                                         | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                           | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                           | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                           | time in minutes you add to the assisted time so you generate the total time |

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>7.1.8.9.3.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | No                                                                 |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>7.1.8.9.3.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>7.1.8.9.3.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>7.1.8.9.3.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumOccupancy"></a>7.1.8.9.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumOccupancy`

**Title:** MinimumOccupancy

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Not allowed               |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

| Property                                                                                         | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                           | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                           | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                           | time in minutes you add to the assisted time so you generate the total time |

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>7.1.8.9.4.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | No                                                                 |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>7.1.8.9.4.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>7.1.8.9.4.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>7.1.8.9.4.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="teachers_items_generalSettings_dailyOcupation_maximumOccupancy"></a>7.1.8.9.5. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > maximumOccupancy`

**Title:** MaximumOccupancy

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Not allowed               |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

| Property                                                                                         | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                           | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                           | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                           | time in minutes you add to the assisted time so you generate the total time |

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>7.1.8.9.5.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | No                                                                 |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>7.1.8.9.5.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>7.1.8.9.5.3. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>7.1.8.9.5.4. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

##### <a name="teachers_items_generalSettings_middayReference"></a>7.1.8.10. Property `PlanningGhcData > teachers > Teacher > generalSettings > middayReference`

**Title:** MiddayReference

|                           |                         |
| ------------------------- | ----------------------- |
| **Type**                  | `object`                |
| **Required**              | No                      |
| **Additional properties** | Not allowed             |
| **Defined in**            | #/$defs/middayReference |

**Description:** It indicate the frame where the teacher takes noon pause.

| Property                                                                | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                 |
| ----------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [refFrame](#teachers_items_generalSettings_middayReference_refFrame ) | No      | string  | No         | -          | Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.                        |
| - [strict](#teachers_items_generalSettings_middayReference_strict )     | No      | boolean | No         | -          | It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause. |

###### <a name="teachers_items_generalSettings_middayReference_refFrame"></a>7.1.8.10.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > middayReference > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.

###### <a name="teachers_items_generalSettings_middayReference_strict"></a>7.1.8.10.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > middayReference > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause.

##### <a name="teachers_items_generalSettings_dailyBuildingTransfers"></a>7.1.8.11. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyBuildingTransfers`

**Title:** DailyBuildingTransfers

|                           |                                |
| ------------------------- | ------------------------------ |
| **Type**                  | `object`                       |
| **Required**              | No                             |
| **Additional properties** | Not allowed                    |
| **Defined in**            | #/$defs/dailyBuildingTransfers |

**Description:** Maximum number of movements between buildings that the teacher can make per day.

| Property                                                                           | Pattern | Type    | Deprecated | Definition | Title/Description                                                   |
| ---------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------- |
| - [strict](#teachers_items_generalSettings_dailyBuildingTransfers_strict )         | No      | integer | No         | -          | Strict maximum number of movements per day.                         |
| - [preferable](#teachers_items_generalSettings_dailyBuildingTransfers_preferable ) | No      | integer | No         | -          | Maximum number of movements per day that can be weighted/preferred. |

###### <a name="teachers_items_generalSettings_dailyBuildingTransfers_strict"></a>7.1.8.11.1. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyBuildingTransfers > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict maximum number of movements per day.

###### <a name="teachers_items_generalSettings_dailyBuildingTransfers_preferable"></a>7.1.8.11.2. Property `PlanningGhcData > teachers > Teacher > generalSettings > dailyBuildingTransfers > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum number of movements per day that can be weighted/preferred.

#### <a name="teachers_items_periodsSettings"></a>7.1.9. Property `PlanningGhcData > teachers > Teacher > periodsSettings`

**Title:** PeriodsSettings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Strict and measurable teacher's conditions customized by week/period

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                         | Description |
| ------------------------------------------------------- | ----------- |
| [PeriodsSetting](#teachers_items_periodsSettings_items) | -           |

##### <a name="teachers_items_periodsSettings_items"></a>7.1.9.1. PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting

**Title:** PeriodsSetting

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                                                    | Pattern | Type             | Deprecated | Definition                                                                                  | Title/Description                                                                                               |
| ------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| + [refPeriod](#teachers_items_periodsSettings_items_refPeriod )                             | No      | string           | No         | -                                                                                           | Identifier of the period to which the settings affect.                                                          |
| - [weeklyStay](#teachers_items_periodsSettings_items_weeklyStay )                           | No      | object           | No         | Same as [weeklyStay](#teachers_items_generalSettings_weeklyStay )                           | WeeklyStay                                                                                                      |
| - [dailyStay](#teachers_items_periodsSettings_items_dailyStay )                             | No      | object           | No         | Same as [dailyStay](#teachers_items_generalSettings_dailyStay )                             | DailyStay                                                                                                       |
| - [avoidGapsBetweenSesions](#teachers_items_periodsSettings_items_avoidGapsBetweenSesions ) | No      | boolean          | No         | Same as [avoidGapsBetweenSesions](#teachers_items_generalSettings_avoidGapsBetweenSesions ) | It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition. |
| - [maxContinuousTeaching](#teachers_items_periodsSettings_items_maxContinuousTeaching )     | No      | object           | No         | Same as [maxContinuousTeaching](#teachers_items_generalSettings_maxContinuousTeaching )     | MaxContinuousTeaching                                                                                           |
| - [avoidClassesAroundBreak](#teachers_items_periodsSettings_items_avoidClassesAroundBreak ) | No      | enum (of string) | No         | Same as [avoidClassesAroundBreak](#teachers_items_generalSettings_avoidClassesAroundBreak ) | ConditionType                                                                                                   |
| - [freeTimes](#teachers_items_periodsSettings_items_freeTimes )                             | No      | object           | No         | Same as [freeTimes](#teachers_items_generalSettings_freeTimes )                             | FreeTimes                                                                                                       |
| - [freePartTimes](#teachers_items_periodsSettings_items_freePartTimes )                     | No      | object           | No         | Same as [freePartTimes](#teachers_items_generalSettings_freePartTimes )                     | FreePartTime                                                                                                    |
| - [incompatibilities](#teachers_items_periodsSettings_items_incompatibilities )             | No      | object           | No         | Same as [incompatibilities](#teachers_items_generalSettings_incompatibilities )             | Incompatibilities                                                                                               |
| - [dailyOcupation](#teachers_items_periodsSettings_items_dailyOcupation )                   | No      | object           | No         | Same as [dailyOcupation](#teachers_items_generalSettings_dailyOcupation )                   | DailyOcupation                                                                                                  |
| - [middayReference](#teachers_items_periodsSettings_items_middayReference )                 | No      | object           | No         | Same as [middayReference](#teachers_items_generalSettings_middayReference )                 | MiddayReference                                                                                                 |
| - [dailyBuildingTransfers](#teachers_items_periodsSettings_items_dailyBuildingTransfers )   | No      | object           | No         | Same as [dailyBuildingTransfers](#teachers_items_generalSettings_dailyBuildingTransfers )   | DailyBuildingTransfers                                                                                          |

###### <a name="teachers_items_periodsSettings_items_refPeriod"></a>7.1.9.1.1. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > refPeriod`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the period to which the settings affect.

###### <a name="teachers_items_periodsSettings_items_weeklyStay"></a>7.1.9.1.2. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > weeklyStay`

**Title:** WeeklyStay

|                           |                                                          |
| ------------------------- | -------------------------------------------------------- |
| **Type**                  | `object`                                                 |
| **Required**              | No                                                       |
| **Additional properties** | Not allowed                                              |
| **Same definition as**    | [weeklyStay](#teachers_items_generalSettings_weeklyStay) |

**Description:** It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

###### <a name="teachers_items_periodsSettings_items_dailyStay"></a>7.1.9.1.3. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > dailyStay`

**Title:** DailyStay

|                           |                                                        |
| ------------------------- | ------------------------------------------------------ |
| **Type**                  | `object`                                               |
| **Required**              | No                                                     |
| **Additional properties** | Not allowed                                            |
| **Same definition as**    | [dailyStay](#teachers_items_generalSettings_dailyStay) |

**Description:** This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.

###### <a name="teachers_items_periodsSettings_items_avoidGapsBetweenSesions"></a>7.1.9.1.4. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > avoidGapsBetweenSesions`

|                        |                                                                                    |
| ---------------------- | ---------------------------------------------------------------------------------- |
| **Type**               | `boolean`                                                                          |
| **Required**           | No                                                                                 |
| **Default**            | `true`                                                                             |
| **Same definition as** | [avoidGapsBetweenSesions](#teachers_items_generalSettings_avoidGapsBetweenSesions) |

**Description:** It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.

###### <a name="teachers_items_periodsSettings_items_maxContinuousTeaching"></a>7.1.9.1.5. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > maxContinuousTeaching`

**Title:** MaxContinuousTeaching

|                           |                                                                                |
| ------------------------- | ------------------------------------------------------------------------------ |
| **Type**                  | `object`                                                                       |
| **Required**              | No                                                                             |
| **Additional properties** | Not allowed                                                                    |
| **Same definition as**    | [maxContinuousTeaching](#teachers_items_generalSettings_maxContinuousTeaching) |

**Description:** It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

###### <a name="teachers_items_periodsSettings_items_avoidClassesAroundBreak"></a>7.1.9.1.6. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > avoidClassesAroundBreak`

**Title:** ConditionType

|                        |                                                                                    |
| ---------------------- | ---------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                 |
| **Required**           | No                                                                                 |
| **Default**            | `"ignore"`                                                                         |
| **Same definition as** | [avoidClassesAroundBreak](#teachers_items_generalSettings_avoidClassesAroundBreak) |

**Description:** It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised or forbidden.

###### <a name="teachers_items_periodsSettings_items_freeTimes"></a>7.1.9.1.7. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > freeTimes`

**Title:** FreeTimes

|                           |                                                        |
| ------------------------- | ------------------------------------------------------ |
| **Type**                  | `object`                                               |
| **Required**              | No                                                     |
| **Additional properties** | Not allowed                                            |
| **Same definition as**    | [freeTimes](#teachers_items_generalSettings_freeTimes) |

**Description:** It contains the free time spaces that the teacher must have.

###### <a name="teachers_items_periodsSettings_items_freePartTimes"></a>7.1.9.1.8. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > freePartTimes`

**Title:** FreePartTime

|                           |                                                                |
| ------------------------- | -------------------------------------------------------------- |
| **Type**                  | `object`                                                       |
| **Required**              | No                                                             |
| **Additional properties** | Not allowed                                                    |
| **Same definition as**    | [freePartTimes](#teachers_items_generalSettings_freePartTimes) |

**Description:** Free half-time periods .

###### <a name="teachers_items_periodsSettings_items_incompatibilities"></a>7.1.9.1.9. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > incompatibilities`

**Title:** Incompatibilities

|                           |                                                                        |
| ------------------------- | ---------------------------------------------------------------------- |
| **Type**                  | `object`                                                               |
| **Required**              | No                                                                     |
| **Additional properties** | Not allowed                                                            |
| **Same definition as**    | [incompatibilities](#teachers_items_generalSettings_incompatibilities) |

**Description:** It contains the teacher's incompatibilities on the allocation of class units and rest periods.

###### <a name="teachers_items_periodsSettings_items_dailyOcupation"></a>7.1.9.1.10. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > dailyOcupation`

**Title:** DailyOcupation

|                           |                                                                  |
| ------------------------- | ---------------------------------------------------------------- |
| **Type**                  | `object`                                                         |
| **Required**              | No                                                               |
| **Additional properties** | Not allowed                                                      |
| **Same definition as**    | [dailyOcupation](#teachers_items_generalSettings_dailyOcupation) |

**Description:** Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

###### <a name="teachers_items_periodsSettings_items_middayReference"></a>7.1.9.1.11. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > middayReference`

**Title:** MiddayReference

|                           |                                                                    |
| ------------------------- | ------------------------------------------------------------------ |
| **Type**                  | `object`                                                           |
| **Required**              | No                                                                 |
| **Additional properties** | Not allowed                                                        |
| **Same definition as**    | [middayReference](#teachers_items_generalSettings_middayReference) |

**Description:** It indicate the frame where the teacher takes noon pause.

###### <a name="teachers_items_periodsSettings_items_dailyBuildingTransfers"></a>7.1.9.1.12. Property `PlanningGhcData > teachers > Teacher > periodsSettings > PeriodsSetting > dailyBuildingTransfers`

**Title:** DailyBuildingTransfers

|                           |                                                                                  |
| ------------------------- | -------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                         |
| **Required**              | No                                                                               |
| **Additional properties** | Not allowed                                                                      |
| **Same definition as**    | [dailyBuildingTransfers](#teachers_items_generalSettings_dailyBuildingTransfers) |

**Description:** Maximum number of movements between buildings that the teacher can make per day.

## <a name="subjects"></a>8. Property `PlanningGhcData > subjects`

**Title:** Subjects

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** School subjects taught in the class units.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description |
| ------------------------------- | ----------- |
| [Subject](#subjects_items)      | -           |

### <a name="subjects_items"></a>8.1. PlanningGhcData > subjects > Subject

**Title:** Subject

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                        | Pattern | Type             | Deprecated | Definition                                           | Title/Description                                                    |
| --------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------- | -------------------------------------------------------------------- |
| + [id](#subjects_items_id )                                     | No      | string           | No         | -                                                    | Subject identifier.                                                  |
| - [shortName](#subjects_items_shortName )                       | No      | string           | No         | -                                                    | Short name of the subject.                                           |
| - [fullName](#subjects_items_fullName )                         | No      | string           | No         | -                                                    | Complete name of the subject.                                        |
| - [exKey](#subjects_items_exKey )                               | No      | string           | No         | -                                                    | External key of the subject                                          |
| - [technicalTeacher](#subjects_items_technicalTeacher )         | No      | boolean          | No         | -                                                    | It indicates whether the subject is teach by technical teacher.      |
| - [type](#subjects_items_type )                                 | No      | enum (of string) | No         | -                                                    | SubjectType                                                          |
| - [refClassroom](#subjects_items_refClassroom )                 | No      | string           | No         | -                                                    | Id of the classroom assigned to teach the subject.                   |
| - [refClassRoomSetsList](#subjects_items_refClassRoomSetsList ) | No      | array of string  | No         | -                                                    | List of alternative classroom sets assigned to schedule the subject. |
| - [refColourInResult](#subjects_items_refColourInResult )       | No      | string           | No         | -                                                    | Colour code used to represent the subject in the result.             |
| - [frameTemplate](#subjects_items_frameTemplate )               | No      | array of object  | No         | Same as [frameTemplate](#tasks_items_frameTemplate ) | FrameTemplate                                                        |

#### <a name="subjects_items_id"></a>8.1.1. Property `PlanningGhcData > subjects > Subject > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Subject identifier.

#### <a name="subjects_items_shortName"></a>8.1.2. Property `PlanningGhcData > subjects > Subject > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the subject.

#### <a name="subjects_items_fullName"></a>8.1.3. Property `PlanningGhcData > subjects > Subject > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the subject.

#### <a name="subjects_items_exKey"></a>8.1.4. Property `PlanningGhcData > subjects > Subject > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the subject

#### <a name="subjects_items_technicalTeacher"></a>8.1.5. Property `PlanningGhcData > subjects > Subject > technicalTeacher`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether the subject is teach by technical teacher.

#### <a name="subjects_items_type"></a>8.1.6. Property `PlanningGhcData > subjects > Subject > type`

**Title:** SubjectType

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |

**Description:** Type of the subject

Must be one of:
* "core"
* "specific"
* "elective"
* "mentoring"

#### <a name="subjects_items_refClassroom"></a>8.1.7. Property `PlanningGhcData > subjects > Subject > refClassroom`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the classroom assigned to teach the subject.

#### <a name="subjects_items_refClassRoomSetsList"></a>8.1.8. Property `PlanningGhcData > subjects > Subject > refClassRoomSetsList`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of alternative classroom sets assigned to schedule the subject.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                               | Description               |
| ------------------------------------------------------------- | ------------------------- |
| [ClassRoomSetRef](#subjects_items_refClassRoomSetsList_items) | Classroom set identifier. |

##### <a name="subjects_items_refClassRoomSetsList_items"></a>8.1.8.1. PlanningGhcData > subjects > Subject > refClassRoomSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

#### <a name="subjects_items_refColourInResult"></a>8.1.9. Property `PlanningGhcData > subjects > Subject > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the subject in the result.

#### <a name="subjects_items_frameTemplate"></a>8.1.10. Property `PlanningGhcData > subjects > Subject > frameTemplate`

**Title:** FrameTemplate

|                        |                                             |
| ---------------------- | ------------------------------------------- |
| **Type**               | `array of object`                           |
| **Required**           | No                                          |
| **Same definition as** | [frameTemplate](#tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

## <a name="groups"></a>9. Property `PlanningGhcData > groups`

**Title:** Groups

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Sets of students. A group with includedGroups is considered a group set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description |
| ------------------------------- | ----------- |
| [Group](#groups_items)          | -           |

### <a name="groups_items"></a>9.1. PlanningGhcData > groups > Group

**Title:** Group

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                              | Pattern | Type             | Deprecated | Definition                                                                  | Title/Description                                                                                                                |
| --------------------------------------------------------------------- | ------- | ---------------- | ---------- | --------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#groups_items_id )                                             | No      | string           | No         | -                                                                           | Group identifier.                                                                                                                |
| - [shortName](#groups_items_shortName )                               | No      | string           | No         | -                                                                           | Short name of the group.                                                                                                         |
| - [fullName](#groups_items_fullName )                                 | No      | string           | No         | -                                                                           | Complete name of the group.                                                                                                      |
| - [exKey](#groups_items_exKey )                                       | No      | string           | No         | -                                                                           | External key of the subject                                                                                                      |
| + [refFrame](#groups_items_refFrame )                                 | No      | string           | No         | -                                                                           | Group's frame identifier.                                                                                                        |
| - [frameTemplate](#groups_items_frameTemplate )                       | No      | array of object  | No         | Same as [frameTemplate](#tasks_items_frameTemplate )                        | FrameTemplate                                                                                                                    |
| - [numStudents](#groups_items_numStudents )                           | No      | integer          | No         | -                                                                           | Number of students in the group.                                                                                                 |
| - [freeAfternoons](#groups_items_freeAfternoons )                     | No      | integer          | No         | -                                                                           | Stric number of free afternoons for the group.                                                                                   |
| - [notGaps](#groups_items_notGaps )                                   | No      | enum (of string) | No         | Same as [type](#teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                                                                                    |
| - [gapsAlwaysInNonPreferred](#groups_items_gapsAlwaysInNonPreferred ) | No      | boolean          | No         | -                                                                           | This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps. |
| - [refCourse](#groups_items_refCourse )                               | No      | string           | No         | -                                                                           | Course identifier to which the group belongs.                                                                                    |
| - [includedGroups](#groups_items_includedGroups )                     | No      | array of string  | No         | -                                                                           | Identifiers of the groups included in this group. A group that defines this property is considered a group set.                  |
| - [refTeacher](#groups_items_refTeacher )                             | No      | string           | No         | -                                                                           | Id of the tutor teacher assigned to the group                                                                                    |
| - [refClassroom](#groups_items_refClassroom )                         | No      | string           | No         | -                                                                           | Id of the classroom assigned to the group                                                                                        |
| - [refClassRoomSetsList](#groups_items_refClassRoomSetsList )         | No      | array of string  | No         | -                                                                           | List of classroom sets assigned to the group.                                                                                    |

#### <a name="groups_items_id"></a>9.1.1. Property `PlanningGhcData > groups > Group > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group identifier.

#### <a name="groups_items_shortName"></a>9.1.2. Property `PlanningGhcData > groups > Group > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the group.

#### <a name="groups_items_fullName"></a>9.1.3. Property `PlanningGhcData > groups > Group > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the group.

#### <a name="groups_items_exKey"></a>9.1.4. Property `PlanningGhcData > groups > Group > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the subject

#### <a name="groups_items_refFrame"></a>9.1.5. Property `PlanningGhcData > groups > Group > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group's frame identifier.

#### <a name="groups_items_frameTemplate"></a>9.1.6. Property `PlanningGhcData > groups > Group > frameTemplate`

**Title:** FrameTemplate

|                        |                                             |
| ---------------------- | ------------------------------------------- |
| **Type**               | `array of object`                           |
| **Required**           | No                                          |
| **Same definition as** | [frameTemplate](#tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

#### <a name="groups_items_numStudents"></a>9.1.7. Property `PlanningGhcData > groups > Group > numStudents`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Number of students in the group.

#### <a name="groups_items_freeAfternoons"></a>9.1.8. Property `PlanningGhcData > groups > Group > freeAfternoons`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Stric number of free afternoons for the group.

#### <a name="groups_items_notGaps"></a>9.1.9. Property `PlanningGhcData > groups > Group > notGaps`

**Title:** ConditionType

|                        |                                                                    |
| ---------------------- | ------------------------------------------------------------------ |
| **Type**               | `enum (of string)`                                                 |
| **Required**           | No                                                                 |
| **Same definition as** | [type](#teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** It indicates if the group can have gaps in its timetable.

#### <a name="groups_items_gapsAlwaysInNonPreferred"></a>9.1.10. Property `PlanningGhcData > groups > Group > gapsAlwaysInNonPreferred`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.

#### <a name="groups_items_refCourse"></a>9.1.11. Property `PlanningGhcData > groups > Group > refCourse`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Course identifier to which the group belongs.

#### <a name="groups_items_includedGroups"></a>9.1.12. Property `PlanningGhcData > groups > Group > includedGroups`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Identifiers of the groups included in this group. A group that defines this property is considered a group set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                 | Description        |
| ----------------------------------------------- | ------------------ |
| [refGroups](#groups_items_includedGroups_items) | Groups identifier. |

##### <a name="groups_items_includedGroups_items"></a>9.1.12.1. PlanningGhcData > groups > Group > includedGroups > refGroups

**Title:** refGroups

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Groups identifier.

#### <a name="groups_items_refTeacher"></a>9.1.13. Property `PlanningGhcData > groups > Group > refTeacher`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the tutor teacher assigned to the group

#### <a name="groups_items_refClassroom"></a>9.1.14. Property `PlanningGhcData > groups > Group > refClassroom`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the classroom assigned to the group

#### <a name="groups_items_refClassRoomSetsList"></a>9.1.15. Property `PlanningGhcData > groups > Group > refClassRoomSetsList`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of classroom sets assigned to the group.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                             | Description               |
| ----------------------------------------------------------- | ------------------------- |
| [ClassRoomSetRef](#groups_items_refClassRoomSetsList_items) | Classroom set identifier. |

##### <a name="groups_items_refClassRoomSetsList_items"></a>9.1.15.1. PlanningGhcData > groups > Group > refClassRoomSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

## <a name="groupSetRelations"></a>10. Property `PlanningGhcData > groupSetRelations`

**Title:** GroupSetRelations

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | No      |

**Description:** Relationships between group sets that indicate whether their included groups can be scheduled simultaneously.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be              | Description                                                                       |
| -------------------------------------------- | --------------------------------------------------------------------------------- |
| [GroupSetRelation](#groupSetRelations_items) | Relationship between group sets represented by Group objects with includedGroups. |

### <a name="groupSetRelations_items"></a>10.1. PlanningGhcData > groupSetRelations > GroupSetRelation

**Title:** GroupSetRelation

|                           |                          |
| ------------------------- | ------------------------ |
| **Type**                  | `object`                 |
| **Required**              | No                       |
| **Additional properties** | Not allowed              |
| **Defined in**            | #/$defs/groupSetRelation |

**Description:** Relationship between group sets represented by Group objects with includedGroups.

| Property                                             | Pattern | Type    | Deprecated | Definition                            | Title/Description                                          |
| ---------------------------------------------------- | ------- | ------- | ---------- | ------------------------------------- | ---------------------------------------------------------- |
| + [id](#groupSetRelations_items_id )                 | No      | integer | No         | -                                     | Group set relationship identifier.                         |
| - [alias](#groupSetRelations_items_alias )           | No      | string  | No         | -                                     | Optional name used to identify the group set relationship. |
| + [expression](#groupSetRelations_items_expression ) | No      | object  | No         | In #/$defs/groupSetRelationExpression | GroupSetRelationExpression                                 |

#### <a name="groupSetRelations_items_id"></a>10.1.1. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Group set relationship identifier.

#### <a name="groupSetRelations_items_alias"></a>10.1.2. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Optional name used to identify the group set relationship.

#### <a name="groupSetRelations_items_expression"></a>10.1.3. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression`

**Title:** GroupSetRelationExpression

|                           |                                    |
| ------------------------- | ---------------------------------- |
| **Type**                  | `object`                           |
| **Required**              | Yes                                |
| **Additional properties** | Not allowed                        |
| **Defined in**            | #/$defs/groupSetRelationExpression |

**Description:** Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.

| Property                                                                                      | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                                                |
| --------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [operator](#groupSetRelations_items_expression_operator )                                   | No      | enum (of string) | No         | -          | Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding. |
| - [refGroupSet](#groupSetRelations_items_expression_refGroupSet )                             | No      | array of string  | No         | -          | GroupSetRelationMembers                                                                                                                                          |
| - [nestedRelationExpressions](#groupSetRelations_items_expression_nestedRelationExpressions ) | No      | array            | No         | -          | NestedRelationExpressions                                                                                                                                        |

##### <a name="groupSetRelations_items_expression_operator"></a>10.1.3.1. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression > operator`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.

Must be one of:
* "COMPATIBLE"
* "EXCLUSIVE"

##### <a name="groupSetRelations_items_expression_refGroupSet"></a>10.1.3.2. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression > refGroupSet`

**Title:** GroupSetRelationMembers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of group set identifiers.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                            | Description                                                                            |
| -------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| [GroupSetReference](#groupSetRelations_items_expression_refGroupSet_items) | Identifier of a Group that represents a group set through its includedGroups property. |

###### <a name="groupSetRelations_items_expression_refGroupSet_items"></a>10.1.3.2.1. PlanningGhcData > groupSetRelations > GroupSetRelation > expression > refGroupSet > GroupSetReference

**Title:** GroupSetReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of a Group that represents a group set through its includedGroups property.

##### <a name="groupSetRelations_items_expression_nestedRelationExpressions"></a>10.1.3.3. Property `PlanningGhcData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions`

**Title:** NestedRelationExpressions

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | No      |

**Description:** Nested expressions that relate other group sets or group set relationship expressions.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                   | Description                                                                                                        |
| ------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| [GroupSetRelationExpression](#groupSetRelations_items_expression_nestedRelationExpressions_items) | Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously. |

###### <a name="groupSetRelations_items_expression_nestedRelationExpressions_items"></a>10.1.3.3.1. PlanningGhcData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions > GroupSetRelationExpression

**Title:** GroupSetRelationExpression

|                           |                                                   |
| ------------------------- | ------------------------------------------------- |
| **Type**                  | `object`                                          |
| **Required**              | No                                                |
| **Additional properties** | Not allowed                                       |
| **Same definition as**    | [expression](#groupSetRelations_items_expression) |

**Description:** Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.

## <a name="courses"></a>11. Property `PlanningGhcData > courses`

**Title:** Courses

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Sets of courses.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description |
| ------------------------------- | ----------- |
| [Course](#courses_items)        | -           |

### <a name="courses_items"></a>11.1. PlanningGhcData > courses > Course

**Title:** Course

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                           | Pattern | Type            | Deprecated | Definition | Title/Description                        |
| -------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ---------------------------------------- |
| + [id](#courses_items_id )                         | No      | string          | No         | -          | Course identifier.                       |
| - [fullName](#courses_items_fullName )             | No      | string          | No         | -          | Full name of the course.                 |
| - [exKey](#courses_items_exKey )                   | No      | string          | No         | -          | External key of the course               |
| - [courseSubjects](#courses_items_courseSubjects ) | No      | array of object | No         | -          | List of subjects assigned to the course. |

#### <a name="courses_items_id"></a>11.1.1. Property `PlanningGhcData > courses > Course > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Course identifier.

#### <a name="courses_items_fullName"></a>11.1.2. Property `PlanningGhcData > courses > Course > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Full name of the course.

#### <a name="courses_items_exKey"></a>11.1.3. Property `PlanningGhcData > courses > Course > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the course

#### <a name="courses_items_courseSubjects"></a>11.1.4. Property `PlanningGhcData > courses > Course > courseSubjects`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of subjects assigned to the course.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                      | Description |
| ---------------------------------------------------- | ----------- |
| [CourseSubject](#courses_items_courseSubjects_items) | -           |

##### <a name="courses_items_courseSubjects_items"></a>11.1.4.1. PlanningGhcData > courses > Course > courseSubjects > CourseSubject

**Title:** CourseSubject

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                        | Pattern | Type    | Deprecated | Definition | Title/Description                                                 |
| --------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------- |
| + [numHours](#courses_items_courseSubjects_items_numHours )     | No      | integer | No         | -          | Number of hours that this subject is taught. By default, it is 1. |
| + [refSubject](#courses_items_courseSubjects_items_refSubject ) | No      | string  | No         | -          | Subject of the course.                                            |

###### <a name="courses_items_courseSubjects_items_numHours"></a>11.1.4.1.1. Property `PlanningGhcData > courses > Course > courseSubjects > CourseSubject > numHours`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Number of hours that this subject is taught. By default, it is 1.

###### <a name="courses_items_courseSubjects_items_refSubject"></a>11.1.4.1.2. Property `PlanningGhcData > courses > Course > courseSubjects > CourseSubject > refSubject`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Subject of the course.

## <a name="departments"></a>12. Property `PlanningGhcData > departments`

**Title:** Departments

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Sets of departments.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be  | Description |
| -------------------------------- | ----------- |
| [Department](#departments_items) | -           |

### <a name="departments_items"></a>12.1. PlanningGhcData > departments > Department

**Title:** Department

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                         | Pattern | Type            | Deprecated | Definition | Title/Description                                                                                 |
| ---------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------- |
| + [id](#departments_items_id )                                   | No      | string          | No         | -          | Department identifier.                                                                            |
| - [fullName](#departments_items_fullName )                       | No      | string          | No         | -          | Full name of the department.                                                                      |
| - [messageToDepartment](#departments_items_messageToDepartment ) | No      | string          | No         | -          | Message that will be shown to the Department in the desiderata capture program.                   |
| - [isNew](#departments_items_isNew )                             | No      | boolean         | No         | -          | Boolean that indicates if the Department has been newly created in the desiderata capture module. |
| - [exKey](#departments_items_exKey )                             | No      | string          | No         | -          | Identifier of the Department in external application or academic manager.                         |
| - [email](#departments_items_email )                             | No      | string          | No         | -          | It is an email type that is associated with the Department                                        |
| - [refTeacher](#departments_items_refTeacher )                   | No      | array of string | No         | -          | Identifier of the list of teachers who are in this department                                     |
| - [refSubjects](#departments_items_refSubjects )                 | No      | array of string | No         | -          | Identifier of the list of subjects who are in this department                                     |

#### <a name="departments_items_id"></a>12.1.1. Property `PlanningGhcData > departments > Department > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Department identifier.

#### <a name="departments_items_fullName"></a>12.1.2. Property `PlanningGhcData > departments > Department > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Full name of the department.

#### <a name="departments_items_messageToDepartment"></a>12.1.3. Property `PlanningGhcData > departments > Department > messageToDepartment`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Message that will be shown to the Department in the desiderata capture program.

#### <a name="departments_items_isNew"></a>12.1.4. Property `PlanningGhcData > departments > Department > isNew`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Boolean that indicates if the Department has been newly created in the desiderata capture module.

#### <a name="departments_items_exKey"></a>12.1.5. Property `PlanningGhcData > departments > Department > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the Department in external application or academic manager.

#### <a name="departments_items_email"></a>12.1.6. Property `PlanningGhcData > departments > Department > email`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** It is an email type that is associated with the Department

#### <a name="departments_items_refTeacher"></a>12.1.7. Property `PlanningGhcData > departments > Department > refTeacher`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Identifier of the list of teachers who are in this department

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                         | Description |
| ------------------------------------------------------- | ----------- |
| [refTeacher items](#departments_items_refTeacher_items) | -           |

##### <a name="departments_items_refTeacher_items"></a>12.1.7.1. PlanningGhcData > departments > Department > refTeacher > refTeacher items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

#### <a name="departments_items_refSubjects"></a>12.1.8. Property `PlanningGhcData > departments > Department > refSubjects`

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Identifier of the list of subjects who are in this department

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                           | Description |
| --------------------------------------------------------- | ----------- |
| [refSubjects items](#departments_items_refSubjects_items) | -           |

##### <a name="departments_items_refSubjects_items"></a>12.1.8.1. PlanningGhcData > departments > Department > refSubjects > refSubjects items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

## <a name="sessions"></a>13. Property `PlanningGhcData > sessions`

**Title:** Sessions

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Definition of the teacher class units. These may be with groups of students, meetings with other teachers or complementary activities.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description |
| ------------------------------- | ----------- |
| [Session](#sessions_items)      | -           |

### <a name="sessions_items"></a>13.1. PlanningGhcData > sessions > Session

**Title:** Session

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                                  | Pattern | Type            | Deprecated | Definition                      | Title/Description                                        |
| ------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------- | -------------------------------------------------------- |
| + [id](#sessions_items_id )                                               | No      | integer         | No         | -                               | Session identifier.                                      |
| + [refFrame](#sessions_items_refFrame )                                   | No      | string          | No         | -                               | Session's frame identifier.                              |
| + [refMainTask](#sessions_items_refMainTask )                             | No      | string          | No         | -                               | RefMainTask                                              |
| + [refMainTeacher](#sessions_items_refMainTeacher )                       | No      | string          | No         | -                               | RefMainTeacher                                           |
| + [refMainSubject](#sessions_items_refMainSubject )                       | No      | string          | No         | -                               | RefMainSubject                                           |
| + [refMainGroup](#sessions_items_refMainGroup )                           | No      | object          | No         | In #/$defs/refGroup             | GroupReferenceType                                       |
| - [refColourInResult](#sessions_items_refColourInResult )                 | No      | string          | No         | -                               | RefColourInResult                                        |
| - [otherElementsInClassRooms](#sessions_items_otherElementsInClassRooms ) | No      | array of object | No         | -                               | OtherElementsInClassRoomsList                            |
| + [distribution](#sessions_items_distribution )                           | No      | object          | No         | In #/$defs/distribution         | Distribution                                             |
| + [sessionClassRooms](#sessions_items_sessionClassRooms )                 | No      | object          | No         | -                               | SessionClassRooms                                        |
| - [frameTemplate](#sessions_items_frameTemplate )                         | No      | array of object | No         | In #/$defs/sessionFrameTemplate | SessionFrameTemplate                                     |
| - [sessionSettings](#sessions_items_sessionSettings )                     | No      | object          | No         | -                               | SessionSettings                                          |
| - [sessionRelations](#sessions_items_sessionRelations )                   | No      | object          | No         | -                               | SessionRelations                                         |
| - [department](#sessions_items_department )                               | No      | string          | No         | -                               | Contains the reference of the department of the session. |

#### <a name="sessions_items_id"></a>13.1.1. Property `PlanningGhcData > sessions > Session > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Session identifier.

#### <a name="sessions_items_refFrame"></a>13.1.2. Property `PlanningGhcData > sessions > Session > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

#### <a name="sessions_items_refMainTask"></a>13.1.3. Property `PlanningGhcData > sessions > Session > refMainTask`

**Title:** RefMainTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Main Task identifier.

#### <a name="sessions_items_refMainTeacher"></a>13.1.4. Property `PlanningGhcData > sessions > Session > refMainTeacher`

**Title:** RefMainTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Main Teacher identifier.

#### <a name="sessions_items_refMainSubject"></a>13.1.5. Property `PlanningGhcData > sessions > Session > refMainSubject`

**Title:** RefMainSubject

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the main subject.

#### <a name="sessions_items_refMainGroup"></a>13.1.6. Property `PlanningGhcData > sessions > Session > refMainGroup`

**Title:** GroupReferenceType

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | Yes              |
| **Additional properties** | Not allowed      |
| **Defined in**            | #/$defs/refGroup |

**Description:** Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

| Property                                                   | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                    |
| ---------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| + [refIdGroup](#sessions_items_refMainGroup_refIdGroup )   | No      | string  | No         | -          | Group identifier.                                                                                                                    |
| - [numStudents](#sessions_items_refMainGroup_numStudents ) | No      | integer | No         | -          | Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object. |

##### <a name="sessions_items_refMainGroup_refIdGroup"></a>13.1.6.1. Property `PlanningGhcData > sessions > Session > refMainGroup > refIdGroup`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group identifier.

##### <a name="sessions_items_refMainGroup_numStudents"></a>13.1.6.2. Property `PlanningGhcData > sessions > Session > refMainGroup > numStudents`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.

#### <a name="sessions_items_refColourInResult"></a>13.1.7. Property `PlanningGhcData > sessions > Session > refColourInResult`

**Title:** RefColourInResult

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the session in the result.

#### <a name="sessions_items_otherElementsInClassRooms"></a>13.1.8. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms`

**Title:** OtherElementsInClassRoomsList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of other time elements in the classroom related to each other.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                              | Description                                                                                     |
| ---------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| [OtherElementsInClassRooms](#sessions_items_otherElementsInClassRooms_items) | It contains interrelated elements that are present in the session in addition to the main ones. |

##### <a name="sessions_items_otherElementsInClassRooms_items"></a>13.1.8.1. PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms

**Title:** OtherElementsInClassRooms

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains interrelated elements that are present in the session in addition to the main ones.

| Property                                                                    | Pattern | Type   | Deprecated | Definition                                            | Title/Description  |
| --------------------------------------------------------------------------- | ------- | ------ | ---------- | ----------------------------------------------------- | ------------------ |
| - [refSubject](#sessions_items_otherElementsInClassRooms_items_refSubject ) | No      | string | No         | -                                                     | SubjectReference   |
| - [refTeacher](#sessions_items_otherElementsInClassRooms_items_refTeacher ) | No      | string | No         | -                                                     | TeacherReference   |
| - [refGroup](#sessions_items_otherElementsInClassRooms_items_refGroup )     | No      | object | No         | Same as [refMainGroup](#sessions_items_refMainGroup ) | GroupReferenceType |
| - [refTask](#sessions_items_otherElementsInClassRooms_items_refTask )       | No      | string | No         | -                                                     | TaskReference      |

###### <a name="sessions_items_otherElementsInClassRooms_items_refSubject"></a>13.1.8.1.1. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refSubject`

**Title:** SubjectReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of other subject in the classroom.

###### <a name="sessions_items_otherElementsInClassRooms_items_refTeacher"></a>13.1.8.1.2. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTeacher`

**Title:** TeacherReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of other teacher in the classroom.

###### <a name="sessions_items_otherElementsInClassRooms_items_refGroup"></a>13.1.8.1.3. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refGroup`

**Title:** GroupReferenceType

|                           |                                              |
| ------------------------- | -------------------------------------------- |
| **Type**                  | `object`                                     |
| **Required**              | No                                           |
| **Additional properties** | Not allowed                                  |
| **Same definition as**    | [refMainGroup](#sessions_items_refMainGroup) |

**Description:** Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

###### <a name="sessions_items_otherElementsInClassRooms_items_refTask"></a>13.1.8.1.4. Property `PlanningGhcData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTask`

**Title:** TaskReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of the task of the other teacher.

#### <a name="sessions_items_distribution"></a>13.1.9. Property `PlanningGhcData > sessions > Session > distribution`

**Title:** Distribution

|                           |                      |
| ------------------------- | -------------------- |
| **Type**                  | `object`             |
| **Required**              | Yes                  |
| **Additional properties** | Not allowed          |
| **Defined in**            | #/$defs/distribution |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

| Property                                                           | Pattern | Type            | Deprecated | Definition | Title/Description |
| ------------------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | ----------------- |
| - [periods](#sessions_items_distribution_periods )                 | No      | array of string | No         | -          | RefPeriods        |
| - [stablePeriods](#sessions_items_distribution_stablePeriods )     | No      | object          | No         | -          | StablePeriods     |
| - [variablePeriods](#sessions_items_distribution_variablePeriods ) | No      | object          | No         | -          | VariablePeriods   |

##### <a name="sessions_items_distribution_periods"></a>13.1.9.1. Property `PlanningGhcData > sessions > Session > distribution > periods`

**Title:** RefPeriods

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of periods or weeks in which the class unit must be assigned.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                         | Description        |
| ------------------------------------------------------- | ------------------ |
| [RefPeriod](#sessions_items_distribution_periods_items) | Period identifier. |

###### <a name="sessions_items_distribution_periods_items"></a>13.1.9.1.1. PlanningGhcData > sessions > Session > distribution > periods > RefPeriod

**Title:** RefPeriod

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Period identifier.

##### <a name="sessions_items_distribution_stablePeriods"></a>13.1.9.2. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods`

**Title:** StablePeriods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** The allocation of the class unit of the session is the same in each period.

| Property                                                                           | Pattern | Type             | Deprecated | Definition                | Title/Description |
| ---------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------- | ----------------- |
| - [stableTiming](#sessions_items_distribution_stablePeriods_stableTiming )         | No      | array of integer | No         | In #/$defs/stableTiming   | StableTiming      |
| - [variableTiming](#sessions_items_distribution_stablePeriods_variableTiming )     | No      | object           | No         | In #/$defs/variableTiming | VariableTiming    |
| - [stableTimingList](#sessions_items_distribution_stablePeriods_stableTimingList ) | No      | array            | No         | -                         | StableTimingList  |

###### <a name="sessions_items_distribution_stablePeriods_stableTiming"></a>13.1.9.2.1. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTiming`

**Title:** StableTiming

|                |                      |
| -------------- | -------------------- |
| **Type**       | `array of integer`   |
| **Required**   | No                   |
| **Defined in** | #/$defs/stableTiming |

**Description:** It contains the fixed way of allocating time across the days of the period.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                               | Description                                                     |
| ----------------------------------------------------------------------------- | --------------------------------------------------------------- |
| [DailyMinutes](#sessions_items_distribution_stablePeriods_stableTiming_items) | Indicates the number of minutes to be allocated on a given day. |

###### <a name="sessions_items_distribution_stablePeriods_stableTiming_items"></a>13.1.9.2.1.1. PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTiming > DailyMinutes

**Title:** DailyMinutes

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the number of minutes to be allocated on a given day.

###### <a name="sessions_items_distribution_stablePeriods_variableTiming"></a>13.1.9.2.2. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming`

**Title:** VariableTiming

|                           |                        |
| ------------------------- | ---------------------- |
| **Type**                  | `object`               |
| **Required**              | No                     |
| **Additional properties** | Not allowed            |
| **Defined in**            | #/$defs/variableTiming |

**Description:** It defines the allocating time as a total of time, maximum and minimun range of sections per day.

| Property                                                                                              | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                 |
| ----------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------- |
| + [minutesAmount](#sessions_items_distribution_stablePeriods_variableTiming_minutesAmount )           | No      | integer | No         | -          | Total of session's minutes.                                                                                                       |
| + [maxMinutesDaily](#sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily )       | No      | integer | No         | -          | Maximum of minutes per day.                                                                                                       |
| - [minMinutesDaily](#sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily )       | No      | integer | No         | -          | Minimun of minutes per day.                                                                                                       |
| - [avoidMaxDuration](#sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration )     | No      | boolean | No         | -          | It indicates the preference for class units of maximum duration.                                                                  |
| - [avoidMinDuration](#sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration )     | No      | boolean | No         | -          | It indicates the preference for class units of minimun duration.                                                                  |
| - [allowDiscontinuity](#sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity ) | No      | boolean | No         | -          | It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them. |

###### <a name="sessions_items_distribution_stablePeriods_variableTiming_minutesAmount"></a>13.1.9.2.2.1. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > minutesAmount`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Total of session's minutes.

###### <a name="sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily"></a>13.1.9.2.2.2. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > maxMinutesDaily`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Maximum of minutes per day.

###### <a name="sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily"></a>13.1.9.2.2.3. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > minMinutesDaily`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Minimun of minutes per day.

###### <a name="sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration"></a>13.1.9.2.2.4. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMaxDuration`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates the preference for class units of maximum duration.

###### <a name="sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration"></a>13.1.9.2.2.5. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMinDuration`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates the preference for class units of minimun duration.

###### <a name="sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity"></a>13.1.9.2.2.6. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > variableTiming > allowDiscontinuity`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.

###### <a name="sessions_items_distribution_stablePeriods_stableTimingList"></a>13.1.9.2.3. Property `PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTimingList`

**Title:** StableTimingList

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | No      |

**Description:** It contains an array of 'StableTiming' distributions.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                   | Description                                                                 |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| [StableTiming](#sessions_items_distribution_stablePeriods_stableTimingList_items) | It contains the fixed way of allocating time across the days of the period. |

###### <a name="sessions_items_distribution_stablePeriods_stableTimingList_items"></a>13.1.9.2.3.1. PlanningGhcData > sessions > Session > distribution > stablePeriods > stableTimingList > StableTiming

**Title:** StableTiming

|                        |                                                                         |
| ---------------------- | ----------------------------------------------------------------------- |
| **Type**               | `array of integer`                                                      |
| **Required**           | No                                                                      |
| **Same definition as** | [stableTiming](#sessions_items_distribution_stablePeriods_stableTiming) |

**Description:** It contains the fixed way of allocating time across the days of the period.

##### <a name="sessions_items_distribution_variablePeriods"></a>13.1.9.3. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods`

**Title:** VariablePeriods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** The total of the class units of the distribution are allocation between the periods.

| Property                                                                                     | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                                                         |
| -------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [timing](#sessions_items_distribution_variablePeriods_timing )                             | No      | object  | No         | -          | TimeAllocation                                                                                                                                                                                                                                                                            |
| - [maximunTimeInPeriod](#sessions_items_distribution_variablePeriods_maximunTimeInPeriod )   | No      | integer | No         | -          | Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.                                                                                                                                                                |
| - [minimnunTimeInPeriod](#sessions_items_distribution_variablePeriods_minimnunTimeInPeriod ) | No      | integer | No         | -          | Minimum number of minutes to be allocated in each Period.                                                                                                                                                                                                                                 |
| - [maximumTimeframe](#sessions_items_distribution_variablePeriods_maximumTimeframe )         | No      | integer | No         | -          | Indicates the maximum interval of periods that can be used to assign the session, counting from the first period with a session assignment to the last period with a session assignment. That is, the periods in between are also considered even if they do not have a session assigned. |

###### <a name="sessions_items_distribution_variablePeriods_timing"></a>13.1.9.3.1. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > timing`

**Title:** TimeAllocation

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.

| Property                                                                                | Pattern | Type             | Deprecated | Definition                                                                           | Title/Description |
| --------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------ | ----------------- |
| - [stableTiming](#sessions_items_distribution_variablePeriods_timing_stableTiming )     | No      | array of integer | No         | Same as [stableTiming](#sessions_items_distribution_stablePeriods_stableTiming )     | StableTiming      |
| - [variableTiming](#sessions_items_distribution_variablePeriods_timing_variableTiming ) | No      | object           | No         | Same as [variableTiming](#sessions_items_distribution_stablePeriods_variableTiming ) | VariableTiming    |

###### <a name="sessions_items_distribution_variablePeriods_timing_stableTiming"></a>13.1.9.3.1.1. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > timing > stableTiming`

**Title:** StableTiming

|                        |                                                                         |
| ---------------------- | ----------------------------------------------------------------------- |
| **Type**               | `array of integer`                                                      |
| **Required**           | No                                                                      |
| **Same definition as** | [stableTiming](#sessions_items_distribution_stablePeriods_stableTiming) |

**Description:** It contains the fixed way of allocating time across the days of the period.

###### <a name="sessions_items_distribution_variablePeriods_timing_variableTiming"></a>13.1.9.3.1.2. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > timing > variableTiming`

**Title:** VariableTiming

|                           |                                                                             |
| ------------------------- | --------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                    |
| **Required**              | No                                                                          |
| **Additional properties** | Not allowed                                                                 |
| **Same definition as**    | [variableTiming](#sessions_items_distribution_stablePeriods_variableTiming) |

**Description:** It defines the allocating time as a total of time, maximum and minimun range of sections per day.

###### <a name="sessions_items_distribution_variablePeriods_maximunTimeInPeriod"></a>13.1.9.3.2. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > maximunTimeInPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.

###### <a name="sessions_items_distribution_variablePeriods_minimnunTimeInPeriod"></a>13.1.9.3.3. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > minimnunTimeInPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Minimum number of minutes to be allocated in each Period.

###### <a name="sessions_items_distribution_variablePeriods_maximumTimeframe"></a>13.1.9.3.4. Property `PlanningGhcData > sessions > Session > distribution > variablePeriods > maximumTimeframe`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the maximum interval of periods that can be used to assign the session, counting from the first period with a session assignment to the last period with a session assignment. That is, the periods in between are also considered even if they do not have a session assigned.

#### <a name="sessions_items_sessionClassRooms"></a>13.1.10. Property `PlanningGhcData > sessions > Session > sessionClassRooms`

**Title:** SessionClassRooms

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** It contains the information about the classrooms for the class units. At least one classroom is required for the class units.

| Property                                                                        | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                       |
| ------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| + [classRoomsToAssign](#sessions_items_sessionClassRooms_classRoomsToAssign )   | No      | array            | No         | -          | ClassRoomsToAssign                                                                                                                      |
| - [capacityPreference](#sessions_items_sessionClassRooms_capacityPreference )   | No      | enum (of string) | No         | -          | Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.                               |
| - [capacityType](#sessions_items_sessionClassRooms_capacityType )               | No      | enum (of string) | No         | -          | It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.                  |
| - [alwaysSameClassRoom](#sessions_items_sessionClassRooms_alwaysSameClassRoom ) | No      | boolean          | No         | -          | Indicates if the session must be always in the same classroom the hole week or it can be given on different classrooms during the week. |

##### <a name="sessions_items_sessionClassRooms_classRoomsToAssign"></a>13.1.10.1. Property `PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign`

**Title:** ClassRoomsToAssign

|              |         |
| ------------ | ------- |
| **Type**     | `array` |
| **Required** | Yes     |

**Description:** List of classrooms to the session. Each object in the list represent one classroom that must be assigned.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                    | Description                                                                                                                   |
| ---------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| [RefClassRoomToAssign](#sessions_items_sessionClassRooms_classRoomsToAssign_items) | Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session. |

###### <a name="sessions_items_sessionClassRooms_classRoomsToAssign_items"></a>13.1.10.1.1. PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign

**Title:** RefClassRoomToAssign

|                           |                              |
| ------------------------- | ---------------------------- |
| **Type**                  | `object`                     |
| **Required**              | No                           |
| **Additional properties** | Not allowed                  |
| **Defined in**            | #/$defs/refClassRoomToAssign |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

| Property                                                                                               | Pattern | Type            | Deprecated | Definition | Title/Description  |
| ------------------------------------------------------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | ------------------ |
| - [classRoom](#sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom )                   | No      | string          | No         | -          | ClassRoomRef       |
| - [classRoomsSetsList](#sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList ) | No      | array of string | No         | -          | ClassRoomsSetsList |

###### <a name="sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom"></a>13.1.10.1.1.1. Property `PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoom`

**Title:** ClassRoomRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom identifier.

###### <a name="sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList"></a>13.1.10.1.1.2. Property `PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList`

**Title:** ClassRoomsSetsList

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** Classroom set list where one classroom could be taken to assign to session.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                                        | Description               |
| ------------------------------------------------------------------------------------------------------ | ------------------------- |
| [ClassRoomSetRef](#sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items) | Classroom set identifier. |

###### <a name="sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items"></a>13.1.10.1.1.2.1. PlanningGhcData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

##### <a name="sessions_items_sessionClassRooms_capacityPreference"></a>13.1.10.2. Property `PlanningGhcData > sessions > Session > sessionClassRooms > capacityPreference`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"ignore"`         |

**Description:** Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.

Must be one of:
* "attempt"
* "strict"
* "ignore"

##### <a name="sessions_items_sessionClassRooms_capacityType"></a>13.1.10.3. Property `PlanningGhcData > sessions > Session > sessionClassRooms > capacityType`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"individual"`     |

**Description:** It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.

Must be one of:
* "individual"
* "collective"

##### <a name="sessions_items_sessionClassRooms_alwaysSameClassRoom"></a>13.1.10.4. Property `PlanningGhcData > sessions > Session > sessionClassRooms > alwaysSameClassRoom`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if the session must be always in the same classroom the hole week or it can be given on different classrooms during the week.

#### <a name="sessions_items_frameTemplate"></a>13.1.11. Property `PlanningGhcData > sessions > Session > frameTemplate`

**Title:** SessionFrameTemplate

|                |                              |
| -------------- | ---------------------------- |
| **Type**       | `array of object`            |
| **Required**   | No                           |
| **Defined in** | #/$defs/sessionFrameTemplate |

**Description:** Complete template of preferences.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                 | Description                    |
| --------------------------------------------------------------- | ------------------------------ |
| [SessionSectionPreference](#sessions_items_frameTemplate_items) | Section assignment preference. |

##### <a name="sessions_items_frameTemplate_items"></a>13.1.11.1. PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference

**Title:** SessionSectionPreference

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Section assignment preference.

| Property                                              | Pattern | Type             | Deprecated | Definition | Title/Description                                      |
| ----------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------ |
| + [day](#sessions_items_frameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when the section is located.           |
| + [index](#sessions_items_frameTemplate_items_index ) | No      | integer          | No         | -          | Index built into the day where the section is located. |
| + [frame](#sessions_items_frameTemplate_items_frame ) | No      | string           | No         | -          | Frame identifier.                                      |
| + [type](#sessions_items_frameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeWithPreset                        |

###### <a name="sessions_items_frameTemplate_items_day"></a>13.1.11.1.1. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="sessions_items_frameTemplate_items_index"></a>13.1.11.1.2. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="sessions_items_frameTemplate_items_frame"></a>13.1.11.1.3. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

###### <a name="sessions_items_frameTemplate_items_type"></a>13.1.11.1.4. Property `PlanningGhcData > sessions > Session > frameTemplate > SessionSectionPreference > type`

**Title:** SectionPreferenceTypeWithPreset

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Session availability to be assigned to the section.

Must be one of:
* "banned"
* "strong-non-preferred"
* "weak-non-preferred"
* "preset"

#### <a name="sessions_items_sessionSettings"></a>13.1.12. Property `PlanningGhcData > sessions > Session > sessionSettings`

**Title:** SessionSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Conditions on the position of the class unit.

| Property                                                                                                              | Pattern | Type             | Deprecated | Definition                         | Title/Description                                                                                              |
| --------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| - [avoidFirstHourSessions](#sessions_items_sessionSettings_avoidFirstHourSessions )                                   | No      | boolean          | No         | -                                  | It penalises the position of the class units if more than 50% of the class units are at first hour.            |
| - [avoidLastHourSessions](#sessions_items_sessionSettings_avoidLastHourSessions )                                     | No      | boolean          | No         | -                                  | It penalises the position of the class units if more than 50% of the class units are at last hour.             |
| - [avoidAssingLastHourAndFirstNextDay](#sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay )           | No      | boolean          | No         | -                                  | It penalises if the last hour and the first hour of the following day match.                                   |
| - [sameHourPreference](#sessions_items_sessionSettings_sameHourPreference )                                           | No      | enum (of string) | No         | -                                  | Preference over class units that coincide in the same time slot.                                               |
| - [avoidAfternoonSessions](#sessions_items_sessionSettings_avoidAfternoonSessions )                                   | No      | boolean          | No         | -                                  | It penalises if there is more than one class unit after noon stop..                                            |
| - [avoidAfterBreakSessions](#sessions_items_sessionSettings_avoidAfterBreakSessions )                                 | No      | boolean          | No         | -                                  | It penalises if more than 50% of the class unit are after the last break of the day.                           |
| - [nonBreakInTheMiddleOfConsecutiveSession](#sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession ) | No      | boolean          | No         | -                                  | Do not allow breaks between consecutive class units (class duration of more than one section).                 |
| - [nonBreakInTheMiddleOfSession](#sessions_items_sessionSettings_nonBreakInTheMiddleOfSession )                       | No      | boolean          | No         | -                                  | Do not allow breaks between class units of multiple duration (class duration of more than one section).        |
| - [followedDaysPreference](#sessions_items_sessionSettings_followedDaysPreference )                                   | No      | enum (of string) | No         | -                                  | If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.    |
| - [consecutiveWeeksBorders](#sessions_items_sessionSettings_consecutiveWeeksBorders )                                 | No      | boolean          | No         | -                                  | It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'. |
| - [samePositionEveryPeriod](#sessions_items_sessionSettings_samePositionEveryPeriod )                                 | No      | enum (of string) | No         | In #/$defs/samePositionEveryPeriod | SamePositionEveryPeriod                                                                                        |

##### <a name="sessions_items_sessionSettings_avoidFirstHourSessions"></a>13.1.12.1. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidFirstHourSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises the position of the class units if more than 50% of the class units are at first hour.

##### <a name="sessions_items_sessionSettings_avoidLastHourSessions"></a>13.1.12.2. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidLastHourSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises the position of the class units if more than 50% of the class units are at last hour.

##### <a name="sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay"></a>13.1.12.3. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidAssingLastHourAndFirstNextDay`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if the last hour and the first hour of the following day match.

##### <a name="sessions_items_sessionSettings_sameHourPreference"></a>13.1.12.4. Property `PlanningGhcData > sessions > Session > sessionSettings > sameHourPreference`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"ignore"`         |

**Description:** Preference over class units that coincide in the same time slot.

Must be one of:
* "ignore"
* "avoid"
* "same"

##### <a name="sessions_items_sessionSettings_avoidAfternoonSessions"></a>13.1.12.5. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidAfternoonSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if there is more than one class unit after noon stop..

##### <a name="sessions_items_sessionSettings_avoidAfterBreakSessions"></a>13.1.12.6. Property `PlanningGhcData > sessions > Session > sessionSettings > avoidAfterBreakSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if more than 50% of the class unit are after the last break of the day.

##### <a name="sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession"></a>13.1.12.7. Property `PlanningGhcData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfConsecutiveSession`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** Do not allow breaks between consecutive class units (class duration of more than one section).

##### <a name="sessions_items_sessionSettings_nonBreakInTheMiddleOfSession"></a>13.1.12.8. Property `PlanningGhcData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfSession`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Do not allow breaks between class units of multiple duration (class duration of more than one section).

##### <a name="sessions_items_sessionSettings_followedDaysPreference"></a>13.1.12.9. Property `PlanningGhcData > sessions > Session > sessionSettings > followedDaysPreference`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"ignore"`         |

**Description:** If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.

Must be one of:
* "ignore"
* "attempt"
* "avoid"
* "strict"
* "forbidden"

##### <a name="sessions_items_sessionSettings_consecutiveWeeksBorders"></a>13.1.12.10. Property `PlanningGhcData > sessions > Session > sessionSettings > consecutiveWeeksBorders`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.

##### <a name="sessions_items_sessionSettings_samePositionEveryPeriod"></a>13.1.12.11. Property `PlanningGhcData > sessions > Session > sessionSettings > samePositionEveryPeriod`

**Title:** SamePositionEveryPeriod

|                |                                 |
| -------------- | ------------------------------- |
| **Type**       | `enum (of string)`              |
| **Required**   | No                              |
| **Default**    | `"ignore"`                      |
| **Defined in** | #/$defs/samePositionEveryPeriod |

**Description:** Keep the same position every week or period for the class units.

Must be one of:
* "ignore"
* "attempt"
* "avoid"
* "strict"
* "forbidden"

#### <a name="sessions_items_sessionRelations"></a>13.1.13. Property `PlanningGhcData > sessions > Session > sessionRelations`

**Title:** SessionRelations

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.

| Property                                                                             | Pattern | Type             | Deprecated | Definition | Title/Description      |
| ------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | ---------- | ---------------------- |
| - [refSimultaneusGroup](#sessions_items_sessionRelations_refSimultaneusGroup )       | No      | integer          | No         | -          | RefSimultaneusGroup    |
| - [differentDays](#sessions_items_sessionRelations_differentDays )                   | No      | object           | No         | -          | DifferentDays          |
| - [consecutiveGroup](#sessions_items_sessionRelations_consecutiveGroup )             | No      | object           | No         | -          | ConsecutiveGroup       |
| - [nonConsecutiveSessions](#sessions_items_sessionRelations_nonConsecutiveSessions ) | No      | array of integer | No         | -          | NonConsecutiveSessions |
| - [nonSimultaneus](#sessions_items_sessionRelations_nonSimultaneus )                 | No      | array of integer | No         | -          | NonSimultaneus         |
| - [previousTo](#sessions_items_sessionRelations_previousTo )                         | No      | array of integer | No         | -          | PreviousTo             |
| - [afterTo](#sessions_items_sessionRelations_afterTo )                               | No      | array of integer | No         | -          | AfterTo                |
| - [maximumSeparationTo](#sessions_items_sessionRelations_maximumSeparationTo )       | No      | array of object  | No         | -          | MaximumSeparationTo    |
| - [minimumSeparationTo](#sessions_items_sessionRelations_minimumSeparationTo )       | No      | array of object  | No         | -          | MinimumSeparationTo    |

##### <a name="sessions_items_sessionRelations_refSimultaneusGroup"></a>13.1.13.1. Property `PlanningGhcData > sessions > Session > sessionRelations > refSimultaneusGroup`

**Title:** RefSimultaneusGroup

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. 

##### <a name="sessions_items_sessionRelations_differentDays"></a>13.1.13.2. Property `PlanningGhcData > sessions > Session > sessionRelations > differentDays`

**Title:** DifferentDays

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Conditions on this and another class unit cannot coincide on the same day.

| Property                                                                     | Pattern | Type             | Deprecated | Definition | Title/Description                                               |
| ---------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------- |
| + [refSesions](#sessions_items_sessionRelations_differentDays_refSesions )   | No      | array of integer | No         | -          | RefSesions                                                      |
| + [daysSetting](#sessions_items_sessionRelations_differentDays_daysSetting ) | No      | enum (of string) | No         | -          | Keep the same position each week or period for the class units. |

###### <a name="sessions_items_sessionRelations_differentDays_refSesions"></a>13.1.13.2.1. Property `PlanningGhcData > sessions > Session > sessionRelations > differentDays > refSesions`

**Title:** RefSesions

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:**  Sessions identifiers which class units should not be assigned on the same day.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                               | Description         |
| ----------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_differentDays_refSesions_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_differentDays_refSesions_items"></a>13.1.13.2.1.1. PlanningGhcData > sessions > Session > sessionRelations > differentDays > refSesions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="sessions_items_sessionRelations_differentDays_daysSetting"></a>13.1.13.2.2. Property `PlanningGhcData > sessions > Session > sessionRelations > differentDays > daysSetting`

|              |                              |
| ------------ | ---------------------------- |
| **Type**     | `enum (of string)`           |
| **Required** | Yes                          |
| **Default**  | `"indifferentDaysPreferred"` |

**Description:** Keep the same position each week or period for the class units.

Must be one of:
* "nonConsecutiveDaysPreferred"
* "indifferentDaysPreferred"
* "strictNonConsecutiveDays"
* "strictConsecutiveDays"

##### <a name="sessions_items_sessionRelations_consecutiveGroup"></a>13.1.13.3. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup`

**Title:** ConsecutiveGroup

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Contains the references of a continuous sessions group.

| Property                                                                                                    | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                          |
| ----------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
| + [id](#sessions_items_sessionRelations_consecutiveGroup_id )                                               | No      | integer          | No         | -          | Continuous sessions group identifier.                                                                                                      |
| + [refSessions](#sessions_items_sessionRelations_consecutiveGroup_refSessions )                             | No      | array of integer | No         | -          | SessionRefs                                                                                                                                |
| - [order](#sessions_items_sessionRelations_consecutiveGroup_order )                                         | No      | enum (of string) | No         | -          | Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day). |
| - [allowBreakBetweenSessions](#sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions ) | No      | boolean          | No         | -          | Indicates if break between sessions is allowed to keep the relation.                                                                       |

###### <a name="sessions_items_sessionRelations_consecutiveGroup_id"></a>13.1.13.3.1. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Continuous sessions group identifier.

###### <a name="sessions_items_sessionRelations_consecutiveGroup_refSessions"></a>13.1.13.3.2. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > refSessions`

**Title:** SessionRefs

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:** List of the consecutive sessions. Must contain the sesion itself and the proper order of continuity (see 'order' property).

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                   | Description         |
| --------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_consecutiveGroup_refSessions_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_consecutiveGroup_refSessions_items"></a>13.1.13.3.2.1. PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="sessions_items_sessionRelations_consecutiveGroup_order"></a>13.1.13.3.3. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > order`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"unordered"`      |

**Description:** Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day).

Must be one of:
* "unordered"
* "ordered"
* "sameDay"

###### <a name="sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions"></a>13.1.13.3.4. Property `PlanningGhcData > sessions > Session > sessionRelations > consecutiveGroup > allowBreakBetweenSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if break between sessions is allowed to keep the relation.

##### <a name="sessions_items_sessionRelations_nonConsecutiveSessions"></a>13.1.13.4. Property `PlanningGhcData > sessions > Session > sessionRelations > nonConsecutiveSessions`

**Title:** NonConsecutiveSessions

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** Identifiers of the sessions which class units must not be consecutive. This is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                             | Description         |
| --------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_nonConsecutiveSessions_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_nonConsecutiveSessions_items"></a>13.1.13.4.1. PlanningGhcData > sessions > Session > sessionRelations > nonConsecutiveSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

##### <a name="sessions_items_sessionRelations_nonSimultaneus"></a>13.1.13.5. Property `PlanningGhcData > sessions > Session > sessionRelations > nonSimultaneus`

**Title:** NonSimultaneus

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** Identifiers of the sessions that they should not be assigned at the same time. It is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                     | Description         |
| ------------------------------------------------------------------- | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_nonSimultaneus_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_nonSimultaneus_items"></a>13.1.13.5.1. PlanningGhcData > sessions > Session > sessionRelations > nonSimultaneus > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

##### <a name="sessions_items_sessionRelations_previousTo"></a>13.1.13.6. Property `PlanningGhcData > sessions > Session > sessionRelations > previousTo`

**Title:** PreviousTo

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** This indicates that this class unit must be allocated on a previous day to the class units in the list. This is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                 | Description         |
| --------------------------------------------------------------- | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_previousTo_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_previousTo_items"></a>13.1.13.6.1. PlanningGhcData > sessions > Session > sessionRelations > previousTo > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

##### <a name="sessions_items_sessionRelations_afterTo"></a>13.1.13.7. Property `PlanningGhcData > sessions > Session > sessionRelations > afterTo`

**Title:** AfterTo

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | No                 |

**Description:** This indicates that this class unit must be allocated on a subsequent day to the class units in the list. This is a strict condition.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                              | Description         |
| ------------------------------------------------------------ | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_afterTo_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_afterTo_items"></a>13.1.13.7.1. PlanningGhcData > sessions > Session > sessionRelations > afterTo > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

##### <a name="sessions_items_sessionRelations_maximumSeparationTo"></a>13.1.13.8. Property `PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo`

**Title:** MaximumSeparationTo

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains class units to be taught within a maximum number of days of the current class units.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                          | Description                                                                                                           |
| ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| [MaximumSeparationToSession](#sessions_items_sessionRelations_maximumSeparationTo_items) | It contains the session identifier of the class unit to be taught with a number of days in between, and maximum days. |

###### <a name="sessions_items_sessionRelations_maximumSeparationTo_items"></a>13.1.13.8.1. PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession

**Title:** MaximumSeparationToSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains the session identifier of the class unit to be taught with a number of days in between, and maximum days.

| Property                                                                                 | Pattern | Type             | Deprecated | Definition | Title/Description             |
| ---------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ----------------------------- |
| + [refSessions](#sessions_items_sessionRelations_maximumSeparationTo_items_refSessions ) | No      | array of integer | No         | -          | SessionRefs                   |
| + [days](#sessions_items_sessionRelations_maximumSeparationTo_items_days )               | No      | integer          | No         | -          | Days of separation condition. |

###### <a name="sessions_items_sessionRelations_maximumSeparationTo_items_refSessions"></a>13.1.13.8.1.1. Property `PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions`

**Title:** SessionRefs

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:** List of sessions references.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                            | Description         |
| ------------------------------------------------------------------------------------------ | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items"></a>13.1.13.8.1.1.1. PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="sessions_items_sessionRelations_maximumSeparationTo_items_days"></a>13.1.13.8.1.2. Property `PlanningGhcData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > days`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Days of separation condition.

##### <a name="sessions_items_sessionRelations_minimumSeparationTo"></a>13.1.13.9. Property `PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo`

**Title:** MinimumSeparationTo

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** It contains class units that must be taught at least a minimum number of days apart from the current class unit. .

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                          | Description                                                                                                      |
| ---------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| [MinimumSeparationToSession](#sessions_items_sessionRelations_minimumSeparationTo_items) | It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days. |

###### <a name="sessions_items_sessionRelations_minimumSeparationTo_items"></a>13.1.13.9.1. PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession

**Title:** MinimumSeparationToSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days.

| Property                                                                                 | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                       |
| ---------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------- |
| + [refSessions](#sessions_items_sessionRelations_minimumSeparationTo_items_refSessions ) | No      | array of integer | No         | -          | SessionRefs                                                                                             |
| + [days](#sessions_items_sessionRelations_minimumSeparationTo_items_days )               | No      | integer          | No         | -          | Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'. |

###### <a name="sessions_items_sessionRelations_minimumSeparationTo_items_refSessions"></a>13.1.13.9.1.1. Property `PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions`

**Title:** SessionRefs

|              |                    |
| ------------ | ------------------ |
| **Type**     | `array of integer` |
| **Required** | Yes                |

**Description:** List of sessions references.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | 1                  |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                            | Description         |
| ------------------------------------------------------------------------------------------ | ------------------- |
| [SessionRef](#sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items) | Session identifier. |

###### <a name="sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items"></a>13.1.13.9.1.1.1. PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="sessions_items_sessionRelations_minimumSeparationTo_items_days"></a>13.1.13.9.1.2. Property `PlanningGhcData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > days`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'.

#### <a name="sessions_items_department"></a>13.1.14. Property `PlanningGhcData > sessions > Session > department`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Contains the reference of the department of the session.

## <a name="meetings"></a>14. Property `PlanningGhcData > meetings`

**Title:** Meetings

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of meetings between teachers defined in the timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be | Description                         |
| ------------------------------- | ----------------------------------- |
| [Meeting](#meetings_items)      | Sevice of meeting between teachers. |

### <a name="meetings_items"></a>14.1. PlanningGhcData > meetings > Meeting

**Title:** Meeting

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Sevice of meeting between teachers.

| Property                                                        | Pattern | Type            | Deprecated | Definition                                                                                  | Title/Description                                                                                                                                                                                 |
| --------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#meetings_items_id )                                     | No      | string          | No         | -                                                                                           | Session identifier.                                                                                                                                                                               |
| + [refFrame](#meetings_items_refFrame )                         | No      | string          | No         | -                                                                                           | Session's frame identifier.                                                                                                                                                                       |
| + [refTask](#meetings_items_refTask )                           | No      | string          | No         | -                                                                                           | RefTask                                                                                                                                                                                           |
| + [refTeachers](#meetings_items_refTeachers )                   | No      | array of string | No         | -                                                                                           | RefTeachers                                                                                                                                                                                       |
| - [refColourInResult](#meetings_items_refColourInResult )       | No      | string          | No         | -                                                                                           | Colour code used to represent the meeting in the result.                                                                                                                                          |
| + [distribution](#meetings_items_distribution )                 | No      | object          | No         | Same as [distribution](#sessions_items_distribution )                                       | Distribution                                                                                                                                                                                      |
| - [frameTemplate](#meetings_items_frameTemplate )               | No      | array of object | No         | Same as [frameTemplate](#sessions_items_frameTemplate )                                     | SessionFrameTemplate                                                                                                                                                                              |
| - [refClassRoomToAssign](#meetings_items_refClassRoomToAssign ) | No      | object          | No         | Same as [RefClassRoomToAssign](#sessions_items_sessionClassRooms_classRoomsToAssign_items ) | RefClassRoomToAssign                                                                                                                                                                              |
| - [refBuilding](#meetings_items_refBuilding )                   | No      | string          | No         | -                                                                                           | Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom. |
| - [settings](#meetings_items_settings )                         | No      | object          | No         | In #/$defs/nonClassSessionSettings                                                          | NonClassSessionSettings                                                                                                                                                                           |

#### <a name="meetings_items_id"></a>14.1.1. Property `PlanningGhcData > meetings > Meeting > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session identifier.

#### <a name="meetings_items_refFrame"></a>14.1.2. Property `PlanningGhcData > meetings > Meeting > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

#### <a name="meetings_items_refTask"></a>14.1.3. Property `PlanningGhcData > meetings > Meeting > refTask`

**Title:** RefTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

#### <a name="meetings_items_refTeachers"></a>14.1.4. Property `PlanningGhcData > meetings > Meeting > refTeachers`

**Title:** RefTeachers

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | Yes               |

**Description:** List of teachers who in the service.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                 | Description         |
| ----------------------------------------------- | ------------------- |
| [RefTeacher](#meetings_items_refTeachers_items) | Teacher identifier. |

##### <a name="meetings_items_refTeachers_items"></a>14.1.4.1. PlanningGhcData > meetings > Meeting > refTeachers > RefTeacher

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Teacher identifier.

#### <a name="meetings_items_refColourInResult"></a>14.1.5. Property `PlanningGhcData > meetings > Meeting > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the meeting in the result.

#### <a name="meetings_items_distribution"></a>14.1.6. Property `PlanningGhcData > meetings > Meeting > distribution`

**Title:** Distribution

|                           |                                              |
| ------------------------- | -------------------------------------------- |
| **Type**                  | `object`                                     |
| **Required**              | Yes                                          |
| **Additional properties** | Not allowed                                  |
| **Same definition as**    | [distribution](#sessions_items_distribution) |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

#### <a name="meetings_items_frameTemplate"></a>14.1.7. Property `PlanningGhcData > meetings > Meeting > frameTemplate`

**Title:** SessionFrameTemplate

|                        |                                                |
| ---------------------- | ---------------------------------------------- |
| **Type**               | `array of object`                              |
| **Required**           | No                                             |
| **Same definition as** | [frameTemplate](#sessions_items_frameTemplate) |

**Description:** Complete template of preferences.

#### <a name="meetings_items_refClassRoomToAssign"></a>14.1.8. Property `PlanningGhcData > meetings > Meeting > refClassRoomToAssign`

**Title:** RefClassRoomToAssign

|                           |                                                                                    |
| ------------------------- | ---------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                           |
| **Required**              | No                                                                                 |
| **Additional properties** | Not allowed                                                                        |
| **Same definition as**    | [RefClassRoomToAssign](#sessions_items_sessionClassRooms_classRoomsToAssign_items) |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

#### <a name="meetings_items_refBuilding"></a>14.1.9. Property `PlanningGhcData > meetings > Meeting > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

#### <a name="meetings_items_settings"></a>14.1.10. Property `PlanningGhcData > meetings > Meeting > settings`

**Title:** NonClassSessionSettings

|                           |                                 |
| ------------------------- | ------------------------------- |
| **Type**                  | `object`                        |
| **Required**              | No                              |
| **Additional properties** | Not allowed                     |
| **Defined in**            | #/$defs/nonClassSessionSettings |

**Description:** Settings of the meeting.

| Property                                                                           | Pattern | Type             | Deprecated | Definition                                                                                  | Title/Description                                                                                                                                           |
| ---------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [computeForMaxMinOccupancy](#meetings_items_settings_computeForMaxMinOccupancy ) | No      | boolean          | No         | -                                                                                           |  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students. |
| - [samePositionEveryPeriod](#meetings_items_settings_samePositionEveryPeriod )     | No      | enum (of string) | No         | Same as [samePositionEveryPeriod](#sessions_items_sessionSettings_samePositionEveryPeriod ) | SamePositionEveryPeriod                                                                                                                                     |

##### <a name="meetings_items_settings_computeForMaxMinOccupancy"></a>14.1.10.1. Property `PlanningGhcData > meetings > Meeting > settings > computeForMaxMinOccupancy`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:**  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.

##### <a name="meetings_items_settings_samePositionEveryPeriod"></a>14.1.10.2. Property `PlanningGhcData > meetings > Meeting > settings > samePositionEveryPeriod`

**Title:** SamePositionEveryPeriod

|                        |                                                                                    |
| ---------------------- | ---------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                 |
| **Required**           | No                                                                                 |
| **Default**            | `"ignore"`                                                                         |
| **Same definition as** | [samePositionEveryPeriod](#sessions_items_sessionSettings_samePositionEveryPeriod) |

**Description:** Keep the same position every week or period for the class units.

## <a name="complementaryActivities"></a>15. Property `PlanningGhcData > complementaryActivities`

**Title:** ComplementaryActivities

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of complementary activities of the teachers.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                 | Description                                  |
| ----------------------------------------------- | -------------------------------------------- |
| [Complementary](#complementaryActivities_items) | Service of teacher's complementary activity. |

### <a name="complementaryActivities_items"></a>15.1. PlanningGhcData > complementaryActivities > Complementary

**Title:** Complementary

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Service of teacher`s complementary activity.

| Property                                                                       | Pattern | Type            | Deprecated | Definition                                                                                  | Title/Description                                                                                                                                                                                 |
| ------------------------------------------------------------------------------ | ------- | --------------- | ---------- | ------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#complementaryActivities_items_id )                                     | No      | integer         | No         | -                                                                                           | Session identifier.                                                                                                                                                                               |
| + [refFrame](#complementaryActivities_items_refFrame )                         | No      | string          | No         | -                                                                                           | Session's frame identifier.                                                                                                                                                                       |
| + [refTask](#complementaryActivities_items_refTask )                           | No      | string          | No         | -                                                                                           | RefTask                                                                                                                                                                                           |
| + [refTeacher](#complementaryActivities_items_refTeacher )                     | No      | string          | No         | -                                                                                           | RefTeacher                                                                                                                                                                                        |
| - [refColourInResult](#complementaryActivities_items_refColourInResult )       | No      | string          | No         | -                                                                                           | Colour code used to represent the complementary activity in the result.                                                                                                                           |
| + [distribution](#complementaryActivities_items_distribution )                 | No      | object          | No         | Same as [distribution](#sessions_items_distribution )                                       | Distribution                                                                                                                                                                                      |
| - [frameTemplate](#complementaryActivities_items_frameTemplate )               | No      | array of object | No         | Same as [frameTemplate](#sessions_items_frameTemplate )                                     | SessionFrameTemplate                                                                                                                                                                              |
| - [refClassRoomToAssign](#complementaryActivities_items_refClassRoomToAssign ) | No      | object          | No         | Same as [RefClassRoomToAssign](#sessions_items_sessionClassRooms_classRoomsToAssign_items ) | RefClassRoomToAssign                                                                                                                                                                              |
| - [refBuilding](#complementaryActivities_items_refBuilding )                   | No      | string          | No         | -                                                                                           | Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom. |
| - [settings](#complementaryActivities_items_settings )                         | No      | object          | No         | Same as [settings](#meetings_items_settings )                                               | NonClassSessionSettings                                                                                                                                                                           |

#### <a name="complementaryActivities_items_id"></a>15.1.1. Property `PlanningGhcData > complementaryActivities > Complementary > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Session identifier.

#### <a name="complementaryActivities_items_refFrame"></a>15.1.2. Property `PlanningGhcData > complementaryActivities > Complementary > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

#### <a name="complementaryActivities_items_refTask"></a>15.1.3. Property `PlanningGhcData > complementaryActivities > Complementary > refTask`

**Title:** RefTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

#### <a name="complementaryActivities_items_refTeacher"></a>15.1.4. Property `PlanningGhcData > complementaryActivities > Complementary > refTeacher`

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher identifier.

#### <a name="complementaryActivities_items_refColourInResult"></a>15.1.5. Property `PlanningGhcData > complementaryActivities > Complementary > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the complementary activity in the result.

#### <a name="complementaryActivities_items_distribution"></a>15.1.6. Property `PlanningGhcData > complementaryActivities > Complementary > distribution`

**Title:** Distribution

|                           |                                              |
| ------------------------- | -------------------------------------------- |
| **Type**                  | `object`                                     |
| **Required**              | Yes                                          |
| **Additional properties** | Not allowed                                  |
| **Same definition as**    | [distribution](#sessions_items_distribution) |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

#### <a name="complementaryActivities_items_frameTemplate"></a>15.1.7. Property `PlanningGhcData > complementaryActivities > Complementary > frameTemplate`

**Title:** SessionFrameTemplate

|                        |                                                |
| ---------------------- | ---------------------------------------------- |
| **Type**               | `array of object`                              |
| **Required**           | No                                             |
| **Same definition as** | [frameTemplate](#sessions_items_frameTemplate) |

**Description:** Complete template of preferences.

#### <a name="complementaryActivities_items_refClassRoomToAssign"></a>15.1.8. Property `PlanningGhcData > complementaryActivities > Complementary > refClassRoomToAssign`

**Title:** RefClassRoomToAssign

|                           |                                                                                    |
| ------------------------- | ---------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                           |
| **Required**              | No                                                                                 |
| **Additional properties** | Not allowed                                                                        |
| **Same definition as**    | [RefClassRoomToAssign](#sessions_items_sessionClassRooms_classRoomsToAssign_items) |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

#### <a name="complementaryActivities_items_refBuilding"></a>15.1.9. Property `PlanningGhcData > complementaryActivities > Complementary > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

#### <a name="complementaryActivities_items_settings"></a>15.1.10. Property `PlanningGhcData > complementaryActivities > Complementary > settings`

**Title:** NonClassSessionSettings

|                           |                                      |
| ------------------------- | ------------------------------------ |
| **Type**                  | `object`                             |
| **Required**              | No                                   |
| **Additional properties** | Not allowed                          |
| **Same definition as**    | [settings](#meetings_items_settings) |

**Description:** Settings of the meeting.

## <a name="onCallServices"></a>16. Property `PlanningGhcData > onCallServices`

**Title:** OnCallServices

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** List of on-call services of teachers defined in the timetable.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be        | Description                                                          |
| -------------------------------------- | -------------------------------------------------------------------- |
| [OnCallService](#onCallServices_items) | On-call service of teachers who supervise the free time of students. |

### <a name="onCallServices_items"></a>16.1. PlanningGhcData > onCallServices > OnCallService

**Title:** OnCallService

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** On-call service of teachers who supervise the free time of students.

| Property                                                            | Pattern | Type            | Deprecated | Definition                                                                                    | Title/Description                                                                                                                                         |
| ------------------------------------------------------------------- | ------- | --------------- | ---------- | --------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#onCallServices_items_id )                                   | No      | string          | No         | -                                                                                             | On-Call service identifier.                                                                                                                               |
| + [refFrame](#onCallServices_items_refFrame )                       | No      | string          | No         | -                                                                                             | Identifier of the frame where the service will be set.                                                                                                    |
| - [refPeriods](#onCallServices_items_refPeriods )                   | No      | array of string | No         | -                                                                                             | RefPeriods                                                                                                                                                |
| + [refTask](#onCallServices_items_refTask )                         | No      | string          | No         | -                                                                                             | Task identifier.                                                                                                                                          |
| - [inBreak](#onCallServices_items_inBreak )                         | No      | boolean         | No         | -                                                                                             | It indicates whether it is a break supervision.                                                                                                           |
| + [teachersEachSection](#onCallServices_items_teachersEachSection ) | No      | object          | No         | -                                                                                             | TeachersEachSection                                                                                                                                       |
| + [refTeachers](#onCallServices_items_refTeachers )                 | No      | array of object | No         | -                                                                                             | RefTeachersOnCall                                                                                                                                         |
| - [refColourInResult](#onCallServices_items_refColourInResult )     | No      | string          | No         | -                                                                                             | Colour code used to represent the on-call service in the result.                                                                                          |
| - [frameTemplate](#onCallServices_items_frameTemplate )             | No      | array of object | No         | Same as [teacherFrameTemplate](#onCallServices_items_refTeachers_items_teacherFrameTemplate ) | OnCallTemplate                                                                                                                                            |
| - [refBuilding](#onCallServices_items_refBuilding )                 | No      | string          | No         | -                                                                                             | Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers. |
| - [settings](#onCallServices_items_settings )                       | No      | object          | No         | Same as [settings](#meetings_items_settings )                                                 | NonClassSessionSettings                                                                                                                                   |

#### <a name="onCallServices_items_id"></a>16.1.1. Property `PlanningGhcData > onCallServices > OnCallService > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** On-Call service identifier.

#### <a name="onCallServices_items_refFrame"></a>16.1.2. Property `PlanningGhcData > onCallServices > OnCallService > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the frame where the service will be set.

#### <a name="onCallServices_items_refPeriods"></a>16.1.3. Property `PlanningGhcData > onCallServices > OnCallService > refPeriods`

**Title:** RefPeriods

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of string` |
| **Required** | No                |

**Description:** List of Periods when the service must be set.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                     | Description        |
| --------------------------------------------------- | ------------------ |
| [RefPeriod](#onCallServices_items_refPeriods_items) | Period identifier. |

##### <a name="onCallServices_items_refPeriods_items"></a>16.1.3.1. PlanningGhcData > onCallServices > OnCallService > refPeriods > RefPeriod

**Title:** RefPeriod

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Period identifier.

#### <a name="onCallServices_items_refTask"></a>16.1.4. Property `PlanningGhcData > onCallServices > OnCallService > refTask`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

#### <a name="onCallServices_items_inBreak"></a>16.1.5. Property `PlanningGhcData > onCallServices > OnCallService > inBreak`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether it is a break supervision.

#### <a name="onCallServices_items_teachersEachSection"></a>16.1.6. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection`

**Title:** TeachersEachSection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Information about number of teacher in all sections.

| Property                                                            | Pattern | Type            | Deprecated | Definition | Title/Description                                    |
| ------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ---------------------------------------------------- |
| - [byDefault](#onCallServices_items_teachersEachSection_byDefault ) | No      | integer         | No         | -          | Default value for number of teacher in all sections. |
| - [bySection](#onCallServices_items_teachersEachSection_bySection ) | No      | array of object | No         | -          | TeachersBySections                                   |

##### <a name="onCallServices_items_teachersEachSection_byDefault"></a>16.1.6.1. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > byDefault`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Default value for number of teacher in all sections.

##### <a name="onCallServices_items_teachersEachSection_bySection"></a>16.1.6.2. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection`

**Title:** TeachersBySections

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | No                |

**Description:** Custom number of teachers in each section.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                | Description                                         |
| ------------------------------------------------------------------------------ | --------------------------------------------------- |
| [TeachersBySection](#onCallServices_items_teachersEachSection_bySection_items) | Custom number of teachers in one timetable section. |

###### <a name="onCallServices_items_teachersEachSection_bySection_items"></a>16.1.6.2.1. PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection

**Title:** TeachersBySection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Custom number of teachers in one timetable section.

| Property                                                                                | Pattern | Type    | Deprecated | Definition | Title/Description                                        |
| --------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------- |
| + [day](#onCallServices_items_teachersEachSection_bySection_items_day )                 | No      | integer | No         | -          | Day of the week.                                         |
| + [index](#onCallServices_items_teachersEachSection_bySection_items_index )             | No      | integer | No         | -          | Index of the section.                                    |
| + [numTeachers](#onCallServices_items_teachersEachSection_bySection_items_numTeachers ) | No      | integer | No         | -          | Custom number of teachers to be assigned in the section. |

###### <a name="onCallServices_items_teachersEachSection_bySection_items_day"></a>16.1.6.2.1.1. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week.

###### <a name="onCallServices_items_teachersEachSection_bySection_items_index"></a>16.1.6.2.1.2. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index of the section.

###### <a name="onCallServices_items_teachersEachSection_bySection_items_numTeachers"></a>16.1.6.2.1.3. Property `PlanningGhcData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > numTeachers`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Custom number of teachers to be assigned in the section.

#### <a name="onCallServices_items_refTeachers"></a>16.1.7. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers`

**Title:** RefTeachersOnCall

|              |                   |
| ------------ | ----------------- |
| **Type**     | `array of object` |
| **Required** | Yes               |

**Description:** List of teachers who in the service.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                       | Description                                                           |
| ----------------------------------------------------- | --------------------------------------------------------------------- |
| [RefTeacher](#onCallServices_items_refTeachers_items) | It contains a teacher reference and the number of section oversight . |

##### <a name="onCallServices_items_refTeachers_items"></a>16.1.7.1. PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher

**Title:** RefTeacher

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains a teacher reference and the number of section oversight .

| Property                                                                                | Pattern | Type            | Deprecated | Definition                            | Title/Description                                            |
| --------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------- | ------------------------------------------------------------ |
| + [teacherId](#onCallServices_items_refTeachers_items_teacherId )                       | No      | string          | No         | -                                     | Teacher identifier.                                          |
| + [numOfSections](#onCallServices_items_refTeachers_items_numOfSections )               | No      | integer         | No         | -                                     | Number of on-call services to be done weekly by the teacher. |
| - [teacherFrameTemplate](#onCallServices_items_refTeachers_items_teacherFrameTemplate ) | No      | array of object | No         | In #/$defs/onCallServiceframeTemplate | OnCallTemplate                                               |

###### <a name="onCallServices_items_refTeachers_items_teacherId"></a>16.1.7.1.1. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherId`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher identifier.

###### <a name="onCallServices_items_refTeachers_items_numOfSections"></a>16.1.7.1.2. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > numOfSections`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |
| **Default**  | `1`       |

**Description:** Number of on-call services to be done weekly by the teacher.

###### <a name="onCallServices_items_refTeachers_items_teacherFrameTemplate"></a>16.1.7.1.3. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate`

**Title:** OnCallTemplate

|                |                                    |
| -------------- | ---------------------------------- |
| **Type**       | `array of object`                  |
| **Required**   | No                                 |
| **Defined in** | #/$defs/onCallServiceframeTemplate |

**Description:** Template with teacher's preferences in the on-call service.

|                      | Array restrictions |
| -------------------- | ------------------ |
| **Min items**        | N/A                |
| **Max items**        | N/A                |
| **Items unicity**    | False              |
| **Additional items** | False              |
| **Tuple validation** | See below          |

| Each item of this array must be                                                               | Description                                                              |
| --------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| [OnCallSectionPreference](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items) | Template with a teacher section assignment preference about the service. |

###### <a name="onCallServices_items_refTeachers_items_teacherFrameTemplate_items"></a>16.1.7.1.3.1. PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference

**Title:** OnCallSectionPreference

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Template with a teacher section assignment preference about the service.

| Property                                                                             | Pattern | Type             | Deprecated | Definition | Title/Description                                  |
| ------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | ---------- | -------------------------------------------------- |
| + [day](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when is located the section.       |
| + [index](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index ) | No      | integer          | No         | -          | Index inside the day where is located the section. |
| + [frame](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame ) | No      | string           | No         | -          | Identifier name of the frame.                      |
| + [type](#onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeBannedPreset                  |

###### <a name="onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day"></a>16.1.7.1.3.1.1. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when is located the section.

###### <a name="onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index"></a>16.1.7.1.3.1.2. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index inside the day where is located the section.

###### <a name="onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame"></a>16.1.7.1.3.1.3. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the frame.

###### <a name="onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type"></a>16.1.7.1.3.1.4. Property `PlanningGhcData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > type`

**Title:** SectionPreferenceTypeBannedPreset

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Teacher availability to be assigned to the section.

Must be one of:
* "banned"
* "preset"

#### <a name="onCallServices_items_refColourInResult"></a>16.1.8. Property `PlanningGhcData > onCallServices > OnCallService > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the on-call service in the result.

#### <a name="onCallServices_items_frameTemplate"></a>16.1.9. Property `PlanningGhcData > onCallServices > OnCallService > frameTemplate`

**Title:** OnCallTemplate

|                        |                                                                                      |
| ---------------------- | ------------------------------------------------------------------------------------ |
| **Type**               | `array of object`                                                                    |
| **Required**           | No                                                                                   |
| **Same definition as** | [teacherFrameTemplate](#onCallServices_items_refTeachers_items_teacherFrameTemplate) |

**Description:** Template with teacher's preferences in the on-call service.

#### <a name="onCallServices_items_refBuilding"></a>16.1.10. Property `PlanningGhcData > onCallServices > OnCallService > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.

#### <a name="onCallServices_items_settings"></a>16.1.11. Property `PlanningGhcData > onCallServices > OnCallService > settings`

**Title:** NonClassSessionSettings

|                           |                                      |
| ------------------------- | ------------------------------------ |
| **Type**                  | `object`                             |
| **Required**              | No                                   |
| **Additional properties** | Not allowed                          |
| **Same definition as**    | [settings](#meetings_items_settings) |

**Description:** Settings of the meeting.

## <a name="optimizationWeights"></a>17. Property `PlanningGhcData > optimizationWeights`

**Title:** OptimizationWeights

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.

| Property                                                               | Pattern | Type   | Deprecated | Definition | Title/Description                 |
| ---------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | --------------------------------- |
| - [timetableGaps](#optimizationWeights_timetableGaps )                 | No      | object | No         | -          | TimetableGaps                     |
| - [nonPreferredPositions](#optimizationWeights_nonPreferredPositions ) | No      | object | No         | -          | NonPreferredPositionsOptimization |
| - [sessions](#optimizationWeights_sessions )                           | No      | object | No         | -          | SessionsOptimization              |
| - [teachers](#optimizationWeights_teachers )                           | No      | object | No         | -          | TeachersOptimization              |

### <a name="optimizationWeights_timetableGaps"></a>17.1. Property `PlanningGhcData > optimizationWeights > timetableGaps`

**Title:** TimetableGaps

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to timetable-gaps weights.

| Property                                                         | Pattern | Type    | Deprecated | Definition | Title/Description                                                                  |
| ---------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------- |
| - [groupGaps](#optimizationWeights_timetableGaps_groupGaps )     | No      | integer | No         | -          | It indicates the weight given to the fact of leaving gaps in groups' timetables.   |
| - [teacherGaps](#optimizationWeights_timetableGaps_teacherGaps ) | No      | integer | No         | -          | It indicates the weight given to the fact of leaving gaps in teachers' timetables. |

#### <a name="optimizationWeights_timetableGaps_groupGaps"></a>17.1.1. Property `PlanningGhcData > optimizationWeights > timetableGaps > groupGaps`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `5`       |

**Description:** It indicates the weight given to the fact of leaving gaps in groups' timetables.

#### <a name="optimizationWeights_timetableGaps_teacherGaps"></a>17.1.2. Property `PlanningGhcData > optimizationWeights > timetableGaps > teacherGaps`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight given to the fact of leaving gaps in teachers' timetables.

### <a name="optimizationWeights_nonPreferredPositions"></a>17.2. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions`

**Title:** NonPreferredPositionsOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to allocation in non-preferred sections.

| Property                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                                                                          |
| ------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------ |
| - [inGroups](#optimizationWeights_nonPreferredPositions_inGroups )                   | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a group.             |
| - [inTeachers](#optimizationWeights_nonPreferredPositions_inTeachers )               | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a teacher.           |
| - [inSubjectsAndTask](#optimizationWeights_nonPreferredPositions_inSubjectsAndTask ) | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a subject or a task. |
| - [inSessions](#optimizationWeights_nonPreferredPositions_inSessions )               | No      | integer | No         | -          | Indicates the weight to be placed in a non-preferential section of a session.              |

#### <a name="optimizationWeights_nonPreferredPositions_inGroups"></a>17.2.1. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inGroups`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `4`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a group.

#### <a name="optimizationWeights_nonPreferredPositions_inTeachers"></a>17.2.2. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inTeachers`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a teacher.

#### <a name="optimizationWeights_nonPreferredPositions_inSubjectsAndTask"></a>17.2.3. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inSubjectsAndTask`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a subject or a task.

#### <a name="optimizationWeights_nonPreferredPositions_inSessions"></a>17.2.4. Property `PlanningGhcData > optimizationWeights > nonPreferredPositions > inSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** Indicates the weight to be placed in a non-preferential section of a session.

### <a name="optimizationWeights_sessions"></a>17.3. Property `PlanningGhcData > optimizationWeights > sessions`

**Title:** SessionsOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to optimisable conditions for sessions.

| Property                                                                                      | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                          |
| --------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [nonPreferredClassRoom](#optimizationWeights_sessions_nonPreferredClassRoom )               | No      | integer | No         | -          | It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.                                                   |
| - [samePositionEveryPeriod](#optimizationWeights_sessions_samePositionEveryPeriod )           | No      | integer | No         | -          | It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).                                                                                                 |
| - [consecutiveDays](#optimizationWeights_sessions_consecutiveDays )                           | No      | integer | No         | -          | It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.                                                                  |
| - [bordersTimetable](#optimizationWeights_sessions_bordersTimetable )                         | No      | integer | No         | -          | It indicates the weight of the class units assigned at the ends of the timetable.                                                                                                                                                                          |
| - [afternoonOrAfterBreakClasses](#optimizationWeights_sessions_afternoonOrAfterBreakClasses ) | No      | integer | No         | -          | It indicates the weight of the penalty of having class units after the last break or in the afternoon.                                                                                                                                                     |
| - [sameHourSessionClasses](#optimizationWeights_sessions_sameHourSessionClasses )             | No      | integer | No         | -          | It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.                                                                                                                                               |
| - [classRoomsChanges](#optimizationWeights_sessions_classRoomsChanges )                       | No      | integer | No         | -          | It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break. |

#### <a name="optimizationWeights_sessions_nonPreferredClassRoom"></a>17.3.1. Property `PlanningGhcData > optimizationWeights > sessions > nonPreferredClassRoom`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.

#### <a name="optimizationWeights_sessions_samePositionEveryPeriod"></a>17.3.2. Property `PlanningGhcData > optimizationWeights > sessions > samePositionEveryPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).

#### <a name="optimizationWeights_sessions_consecutiveDays"></a>17.3.3. Property `PlanningGhcData > optimizationWeights > sessions > consecutiveDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.

#### <a name="optimizationWeights_sessions_bordersTimetable"></a>17.3.4. Property `PlanningGhcData > optimizationWeights > sessions > bordersTimetable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of the class units assigned at the ends of the timetable.

#### <a name="optimizationWeights_sessions_afternoonOrAfterBreakClasses"></a>17.3.5. Property `PlanningGhcData > optimizationWeights > sessions > afternoonOrAfterBreakClasses`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the penalty of having class units after the last break or in the afternoon.

#### <a name="optimizationWeights_sessions_sameHourSessionClasses"></a>17.3.6. Property `PlanningGhcData > optimizationWeights > sessions > sameHourSessionClasses`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.

#### <a name="optimizationWeights_sessions_classRoomsChanges"></a>17.3.7. Property `PlanningGhcData > optimizationWeights > sessions > classRoomsChanges`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.

### <a name="optimizationWeights_teachers"></a>17.4. Property `PlanningGhcData > optimizationWeights > teachers`

**Title:** TeachersOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to optimisable conditions for teachers.

| Property                                                                                    | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                               |
| ------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [teacherIncompatibities](#optimizationWeights_teachers_teacherIncompatibities )           | No      | integer | No         | -          | It indicates the weight of the teacher's incompatibilities that can be optimised.                                                                                               |
| - [uniformDailyDistribution](#optimizationWeights_teachers_uniformDailyDistribution )       | No      | integer | No         | -          | It indicates the weight of placing a teacher's class units in a non-uniform way during the week.                                                                                |
| - [excessContinuousTeaching](#optimizationWeights_teachers_excessContinuousTeaching )       | No      | integer | No         | -          | It indicates the weight of placing more continuous class units than those declared in the settings.                                                                             |
| - [excessPermanence](#optimizationWeights_teachers_excessPermanence )                       | No      | integer | No         | -          | It indicates the weight of assigning more daily or weekly stay than the declared in the settings.                                                                               |
| - [continuousSessionsWithGroup](#optimizationWeights_teachers_continuousSessionsWithGroup ) | No      | integer | No         | -          | It indicates the weight of having consecutive class units taught to the same group.                                                                                             |
| - [onCallSectionsOnBorders](#optimizationWeights_teachers_onCallSectionsOnBorders )         | No      | integer | No         | -          | It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units. |
| - [teacherOrder](#optimizationWeights_teachers_teacherOrder )                               | No      | integer | No         | -          | It indicates the weight of the teacher order not being assigned with a preference besides other teachers.                                                                       |

#### <a name="optimizationWeights_teachers_teacherIncompatibities"></a>17.4.1. Property `PlanningGhcData > optimizationWeights > teachers > teacherIncompatibities`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the teacher's incompatibilities that can be optimised.

#### <a name="optimizationWeights_teachers_uniformDailyDistribution"></a>17.4.2. Property `PlanningGhcData > optimizationWeights > teachers > uniformDailyDistribution`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of placing a teacher's class units in a non-uniform way during the week.

#### <a name="optimizationWeights_teachers_excessContinuousTeaching"></a>17.4.3. Property `PlanningGhcData > optimizationWeights > teachers > excessContinuousTeaching`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of placing more continuous class units than those declared in the settings.

#### <a name="optimizationWeights_teachers_excessPermanence"></a>17.4.4. Property `PlanningGhcData > optimizationWeights > teachers > excessPermanence`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of assigning more daily or weekly stay than the declared in the settings.

#### <a name="optimizationWeights_teachers_continuousSessionsWithGroup"></a>17.4.5. Property `PlanningGhcData > optimizationWeights > teachers > continuousSessionsWithGroup`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of having consecutive class units taught to the same group.

#### <a name="optimizationWeights_teachers_onCallSectionsOnBorders"></a>17.4.6. Property `PlanningGhcData > optimizationWeights > teachers > onCallSectionsOnBorders`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.

#### <a name="optimizationWeights_teachers_teacherOrder"></a>17.4.7. Property `PlanningGhcData > optimizationWeights > teachers > teacherOrder`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of the teacher order not being assigned with a preference besides other teachers.

## <a name="engineSettings"></a>18. Property `PlanningGhcData > engineSettings`

**Title:** EngineSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Customised engine configuration parameters.

| Property                                                          | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                            |
| ----------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| - [teacherBalance](#engineSettings_teacherBalance )               | No      | boolean | No         | -          | It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.                                                                                                               |
| - [countGapsAroundMidday](#engineSettings_countGapsAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable. |

### <a name="engineSettings_teacherBalance"></a>18.1. Property `PlanningGhcData > engineSettings > teacherBalance`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.

### <a name="engineSettings_countGapsAroundMidday"></a>18.2. Property `PlanningGhcData > engineSettings > countGapsAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.

----------------------------------------------------------------------------------------------------------------------------
Generated using [json-schema-for-humans](https://github.com/coveooss/json-schema-for-humans) on 2026-11-09 at 14:56:28 +0100
