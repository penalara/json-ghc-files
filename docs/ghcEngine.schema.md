# GhcEngineSchema

- [1. Property `GhcEngineSchema > id`](#id)
- [2. Property `GhcEngineSchema > meta`](#meta)
  - [2.1. Property `GhcEngineSchema > meta > name`](#meta_name)
  - [2.2. Property `GhcEngineSchema > meta > versionJson`](#meta_versionJson)
  - [2.3. Property `GhcEngineSchema > meta > createdDate`](#meta_createdDate)
  - [2.4. Property `GhcEngineSchema > meta > lastModifiedDate`](#meta_lastModifiedDate)
  - [2.5. Property `GhcEngineSchema > meta > refUser`](#meta_refUser)
  - [2.6. Property `GhcEngineSchema > meta > source`](#meta_source)
  - [2.7. Property `GhcEngineSchema > meta > fullMode`](#meta_fullMode)
- [3. Property `GhcEngineSchema > planningData`](#planningData)
  - [3.1. Property `GhcEngineSchema > planningData > periods`](#planningData_periods)
    - [3.1.1. Property `GhcEngineSchema > planningData > periods > followedPeriods`](#planningData_periods_followedPeriods)
    - [3.1.2. Property `GhcEngineSchema > planningData > periods > periodsList`](#planningData_periods_periodsList)
      - [3.1.2.1. GhcEngineSchema > planningData > periods > periodsList > Period](#planningData_periods_periodsList_items)
        - [3.1.2.1.1. Property `GhcEngineSchema > planningData > periods > periodsList > Period > id`](#planningData_periods_periodsList_items_id)
        - [3.1.2.1.2. Property `GhcEngineSchema > planningData > periods > periodsList > Period > alias`](#planningData_periods_periodsList_items_alias)
        - [3.1.2.1.3. Property `GhcEngineSchema > planningData > periods > periodsList > Period > lastDay`](#planningData_periods_periodsList_items_lastDay)
        - [3.1.2.1.4. Property `GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases`](#planningData_periods_periodsList_items_dayAliases)
          - [3.1.2.1.4.1. GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition](#planningData_periods_periodsList_items_dayAliases_items)
            - [3.1.2.1.4.1.1. Property `GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > dayId`](#planningData_periods_periodsList_items_dayAliases_items_dayId)
            - [3.1.2.1.4.1.2. Property `GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > alias`](#planningData_periods_periodsList_items_dayAliases_items_alias)
    - [3.1.3. Property `GhcEngineSchema > planningData > periods > periodSets`](#planningData_periods_periodSets)
      - [3.1.3.1. GhcEngineSchema > planningData > periods > periodSets > PeriodsSet](#planningData_periods_periodSets_items)
        - [3.1.3.1.1. Property `GhcEngineSchema > planningData > periods > periodSets > PeriodsSet > id`](#planningData_periods_periodSets_items_id)
        - [3.1.3.1.2. Property `GhcEngineSchema > planningData > periods > periodSets > PeriodsSet > periodList`](#planningData_periods_periodSets_items_periodList)
          - [3.1.3.1.2.1. GhcEngineSchema > planningData > periods > periodSets > PeriodsSet > periodList > periodList items](#planningData_periods_periodSets_items_periodList_items)
  - [3.2. Property `GhcEngineSchema > planningData > frames`](#planningData_frames)
    - [3.2.1. GhcEngineSchema > planningData > frames > Frame](#planningData_frames_items)
      - [3.2.1.1. Property `GhcEngineSchema > planningData > frames > Frame > id`](#planningData_frames_items_id)
      - [3.2.1.2. Property `GhcEngineSchema > planningData > frames > Frame > exKey`](#planningData_frames_items_exKey)
      - [3.2.1.3. Property `GhcEngineSchema > planningData > frames > Frame > days`](#planningData_frames_items_days)
        - [3.2.1.3.1. GhcEngineSchema > planningData > frames > Frame > days > FrameDay](#planningData_frames_items_days_items)
          - [3.2.1.3.1.1. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > day`](#planningData_frames_items_days_items_day)
          - [3.2.1.3.1.2. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections`](#planningData_frames_items_days_items_sections)
            - [3.2.1.3.1.2.1. GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section](#planningData_frames_items_days_items_sections_items)
              - [3.2.1.3.1.2.1.1. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > index`](#planningData_frames_items_days_items_sections_items_index)
              - [3.2.1.3.1.2.1.2. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > entryTime`](#planningData_frames_items_days_items_sections_items_entryTime)
              - [3.2.1.3.1.2.1.3. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > exitTime`](#planningData_frames_items_days_items_sections_items_exitTime)
              - [3.2.1.3.1.2.1.4. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > exKey`](#planningData_frames_items_days_items_sections_items_exKey)
              - [3.2.1.3.1.2.1.5. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > duration`](#planningData_frames_items_days_items_sections_items_duration)
              - [3.2.1.3.1.2.1.6. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > type`](#planningData_frames_items_days_items_sections_items_type)
              - [3.2.1.3.1.2.1.7. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > allowed`](#planningData_frames_items_days_items_sections_items_allowed)
  - [3.3. Property `GhcEngineSchema > planningData > buildings`](#planningData_buildings)
    - [3.3.1. GhcEngineSchema > planningData > buildings > Building](#planningData_buildings_items)
      - [3.3.1.1. Property `GhcEngineSchema > planningData > buildings > Building > id`](#planningData_buildings_items_id)
      - [3.3.1.2. Property `GhcEngineSchema > planningData > buildings > Building > fullName`](#planningData_buildings_items_fullName)
      - [3.3.1.3. Property `GhcEngineSchema > planningData > buildings > Building > distances`](#planningData_buildings_items_distances)
        - [3.3.1.3.1. GhcEngineSchema > planningData > buildings > Building > distances > Distance](#planningData_buildings_items_distances_items)
          - [3.3.1.3.1.1. Property `GhcEngineSchema > planningData > buildings > Building > distances > Distance > refBuilding`](#planningData_buildings_items_distances_items_refBuilding)
          - [3.3.1.3.1.2. Property `GhcEngineSchema > planningData > buildings > Building > distances > Distance > minutes`](#planningData_buildings_items_distances_items_minutes)
  - [3.4. Property `GhcEngineSchema > planningData > classRooms`](#planningData_classRooms)
    - [3.4.1. GhcEngineSchema > planningData > classRooms > Classroom](#planningData_classRooms_items)
      - [3.4.1.1. Property `GhcEngineSchema > planningData > classRooms > Classroom > id`](#planningData_classRooms_items_id)
      - [3.4.1.2. Property `GhcEngineSchema > planningData > classRooms > Classroom > shortName`](#planningData_classRooms_items_shortName)
      - [3.4.1.3. Property `GhcEngineSchema > planningData > classRooms > Classroom > fullName`](#planningData_classRooms_items_fullName)
      - [3.4.1.4. Property `GhcEngineSchema > planningData > classRooms > Classroom > isDedicated`](#planningData_classRooms_items_isDedicated)
      - [3.4.1.5. Property `GhcEngineSchema > planningData > classRooms > Classroom > exKey`](#planningData_classRooms_items_exKey)
      - [3.4.1.6. Property `GhcEngineSchema > planningData > classRooms > Classroom > capacity`](#planningData_classRooms_items_capacity)
      - [3.4.1.7. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate`](#planningData_classRooms_items_frameTemplate)
        - [3.4.1.7.1. GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference](#planningData_classRooms_items_frameTemplate_items)
          - [3.4.1.7.1.1. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > day`](#planningData_classRooms_items_frameTemplate_items_day)
          - [3.4.1.7.1.2. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > index`](#planningData_classRooms_items_frameTemplate_items_index)
          - [3.4.1.7.1.3. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > frame`](#planningData_classRooms_items_frameTemplate_items_frame)
      - [3.4.1.8. Property `GhcEngineSchema > planningData > classRooms > Classroom > refBuilding`](#planningData_classRooms_items_refBuilding)
      - [3.4.1.9. Property `GhcEngineSchema > planningData > classRooms > Classroom > fullDay`](#planningData_classRooms_items_fullDay)
  - [3.5. Property `GhcEngineSchema > planningData > classRoomsSets`](#planningData_classRoomsSets)
    - [3.5.1. GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet](#planningData_classRoomsSets_items)
      - [3.5.1.1. Property `GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > id`](#planningData_classRoomsSets_items_id)
      - [3.5.1.2. Property `GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > rooms`](#planningData_classRoomsSets_items_rooms)
        - [3.5.1.2.1. GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > rooms > ClassRoomRef](#planningData_classRoomsSets_items_rooms_items)
      - [3.5.1.3. Property `GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > anonymousRooms`](#planningData_classRoomsSets_items_anonymousRooms)
  - [3.6. Property `GhcEngineSchema > planningData > tasks`](#planningData_tasks)
    - [3.6.1. GhcEngineSchema > planningData > tasks > Task](#planningData_tasks_items)
      - [3.6.1.1. Property `GhcEngineSchema > planningData > tasks > Task > id`](#planningData_tasks_items_id)
      - [3.6.1.2. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate`](#planningData_tasks_items_frameTemplate)
        - [3.6.1.2.1. GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference](#planningData_tasks_items_frameTemplate_items)
          - [3.6.1.2.1.1. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > day`](#planningData_tasks_items_frameTemplate_items_day)
          - [3.6.1.2.1.2. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > index`](#planningData_tasks_items_frameTemplate_items_index)
          - [3.6.1.2.1.3. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > frame`](#planningData_tasks_items_frameTemplate_items_frame)
          - [3.6.1.2.1.4. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > type`](#planningData_tasks_items_frameTemplate_items_type)
      - [3.6.1.3. Property `GhcEngineSchema > planningData > tasks > Task > fullName`](#planningData_tasks_items_fullName)
      - [3.6.1.4. Property `GhcEngineSchema > planningData > tasks > Task > exKey`](#planningData_tasks_items_exKey)
      - [3.6.1.5. Property `GhcEngineSchema > planningData > tasks > Task > refColourInResult`](#planningData_tasks_items_refColourInResult)
  - [3.7. Property `GhcEngineSchema > planningData > teachers`](#planningData_teachers)
    - [3.7.1. GhcEngineSchema > planningData > teachers > Teacher](#planningData_teachers_items)
      - [3.7.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > id`](#planningData_teachers_items_id)
      - [3.7.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > shortName`](#planningData_teachers_items_shortName)
      - [3.7.1.3. Property `GhcEngineSchema > planningData > teachers > Teacher > fullName`](#planningData_teachers_items_fullName)
      - [3.7.1.4. Property `GhcEngineSchema > planningData > teachers > Teacher > exKey`](#planningData_teachers_items_exKey)
      - [3.7.1.5. Property `GhcEngineSchema > planningData > teachers > Teacher > associationIdentifier`](#planningData_teachers_items_associationIdentifier)
      - [3.7.1.6. Property `GhcEngineSchema > planningData > teachers > Teacher > overlappedAssessment`](#planningData_teachers_items_overlappedAssessment)
      - [3.7.1.7. Property `GhcEngineSchema > planningData > teachers > Teacher > frameTemplate`](#planningData_teachers_items_frameTemplate)
      - [3.7.1.8. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings`](#planningData_teachers_items_generalSettings)
        - [3.7.1.8.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay`](#planningData_teachers_items_generalSettings_weeklyStay)
          - [3.7.1.8.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay > strict`](#planningData_teachers_items_generalSettings_weeklyStay_strict)
          - [3.7.1.8.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay > preferable`](#planningData_teachers_items_generalSettings_weeklyStay_preferable)
          - [3.7.1.8.1.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay > countAroundMidday`](#planningData_teachers_items_generalSettings_weeklyStay_countAroundMidday)
        - [3.7.1.8.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay`](#planningData_teachers_items_generalSettings_dailyStay)
          - [3.7.1.8.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay > strict`](#planningData_teachers_items_generalSettings_dailyStay_strict)
          - [3.7.1.8.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay > preferable`](#planningData_teachers_items_generalSettings_dailyStay_preferable)
          - [3.7.1.8.2.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay > countAroundMidday`](#planningData_teachers_items_generalSettings_dailyStay_countAroundMidday)
        - [3.7.1.8.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > avoidGapsBetweenSesions`](#planningData_teachers_items_generalSettings_avoidGapsBetweenSesions)
        - [3.7.1.8.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching`](#planningData_teachers_items_generalSettings_maxContinuousTeaching)
          - [3.7.1.8.4.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > type`](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type)
          - [3.7.1.8.4.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minutes`](#planningData_teachers_items_generalSettings_maxContinuousTeaching_minutes)
          - [3.7.1.8.4.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minBreak`](#planningData_teachers_items_generalSettings_maxContinuousTeaching_minBreak)
        - [3.7.1.8.5. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > avoidClassesAroundBreak`](#planningData_teachers_items_generalSettings_avoidClassesAroundBreak)
        - [3.7.1.8.6. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes`](#planningData_teachers_items_generalSettings_freeTimes)
          - [3.7.1.8.6.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay`](#planningData_teachers_items_generalSettings_freeTimes_fullDay)
            - [3.7.1.8.6.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > strictDays`](#planningData_teachers_items_generalSettings_freeTimes_fullDay_strictDays)
            - [3.7.1.8.6.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > preferredDays`](#planningData_teachers_items_generalSettings_freeTimes_fullDay_preferredDays)
          - [3.7.1.8.6.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes`](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes)
            - [3.7.1.8.6.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > strictDays`](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes_strictDays)
            - [3.7.1.8.6.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > preferredDays`](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays)
            - [3.7.1.8.6.2.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > minutes`](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes_minutes)
          - [3.7.1.8.6.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes`](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes)
            - [3.7.1.8.6.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > strictDays`](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes_strictDays)
            - [3.7.1.8.6.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > preferredDays`](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays)
            - [3.7.1.8.6.3.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > minutes`](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes_minutes)
          - [3.7.1.8.6.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime`](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime)
            - [3.7.1.8.6.4.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > strictDays`](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays)
            - [3.7.1.8.6.4.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > preferredDays`](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays)
            - [3.7.1.8.6.4.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > minutes`](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes)
        - [3.7.1.8.7. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes`](#planningData_teachers_items_generalSettings_freePartTimes)
          - [3.7.1.8.7.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings`](#planningData_teachers_items_generalSettings_freePartTimes_mornings)
            - [3.7.1.8.7.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > strict`](#planningData_teachers_items_generalSettings_freePartTimes_mornings_strict)
            - [3.7.1.8.7.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > preferable`](#planningData_teachers_items_generalSettings_freePartTimes_mornings_preferable)
          - [3.7.1.8.7.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons`](#planningData_teachers_items_generalSettings_freePartTimes_afternoons)
            - [3.7.1.8.7.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > strict`](#planningData_teachers_items_generalSettings_freePartTimes_afternoons_strict)
            - [3.7.1.8.7.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > preferable`](#planningData_teachers_items_generalSettings_freePartTimes_afternoons_preferable)
          - [3.7.1.8.7.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly`](#planningData_teachers_items_generalSettings_freePartTimes_indistinctly)
            - [3.7.1.8.7.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > strict`](#planningData_teachers_items_generalSettings_freePartTimes_indistinctly_strict)
            - [3.7.1.8.7.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > preferable`](#planningData_teachers_items_generalSettings_freePartTimes_indistinctly_preferable)
        - [3.7.1.8.8. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities`](#planningData_teachers_items_generalSettings_incompatibilities)
          - [3.7.1.8.8.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent)
            - [3.7.1.8.8.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
            - [3.7.1.8.8.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
          - [3.7.1.8.8.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenEndWeekAndStartWeekDays`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays)
            - [3.7.1.8.8.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
            - [3.7.1.8.8.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
          - [3.7.1.8.8.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeFirstOrLastHoursDay`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay)
            - [3.7.1.8.8.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
            - [3.7.1.8.8.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
          - [3.7.1.8.8.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection)
          - [3.7.1.8.8.5. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection)
          - [3.7.1.8.8.6. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection)
          - [3.7.1.8.8.7. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment)
          - [3.7.1.8.8.8. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`](#planningData_teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment)
          - [3.7.1.8.8.9. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeAroundMidday`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday)
            - [3.7.1.8.8.9.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type)
            - [3.7.1.8.8.9.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes)
        - [3.7.1.8.9. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation`](#planningData_teachers_items_generalSettings_dailyOcupation)
          - [3.7.1.8.9.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > allowFreeDays`](#planningData_teachers_items_generalSettings_dailyOcupation_allowFreeDays)
          - [3.7.1.8.9.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching)
            - [3.7.1.8.9.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
            - [3.7.1.8.9.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
            - [3.7.1.8.9.2.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
            - [3.7.1.8.9.2.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
          - [3.7.1.8.9.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumTeaching`](#planningData_teachers_items_generalSettings_dailyOcupation_maximumTeaching)
            - [3.7.1.8.9.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
            - [3.7.1.8.9.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
            - [3.7.1.8.9.3.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
            - [3.7.1.8.9.3.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
          - [3.7.1.8.9.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumOccupancy`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumOccupancy)
            - [3.7.1.8.9.4.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
            - [3.7.1.8.9.4.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
            - [3.7.1.8.9.4.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
            - [3.7.1.8.9.4.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
          - [3.7.1.8.9.5. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumOccupancy`](#planningData_teachers_items_generalSettings_dailyOcupation_maximumOccupancy)
            - [3.7.1.8.9.5.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type)
            - [3.7.1.8.9.5.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes)
            - [3.7.1.8.9.5.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted)
            - [3.7.1.8.9.5.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime)
        - [3.7.1.8.10. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > middayReference`](#planningData_teachers_items_generalSettings_middayReference)
          - [3.7.1.8.10.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > middayReference > refFrame`](#planningData_teachers_items_generalSettings_middayReference_refFrame)
          - [3.7.1.8.10.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > middayReference > strict`](#planningData_teachers_items_generalSettings_middayReference_strict)
        - [3.7.1.8.11. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers`](#planningData_teachers_items_generalSettings_dailyBuildingTransfers)
          - [3.7.1.8.11.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > strict`](#planningData_teachers_items_generalSettings_dailyBuildingTransfers_strict)
          - [3.7.1.8.11.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > preferable`](#planningData_teachers_items_generalSettings_dailyBuildingTransfers_preferable)
      - [3.7.1.9. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings`](#planningData_teachers_items_periodSettings)
        - [3.7.1.9.1. GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting](#planningData_teachers_items_periodSettings_items)
          - [3.7.1.9.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > refPeriod`](#planningData_teachers_items_periodSettings_items_refPeriod)
          - [3.7.1.9.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > weeklyStay`](#planningData_teachers_items_periodSettings_items_weeklyStay)
          - [3.7.1.9.1.3. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyStay`](#planningData_teachers_items_periodSettings_items_dailyStay)
          - [3.7.1.9.1.4. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidGapsBetweenSesions`](#planningData_teachers_items_periodSettings_items_avoidGapsBetweenSesions)
          - [3.7.1.9.1.5. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > maxContinuousTeaching`](#planningData_teachers_items_periodSettings_items_maxContinuousTeaching)
          - [3.7.1.9.1.6. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidClassesAroundBreak`](#planningData_teachers_items_periodSettings_items_avoidClassesAroundBreak)
          - [3.7.1.9.1.7. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > freeTimes`](#planningData_teachers_items_periodSettings_items_freeTimes)
          - [3.7.1.9.1.8. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > freePartTimes`](#planningData_teachers_items_periodSettings_items_freePartTimes)
          - [3.7.1.9.1.9. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > incompatibilities`](#planningData_teachers_items_periodSettings_items_incompatibilities)
          - [3.7.1.9.1.10. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyOcupation`](#planningData_teachers_items_periodSettings_items_dailyOcupation)
          - [3.7.1.9.1.11. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > middayReference`](#planningData_teachers_items_periodSettings_items_middayReference)
          - [3.7.1.9.1.12. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyBuildingTransfers`](#planningData_teachers_items_periodSettings_items_dailyBuildingTransfers)
  - [3.8. Property `GhcEngineSchema > planningData > subjects`](#planningData_subjects)
    - [3.8.1. GhcEngineSchema > planningData > subjects > Subject](#planningData_subjects_items)
      - [3.8.1.1. Property `GhcEngineSchema > planningData > subjects > Subject > id`](#planningData_subjects_items_id)
      - [3.8.1.2. Property `GhcEngineSchema > planningData > subjects > Subject > shortName`](#planningData_subjects_items_shortName)
      - [3.8.1.3. Property `GhcEngineSchema > planningData > subjects > Subject > fullName`](#planningData_subjects_items_fullName)
      - [3.8.1.4. Property `GhcEngineSchema > planningData > subjects > Subject > exKey`](#planningData_subjects_items_exKey)
      - [3.8.1.5. Property `GhcEngineSchema > planningData > subjects > Subject > isStudentMentoring`](#planningData_subjects_items_isStudentMentoring)
      - [3.8.1.6. Property `GhcEngineSchema > planningData > subjects > Subject > technicalTeacher`](#planningData_subjects_items_technicalTeacher)
      - [3.8.1.7. Property `GhcEngineSchema > planningData > subjects > Subject > type`](#planningData_subjects_items_type)
      - [3.8.1.8. Property `GhcEngineSchema > planningData > subjects > Subject > refClassroom`](#planningData_subjects_items_refClassroom)
      - [3.8.1.9. Property `GhcEngineSchema > planningData > subjects > Subject > refClassRoomSetsList`](#planningData_subjects_items_refClassRoomSetsList)
        - [3.8.1.9.1. GhcEngineSchema > planningData > subjects > Subject > refClassRoomSetsList > ClassRoomSetRef](#planningData_subjects_items_refClassRoomSetsList_items)
      - [3.8.1.10. Property `GhcEngineSchema > planningData > subjects > Subject > refColourInResult`](#planningData_subjects_items_refColourInResult)
      - [3.8.1.11. Property `GhcEngineSchema > planningData > subjects > Subject > frameTemplate`](#planningData_subjects_items_frameTemplate)
  - [3.9. Property `GhcEngineSchema > planningData > groups`](#planningData_groups)
    - [3.9.1. GhcEngineSchema > planningData > groups > Group](#planningData_groups_items)
      - [3.9.1.1. Property `GhcEngineSchema > planningData > groups > Group > id`](#planningData_groups_items_id)
      - [3.9.1.2. Property `GhcEngineSchema > planningData > groups > Group > shortName`](#planningData_groups_items_shortName)
      - [3.9.1.3. Property `GhcEngineSchema > planningData > groups > Group > fullName`](#planningData_groups_items_fullName)
      - [3.9.1.4. Property `GhcEngineSchema > planningData > groups > Group > exKey`](#planningData_groups_items_exKey)
      - [3.9.1.5. Property `GhcEngineSchema > planningData > groups > Group > refFrame`](#planningData_groups_items_refFrame)
      - [3.9.1.6. Property `GhcEngineSchema > planningData > groups > Group > frameTemplate`](#planningData_groups_items_frameTemplate)
      - [3.9.1.7. Property `GhcEngineSchema > planningData > groups > Group > numStudents`](#planningData_groups_items_numStudents)
      - [3.9.1.8. Property `GhcEngineSchema > planningData > groups > Group > freeAfternoons`](#planningData_groups_items_freeAfternoons)
      - [3.9.1.9. Property `GhcEngineSchema > planningData > groups > Group > notGaps`](#planningData_groups_items_notGaps)
      - [3.9.1.10. Property `GhcEngineSchema > planningData > groups > Group > gapsAlwaysInNonPreferred`](#planningData_groups_items_gapsAlwaysInNonPreferred)
      - [3.9.1.11. Property `GhcEngineSchema > planningData > groups > Group > refCourse`](#planningData_groups_items_refCourse)
      - [3.9.1.12. Property `GhcEngineSchema > planningData > groups > Group > includedGroups`](#planningData_groups_items_includedGroups)
        - [3.9.1.12.1. GhcEngineSchema > planningData > groups > Group > includedGroups > refGroups](#planningData_groups_items_includedGroups_items)
      - [3.9.1.13. Property `GhcEngineSchema > planningData > groups > Group > refTeacher`](#planningData_groups_items_refTeacher)
      - [3.9.1.14. Property `GhcEngineSchema > planningData > groups > Group > refClassroom`](#planningData_groups_items_refClassroom)
      - [3.9.1.15. Property `GhcEngineSchema > planningData > groups > Group > refClassRoomSetsList`](#planningData_groups_items_refClassRoomSetsList)
        - [3.9.1.15.1. GhcEngineSchema > planningData > groups > Group > refClassRoomSetsList > ClassRoomSetRef](#planningData_groups_items_refClassRoomSetsList_items)
  - [3.10. Property `GhcEngineSchema > planningData > groupSetRelations`](#planningData_groupSetRelations)
    - [3.10.1. GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation](#planningData_groupSetRelations_items)
      - [3.10.1.1. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > id`](#planningData_groupSetRelations_items_id)
      - [3.10.1.2. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > alias`](#planningData_groupSetRelations_items_alias)
      - [3.10.1.3. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression`](#planningData_groupSetRelations_items_expression)
        - [3.10.1.3.1. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > operator`](#planningData_groupSetRelations_items_expression_operator)
        - [3.10.1.3.2. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet`](#planningData_groupSetRelations_items_expression_refGroupSet)
          - [3.10.1.3.2.1. GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet > GroupSetReference](#planningData_groupSetRelations_items_expression_refGroupSet_items)
        - [3.10.1.3.3. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions`](#planningData_groupSetRelations_items_expression_nestedRelationExpressions)
          - [3.10.1.3.3.1. GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions > GroupSetRelationExpression](#planningData_groupSetRelations_items_expression_nestedRelationExpressions_items)
  - [3.11. Property `GhcEngineSchema > planningData > courses`](#planningData_courses)
    - [3.11.1. GhcEngineSchema > planningData > courses > Course](#planningData_courses_items)
      - [3.11.1.1. Property `GhcEngineSchema > planningData > courses > Course > id`](#planningData_courses_items_id)
      - [3.11.1.2. Property `GhcEngineSchema > planningData > courses > Course > fullName`](#planningData_courses_items_fullName)
      - [3.11.1.3. Property `GhcEngineSchema > planningData > courses > Course > exKey`](#planningData_courses_items_exKey)
      - [3.11.1.4. Property `GhcEngineSchema > planningData > courses > Course > courseSubjects`](#planningData_courses_items_courseSubjects)
        - [3.11.1.4.1. GhcEngineSchema > planningData > courses > Course > courseSubjects > CourseSubject](#planningData_courses_items_courseSubjects_items)
          - [3.11.1.4.1.1. Property `GhcEngineSchema > planningData > courses > Course > courseSubjects > CourseSubject > numHours`](#planningData_courses_items_courseSubjects_items_numHours)
          - [3.11.1.4.1.2. Property `GhcEngineSchema > planningData > courses > Course > courseSubjects > CourseSubject > refSubject`](#planningData_courses_items_courseSubjects_items_refSubject)
  - [3.12. Property `GhcEngineSchema > planningData > departments`](#planningData_departments)
    - [3.12.1. GhcEngineSchema > planningData > departments > Department](#planningData_departments_items)
      - [3.12.1.1. Property `GhcEngineSchema > planningData > departments > Department > id`](#planningData_departments_items_id)
      - [3.12.1.2. Property `GhcEngineSchema > planningData > departments > Department > fullName`](#planningData_departments_items_fullName)
      - [3.12.1.3. Property `GhcEngineSchema > planningData > departments > Department > messageToDepartment`](#planningData_departments_items_messageToDepartment)
      - [3.12.1.4. Property `GhcEngineSchema > planningData > departments > Department > isNew`](#planningData_departments_items_isNew)
      - [3.12.1.5. Property `GhcEngineSchema > planningData > departments > Department > exKey`](#planningData_departments_items_exKey)
      - [3.12.1.6. Property `GhcEngineSchema > planningData > departments > Department > email`](#planningData_departments_items_email)
      - [3.12.1.7. Property `GhcEngineSchema > planningData > departments > Department > refTeacher`](#planningData_departments_items_refTeacher)
        - [3.12.1.7.1. GhcEngineSchema > planningData > departments > Department > refTeacher > refTeacher items](#planningData_departments_items_refTeacher_items)
      - [3.12.1.8. Property `GhcEngineSchema > planningData > departments > Department > refSubjects`](#planningData_departments_items_refSubjects)
        - [3.12.1.8.1. GhcEngineSchema > planningData > departments > Department > refSubjects > refSubjects items](#planningData_departments_items_refSubjects_items)
  - [3.13. Property `GhcEngineSchema > planningData > sessions`](#planningData_sessions)
    - [3.13.1. GhcEngineSchema > planningData > sessions > Session](#planningData_sessions_items)
      - [3.13.1.1. Property `GhcEngineSchema > planningData > sessions > Session > id`](#planningData_sessions_items_id)
      - [3.13.1.2. Property `GhcEngineSchema > planningData > sessions > Session > refFrame`](#planningData_sessions_items_refFrame)
      - [3.13.1.3. Property `GhcEngineSchema > planningData > sessions > Session > refMainTask`](#planningData_sessions_items_refMainTask)
      - [3.13.1.4. Property `GhcEngineSchema > planningData > sessions > Session > refMainTeacher`](#planningData_sessions_items_refMainTeacher)
      - [3.13.1.5. Property `GhcEngineSchema > planningData > sessions > Session > refMainSubject`](#planningData_sessions_items_refMainSubject)
      - [3.13.1.6. Property `GhcEngineSchema > planningData > sessions > Session > refMainGroup`](#planningData_sessions_items_refMainGroup)
        - [3.13.1.6.1. Property `GhcEngineSchema > planningData > sessions > Session > refMainGroup > refIdGroup`](#planningData_sessions_items_refMainGroup_refIdGroup)
        - [3.13.1.6.2. Property `GhcEngineSchema > planningData > sessions > Session > refMainGroup > numStudents`](#planningData_sessions_items_refMainGroup_numStudents)
      - [3.13.1.7. Property `GhcEngineSchema > planningData > sessions > Session > refColourInResult`](#planningData_sessions_items_refColourInResult)
      - [3.13.1.8. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms`](#planningData_sessions_items_otherElementsInClassRooms)
        - [3.13.1.8.1. GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms](#planningData_sessions_items_otherElementsInClassRooms_items)
          - [3.13.1.8.1.1. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refSubject`](#planningData_sessions_items_otherElementsInClassRooms_items_refSubject)
          - [3.13.1.8.1.2. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTeacher`](#planningData_sessions_items_otherElementsInClassRooms_items_refTeacher)
          - [3.13.1.8.1.3. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refGroup`](#planningData_sessions_items_otherElementsInClassRooms_items_refGroup)
          - [3.13.1.8.1.4. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTask`](#planningData_sessions_items_otherElementsInClassRooms_items_refTask)
      - [3.13.1.9. Property `GhcEngineSchema > planningData > sessions > Session > distribution`](#planningData_sessions_items_distribution)
        - [3.13.1.9.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > periods`](#planningData_sessions_items_distribution_periods)
          - [3.13.1.9.1.1. GhcEngineSchema > planningData > sessions > Session > distribution > periods > RefPeriod](#planningData_sessions_items_distribution_periods_items)
        - [3.13.1.9.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods`](#planningData_sessions_items_distribution_stablePeriods)
          - [3.13.1.9.2.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTiming`](#planningData_sessions_items_distribution_stablePeriods_stableTiming)
            - [3.13.1.9.2.1.1. GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTiming > DailyMinutes](#planningData_sessions_items_distribution_stablePeriods_stableTiming_items)
          - [3.13.1.9.2.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming`](#planningData_sessions_items_distribution_stablePeriods_variableTiming)
            - [3.13.1.9.2.2.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minutesAmount`](#planningData_sessions_items_distribution_stablePeriods_variableTiming_minutesAmount)
            - [3.13.1.9.2.2.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > maxMinutesDaily`](#planningData_sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily)
            - [3.13.1.9.2.2.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minMinutesDaily`](#planningData_sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily)
            - [3.13.1.9.2.2.4. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMaxDuration`](#planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration)
            - [3.13.1.9.2.2.5. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMinDuration`](#planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration)
            - [3.13.1.9.2.2.6. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > allowDiscontinuity`](#planningData_sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity)
          - [3.13.1.9.2.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTimingList`](#planningData_sessions_items_distribution_stablePeriods_stableTimingList)
            - [3.13.1.9.2.3.1. GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTimingList > StableTiming](#planningData_sessions_items_distribution_stablePeriods_stableTimingList_items)
        - [3.13.1.9.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods`](#planningData_sessions_items_distribution_variablePeriods)
          - [3.13.1.9.3.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > timing`](#planningData_sessions_items_distribution_variablePeriods_timing)
            - [3.13.1.9.3.1.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > timing > stableTiming`](#planningData_sessions_items_distribution_variablePeriods_timing_stableTiming)
            - [3.13.1.9.3.1.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > timing > variableTiming`](#planningData_sessions_items_distribution_variablePeriods_timing_variableTiming)
          - [3.13.1.9.3.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > maximunTimeInPeriod`](#planningData_sessions_items_distribution_variablePeriods_maximunTimeInPeriod)
          - [3.13.1.9.3.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > minimnunTimeInPeriod`](#planningData_sessions_items_distribution_variablePeriods_minimnunTimeInPeriod)
          - [3.13.1.9.3.4. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > maximumTimeframe`](#planningData_sessions_items_distribution_variablePeriods_maximumTimeframe)
      - [3.13.1.10. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms`](#planningData_sessions_items_sessionClassRooms)
        - [3.13.1.10.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign`](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign)
          - [3.13.1.10.1.1. GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items)
            - [3.13.1.10.1.1.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoom`](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom)
            - [3.13.1.10.1.1.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList`](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList)
              - [3.13.1.10.1.1.2.1. GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList > ClassRoomSetRef](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items)
        - [3.13.1.10.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > capacityPreference`](#planningData_sessions_items_sessionClassRooms_capacityPreference)
        - [3.13.1.10.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > capacityType`](#planningData_sessions_items_sessionClassRooms_capacityType)
        - [3.13.1.10.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > alwaysSameClassRoom`](#planningData_sessions_items_sessionClassRooms_alwaysSameClassRoom)
      - [3.13.1.11. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate`](#planningData_sessions_items_frameTemplate)
        - [3.13.1.11.1. GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference](#planningData_sessions_items_frameTemplate_items)
          - [3.13.1.11.1.1. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > day`](#planningData_sessions_items_frameTemplate_items_day)
          - [3.13.1.11.1.2. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > index`](#planningData_sessions_items_frameTemplate_items_index)
          - [3.13.1.11.1.3. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > frame`](#planningData_sessions_items_frameTemplate_items_frame)
          - [3.13.1.11.1.4. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > type`](#planningData_sessions_items_frameTemplate_items_type)
      - [3.13.1.12. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings`](#planningData_sessions_items_sessionSettings)
        - [3.13.1.12.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidFirstHourSessions`](#planningData_sessions_items_sessionSettings_avoidFirstHourSessions)
        - [3.13.1.12.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidLastHourSessions`](#planningData_sessions_items_sessionSettings_avoidLastHourSessions)
        - [3.13.1.12.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidAssingLastHourAndFirstNextDay`](#planningData_sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay)
        - [3.13.1.12.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > sameHourPreference`](#planningData_sessions_items_sessionSettings_sameHourPreference)
        - [3.13.1.12.5. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidAfternoonSessions`](#planningData_sessions_items_sessionSettings_avoidAfternoonSessions)
        - [3.13.1.12.6. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidAfterBreakSessions`](#planningData_sessions_items_sessionSettings_avoidAfterBreakSessions)
        - [3.13.1.12.7. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfConsecutiveSession`](#planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession)
        - [3.13.1.12.8. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfSession`](#planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfSession)
        - [3.13.1.12.9. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > followedDaysPreference`](#planningData_sessions_items_sessionSettings_followedDaysPreference)
        - [3.13.1.12.10. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > consecutiveWeeksBorders`](#planningData_sessions_items_sessionSettings_consecutiveWeeksBorders)
        - [3.13.1.12.11. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > samePositionEveryPeriod`](#planningData_sessions_items_sessionSettings_samePositionEveryPeriod)
      - [3.13.1.13. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations`](#planningData_sessions_items_sessionRelations)
        - [3.13.1.13.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > refSimultaneusGroup`](#planningData_sessions_items_sessionRelations_refSimultaneusGroup)
        - [3.13.1.13.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays`](#planningData_sessions_items_sessionRelations_differentDays)
          - [3.13.1.13.2.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays > refSesions`](#planningData_sessions_items_sessionRelations_differentDays_refSesions)
            - [3.13.1.13.2.1.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays > refSesions > SessionRef](#planningData_sessions_items_sessionRelations_differentDays_refSesions_items)
          - [3.13.1.13.2.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays > daysSetting`](#planningData_sessions_items_sessionRelations_differentDays_daysSetting)
        - [3.13.1.13.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup`](#planningData_sessions_items_sessionRelations_consecutiveGroup)
          - [3.13.1.13.3.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > id`](#planningData_sessions_items_sessionRelations_consecutiveGroup_id)
          - [3.13.1.13.3.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions`](#planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions)
            - [3.13.1.13.3.2.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions > SessionRef](#planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions_items)
          - [3.13.1.13.3.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > order`](#planningData_sessions_items_sessionRelations_consecutiveGroup_order)
          - [3.13.1.13.3.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > allowBreakBetweenSessions`](#planningData_sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions)
        - [3.13.1.13.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions`](#planningData_sessions_items_sessionRelations_nonConsecutiveSessions)
          - [3.13.1.13.4.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions > SessionRef](#planningData_sessions_items_sessionRelations_nonConsecutiveSessions_items)
        - [3.13.1.13.5. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonSimultaneus`](#planningData_sessions_items_sessionRelations_nonSimultaneus)
          - [3.13.1.13.5.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonSimultaneus > SessionRef](#planningData_sessions_items_sessionRelations_nonSimultaneus_items)
        - [3.13.1.13.6. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > previousTo`](#planningData_sessions_items_sessionRelations_previousTo)
          - [3.13.1.13.6.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > previousTo > SessionRef](#planningData_sessions_items_sessionRelations_previousTo_items)
        - [3.13.1.13.7. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > afterTo`](#planningData_sessions_items_sessionRelations_afterTo)
          - [3.13.1.13.7.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > afterTo > SessionRef](#planningData_sessions_items_sessionRelations_afterTo_items)
        - [3.13.1.13.8. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo`](#planningData_sessions_items_sessionRelations_maximumSeparationTo)
          - [3.13.1.13.8.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items)
            - [3.13.1.13.8.1.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions`](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions)
              - [3.13.1.13.8.1.1.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions > SessionRef](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items)
            - [3.13.1.13.8.1.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > days`](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items_days)
        - [3.13.1.13.9. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo`](#planningData_sessions_items_sessionRelations_minimumSeparationTo)
          - [3.13.1.13.9.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items)
            - [3.13.1.13.9.1.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions`](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions)
              - [3.13.1.13.9.1.1.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions > SessionRef](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items)
            - [3.13.1.13.9.1.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > days`](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items_days)
      - [3.13.1.14. Property `GhcEngineSchema > planningData > sessions > Session > department`](#planningData_sessions_items_department)
  - [3.14. Property `GhcEngineSchema > planningData > meetings`](#planningData_meetings)
    - [3.14.1. GhcEngineSchema > planningData > meetings > Meeting](#planningData_meetings_items)
      - [3.14.1.1. Property `GhcEngineSchema > planningData > meetings > Meeting > id`](#planningData_meetings_items_id)
      - [3.14.1.2. Property `GhcEngineSchema > planningData > meetings > Meeting > refFrame`](#planningData_meetings_items_refFrame)
      - [3.14.1.3. Property `GhcEngineSchema > planningData > meetings > Meeting > refTask`](#planningData_meetings_items_refTask)
      - [3.14.1.4. Property `GhcEngineSchema > planningData > meetings > Meeting > refTeachers`](#planningData_meetings_items_refTeachers)
        - [3.14.1.4.1. GhcEngineSchema > planningData > meetings > Meeting > refTeachers > RefTeacher](#planningData_meetings_items_refTeachers_items)
      - [3.14.1.5. Property `GhcEngineSchema > planningData > meetings > Meeting > refColourInResult`](#planningData_meetings_items_refColourInResult)
      - [3.14.1.6. Property `GhcEngineSchema > planningData > meetings > Meeting > distribution`](#planningData_meetings_items_distribution)
      - [3.14.1.7. Property `GhcEngineSchema > planningData > meetings > Meeting > frameTemplate`](#planningData_meetings_items_frameTemplate)
      - [3.14.1.8. Property `GhcEngineSchema > planningData > meetings > Meeting > refClassRoomToAssign`](#planningData_meetings_items_refClassRoomToAssign)
      - [3.14.1.9. Property `GhcEngineSchema > planningData > meetings > Meeting > refBuilding`](#planningData_meetings_items_refBuilding)
      - [3.14.1.10. Property `GhcEngineSchema > planningData > meetings > Meeting > settings`](#planningData_meetings_items_settings)
        - [3.14.1.10.1. Property `GhcEngineSchema > planningData > meetings > Meeting > settings > computeForMaxMinOccupancy`](#planningData_meetings_items_settings_computeForMaxMinOccupancy)
        - [3.14.1.10.2. Property `GhcEngineSchema > planningData > meetings > Meeting > settings > samePositionEveryPeriod`](#planningData_meetings_items_settings_samePositionEveryPeriod)
  - [3.15. Property `GhcEngineSchema > planningData > complementaryActivities`](#planningData_complementaryActivities)
    - [3.15.1. GhcEngineSchema > planningData > complementaryActivities > Complementary](#planningData_complementaryActivities_items)
      - [3.15.1.1. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > id`](#planningData_complementaryActivities_items_id)
      - [3.15.1.2. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refFrame`](#planningData_complementaryActivities_items_refFrame)
      - [3.15.1.3. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refTask`](#planningData_complementaryActivities_items_refTask)
      - [3.15.1.4. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refTeacher`](#planningData_complementaryActivities_items_refTeacher)
      - [3.15.1.5. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refColourInResult`](#planningData_complementaryActivities_items_refColourInResult)
      - [3.15.1.6. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > distribution`](#planningData_complementaryActivities_items_distribution)
      - [3.15.1.7. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > frameTemplate`](#planningData_complementaryActivities_items_frameTemplate)
      - [3.15.1.8. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refClassRoomToAssign`](#planningData_complementaryActivities_items_refClassRoomToAssign)
      - [3.15.1.9. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refBuilding`](#planningData_complementaryActivities_items_refBuilding)
      - [3.15.1.10. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > settings`](#planningData_complementaryActivities_items_settings)
  - [3.16. Property `GhcEngineSchema > planningData > onCallServices`](#planningData_onCallServices)
    - [3.16.1. GhcEngineSchema > planningData > onCallServices > OnCallService](#planningData_onCallServices_items)
      - [3.16.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > id`](#planningData_onCallServices_items_id)
      - [3.16.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refFrame`](#planningData_onCallServices_items_refFrame)
      - [3.16.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refPeriods`](#planningData_onCallServices_items_refPeriods)
        - [3.16.1.3.1. GhcEngineSchema > planningData > onCallServices > OnCallService > refPeriods > RefPeriod](#planningData_onCallServices_items_refPeriods_items)
      - [3.16.1.4. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTask`](#planningData_onCallServices_items_refTask)
      - [3.16.1.5. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > inBreak`](#planningData_onCallServices_items_inBreak)
      - [3.16.1.6. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection`](#planningData_onCallServices_items_teachersEachSection)
        - [3.16.1.6.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > byDefault`](#planningData_onCallServices_items_teachersEachSection_byDefault)
        - [3.16.1.6.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection`](#planningData_onCallServices_items_teachersEachSection_bySection)
          - [3.16.1.6.2.1. GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection](#planningData_onCallServices_items_teachersEachSection_bySection_items)
            - [3.16.1.6.2.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > day`](#planningData_onCallServices_items_teachersEachSection_bySection_items_day)
            - [3.16.1.6.2.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > index`](#planningData_onCallServices_items_teachersEachSection_bySection_items_index)
            - [3.16.1.6.2.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > numTeachers`](#planningData_onCallServices_items_teachersEachSection_bySection_items_numTeachers)
      - [3.16.1.7. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers`](#planningData_onCallServices_items_refTeachers)
        - [3.16.1.7.1. GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher](#planningData_onCallServices_items_refTeachers_items)
          - [3.16.1.7.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherId`](#planningData_onCallServices_items_refTeachers_items_teacherId)
          - [3.16.1.7.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > numOfSections`](#planningData_onCallServices_items_refTeachers_items_numOfSections)
          - [3.16.1.7.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate`](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate)
            - [3.16.1.7.1.3.1. GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items)
              - [3.16.1.7.1.3.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > day`](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day)
              - [3.16.1.7.1.3.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > index`](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index)
              - [3.16.1.7.1.3.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > frame`](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame)
              - [3.16.1.7.1.3.1.4. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > type`](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type)
      - [3.16.1.8. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refColourInResult`](#planningData_onCallServices_items_refColourInResult)
      - [3.16.1.9. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > frameTemplate`](#planningData_onCallServices_items_frameTemplate)
      - [3.16.1.10. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refBuilding`](#planningData_onCallServices_items_refBuilding)
      - [3.16.1.11. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > settings`](#planningData_onCallServices_items_settings)
  - [3.17. Property `GhcEngineSchema > planningData > optimizationWeights`](#planningData_optimizationWeights)
    - [3.17.1. Property `GhcEngineSchema > planningData > optimizationWeights > timetableGaps`](#planningData_optimizationWeights_timetableGaps)
      - [3.17.1.1. Property `GhcEngineSchema > planningData > optimizationWeights > timetableGaps > groupGaps`](#planningData_optimizationWeights_timetableGaps_groupGaps)
      - [3.17.1.2. Property `GhcEngineSchema > planningData > optimizationWeights > timetableGaps > teacherGaps`](#planningData_optimizationWeights_timetableGaps_teacherGaps)
    - [3.17.2. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions`](#planningData_optimizationWeights_nonPreferredPositions)
      - [3.17.2.1. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inGroups`](#planningData_optimizationWeights_nonPreferredPositions_inGroups)
      - [3.17.2.2. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inTeachers`](#planningData_optimizationWeights_nonPreferredPositions_inTeachers)
      - [3.17.2.3. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inSubjectsAndTask`](#planningData_optimizationWeights_nonPreferredPositions_inSubjectsAndTask)
      - [3.17.2.4. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inSessions`](#planningData_optimizationWeights_nonPreferredPositions_inSessions)
    - [3.17.3. Property `GhcEngineSchema > planningData > optimizationWeights > sessions`](#planningData_optimizationWeights_sessions)
      - [3.17.3.1. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > nonPreferredClassRoom`](#planningData_optimizationWeights_sessions_nonPreferredClassRoom)
      - [3.17.3.2. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > samePositionEveryPeriod`](#planningData_optimizationWeights_sessions_samePositionEveryPeriod)
      - [3.17.3.3. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > consecutiveDays`](#planningData_optimizationWeights_sessions_consecutiveDays)
      - [3.17.3.4. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > bordersTimetable`](#planningData_optimizationWeights_sessions_bordersTimetable)
      - [3.17.3.5. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > afternoonOrAfterBreakClasses`](#planningData_optimizationWeights_sessions_afternoonOrAfterBreakClasses)
      - [3.17.3.6. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > sameHourSessionClasses`](#planningData_optimizationWeights_sessions_sameHourSessionClasses)
      - [3.17.3.7. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > classRoomsChanges`](#planningData_optimizationWeights_sessions_classRoomsChanges)
    - [3.17.4. Property `GhcEngineSchema > planningData > optimizationWeights > teachers`](#planningData_optimizationWeights_teachers)
      - [3.17.4.1. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > teacherIncompatibities`](#planningData_optimizationWeights_teachers_teacherIncompatibities)
      - [3.17.4.2. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > uniformDailyDistribution`](#planningData_optimizationWeights_teachers_uniformDailyDistribution)
      - [3.17.4.3. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > excessContinuousTeaching`](#planningData_optimizationWeights_teachers_excessContinuousTeaching)
      - [3.17.4.4. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > excessPermanence`](#planningData_optimizationWeights_teachers_excessPermanence)
      - [3.17.4.5. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > continuousSessionsWithGroup`](#planningData_optimizationWeights_teachers_continuousSessionsWithGroup)
      - [3.17.4.6. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > onCallSectionsOnBorders`](#planningData_optimizationWeights_teachers_onCallSectionsOnBorders)
      - [3.17.4.7. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > teacherOrder`](#planningData_optimizationWeights_teachers_teacherOrder)
  - [3.18. Property `GhcEngineSchema > planningData > engineSettings`](#planningData_engineSettings)
    - [3.18.1. Property `GhcEngineSchema > planningData > engineSettings > teacherBalance`](#planningData_engineSettings_teacherBalance)
    - [3.18.2. Property `GhcEngineSchema > planningData > engineSettings > countGapsAroundMidday`](#planningData_engineSettings_countGapsAroundMidday)
- [4. Property `GhcEngineSchema > results`](#results)
  - [4.1. GhcEngineSchema > results > EngineResult](#results_items)
    - [4.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > date`](#results_items_date)
    - [4.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > weight`](#results_items_weight)
    - [4.1.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable`](#results_items_timetable)
      - [4.1.3.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms`](#results_items_timetable_anonymousClassRooms)
        - [4.1.3.1.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom](#results_items_timetable_anonymousClassRooms_items)
          - [4.1.3.1.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > refClassRoomsSet`](#results_items_timetable_anonymousClassRooms_items_refClassRoomsSet)
          - [4.1.3.1.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated`](#results_items_timetable_anonymousClassRooms_items_classRoomsCreated)
            - [4.1.3.1.1.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated > AnonymousRoom](#results_items_timetable_anonymousClassRooms_items_classRoomsCreated_items)
      - [4.1.3.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections`](#results_items_timetable_assignedSections)
        - [4.1.3.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection](#results_items_timetable_assignedSections_items)
          - [4.1.3.2.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > refFrame`](#results_items_timetable_assignedSections_items_refFrame)
          - [4.1.3.2.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > day`](#results_items_timetable_assignedSections_items_day)
          - [4.1.3.2.1.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > realIndex`](#results_items_timetable_assignedSections_items_realIndex)
          - [4.1.3.2.1.4. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > fictionalIndex`](#results_items_timetable_assignedSections_items_fictionalIndex)
          - [4.1.3.2.1.5. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > startTime`](#results_items_timetable_assignedSections_items_startTime)
          - [4.1.3.2.1.6. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > endTime`](#results_items_timetable_assignedSections_items_endTime)
          - [4.1.3.2.1.7. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment`](#results_items_timetable_assignedSections_items_assignment)
            - [4.1.3.2.1.7.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions`](#results_items_timetable_assignedSections_items_assignment_teachingSessions)
              - [4.1.3.2.1.7.1.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items)
                - [4.1.3.2.1.7.1.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refSession`](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refSession)
                - [4.1.3.2.1.7.1.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms`](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms)
                  - [4.1.3.2.1.7.1.1.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms > RefclassRomm](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items)
                - [4.1.3.2.1.7.1.1.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers`](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers)
                  - [4.1.3.2.1.7.1.1.3.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers > RefTeacher](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items)
            - [4.1.3.2.1.7.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings`](#results_items_timetable_assignedSections_items_assignment_meetings)
              - [4.1.3.2.1.7.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting](#results_items_timetable_assignedSections_items_assignment_meetings_items)
                - [4.1.3.2.1.7.2.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refMeeting`](#results_items_timetable_assignedSections_items_assignment_meetings_items_refMeeting)
                - [4.1.3.2.1.7.2.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refClassRomms`](#results_items_timetable_assignedSections_items_assignment_meetings_items_refClassRomms)
            - [4.1.3.2.1.7.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities`](#results_items_timetable_assignedSections_items_assignment_complementaryActivities)
              - [4.1.3.2.1.7.3.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary](#results_items_timetable_assignedSections_items_assignment_complementaryActivities_items)
                - [4.1.3.2.1.7.3.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refComplementary`](#results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary)
                - [4.1.3.2.1.7.3.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refClassRomms`](#results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms)
            - [4.1.3.2.1.7.4. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices`](#results_items_timetable_assignedSections_items_assignment_onCallServices)
              - [4.1.3.2.1.7.4.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService](#results_items_timetable_assignedSections_items_assignment_onCallServices_items)
                - [4.1.3.2.1.7.4.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refOnCall`](#results_items_timetable_assignedSections_items_assignment_onCallServices_items_refOnCall)
                - [4.1.3.2.1.7.4.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refTeacher`](#results_items_timetable_assignedSections_items_assignment_onCallServices_items_refTeacher)

**Title:** GhcEngineSchema

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Schema with the structure of GHC Engine files

| Property                         | Pattern | Type            | Deprecated | Definition                            | Title/Description |
| -------------------------------- | ------- | --------------- | ---------- | ------------------------------------- | ----------------- |
| - [id](#id )                     | No      | integer         | No         | -                                     | IdFile            |
| + [meta](#meta )                 | No      | object          | No         | -                                     | FileMetadata      |
| + [planningData](#planningData ) | No      | object          | No         | In ../common/planningData.schema.json | PlanningGhcData   |
| - [results](#results )           | No      | array of object | No         | -                                     | EngineResults     |

## <a name="id"></a>1. Property `GhcEngineSchema > id`

**Title:** IdFile

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the id number of the file at the Penalara Server.

## <a name="meta"></a>2. Property `GhcEngineSchema > meta`

**Title:** FileMetadata

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Information about the file.

| Property                                      | Pattern | Type             | Deprecated | Definition | Title/Description  |
| --------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------ |
| + [name](#meta_name )                         | No      | string           | No         | -          | TimetableName      |
| + [versionJson](#meta_versionJson )           | No      | string           | No         | -          | SchemaVersion      |
| + [createdDate](#meta_createdDate )           | No      | string           | No         | -          | JsonCreatedDate    |
| + [lastModifiedDate](#meta_lastModifiedDate ) | No      | string           | No         | -          | JsonGenerationDate |
| + [refUser](#meta_refUser )                   | No      | string           | No         | -          | UserReference      |
| + [source](#meta_source )                     | No      | enum (of string) | No         | -          | SourceModule       |
| - [fullMode](#meta_fullMode )                 | No      | boolean          | No         | -          | FullPlannerMode    |

### <a name="meta_name"></a>2.1. Property `GhcEngineSchema > meta > name`

**Title:** TimetableName

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Name of the Timetable

### <a name="meta_versionJson"></a>2.2. Property `GhcEngineSchema > meta > versionJson`

**Title:** SchemaVersion

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Version of multiplatformGHCSchema used

### <a name="meta_createdDate"></a>2.3. Property `GhcEngineSchema > meta > createdDate`

**Title:** JsonCreatedDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | Yes         |
| **Format**   | `date-time` |

**Description:** Json generation date.

### <a name="meta_lastModifiedDate"></a>2.4. Property `GhcEngineSchema > meta > lastModifiedDate`

**Title:** JsonGenerationDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | Yes         |
| **Format**   | `date-time` |

**Description:** Json last modification date.

### <a name="meta_refUser"></a>2.5. Property `GhcEngineSchema > meta > refUser`

**Title:** UserReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Contains a user reference who owns the file.

### <a name="meta_source"></a>2.6. Property `GhcEngineSchema > meta > source`

**Title:** SourceModule

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Indicates the GHCMultiplatform module that generated the file.

Must be one of:
* "horarios"
* "je"
* "examenes"

### <a name="meta_fullMode"></a>2.7. Property `GhcEngineSchema > meta > fullMode`

**Title:** FullPlannerMode

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if the planner must use the full mode.

## <a name="planningData"></a>3. Property `GhcEngineSchema > planningData`

**Title:** PlanningGhcData

|                           |                                    |
| ------------------------- | ---------------------------------- |
| **Type**                  | `object`                           |
| **Required**              | Yes                                |
| **Additional properties** | Any type allowed                   |
| **Defined in**            | ../common/planningData.schema.json |

**Description:** Schema of the object that contains the timetable planning data.

| Property                                                            | Pattern | Type            | Deprecated | Definition | Title/Description       |
| ------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------------- |
| - [periods](#planningData_periods )                                 | No      | object          | No         | -          | Periods                 |
| - [frames](#planningData_frames )                                   | No      | array of object | No         | -          | Frames                  |
| - [buildings](#planningData_buildings )                             | No      | array of object | No         | -          | Buildings               |
| - [classRooms](#planningData_classRooms )                           | No      | array of object | No         | -          | ClassRooms              |
| - [classRoomsSets](#planningData_classRoomsSets )                   | No      | array of object | No         | -          | ClassRoomsSets          |
| - [tasks](#planningData_tasks )                                     | No      | array of object | No         | -          | Tasks                   |
| - [teachers](#planningData_teachers )                               | No      | array of object | No         | -          | Teachers                |
| - [subjects](#planningData_subjects )                               | No      | array of object | No         | -          | Subjects                |
| - [groups](#planningData_groups )                                   | No      | array of object | No         | -          | Groups                  |
| - [groupSetRelations](#planningData_groupSetRelations )             | No      | array           | No         | -          | GroupSetRelations       |
| - [courses](#planningData_courses )                                 | No      | array of object | No         | -          | Courses                 |
| - [departments](#planningData_departments )                         | No      | array of object | No         | -          | Departments             |
| - [sessions](#planningData_sessions )                               | No      | array of object | No         | -          | Sessions                |
| - [meetings](#planningData_meetings )                               | No      | array of object | No         | -          | Meetings                |
| - [complementaryActivities](#planningData_complementaryActivities ) | No      | array of object | No         | -          | ComplementaryActivities |
| - [onCallServices](#planningData_onCallServices )                   | No      | array of object | No         | -          | OnCallServices          |
| - [optimizationWeights](#planningData_optimizationWeights )         | No      | object          | No         | -          | OptimizationWeights     |
| - [engineSettings](#planningData_engineSettings )                   | No      | object          | No         | -          | EngineSettings          |

### <a name="planningData_periods"></a>3.1. Property `GhcEngineSchema > planningData > periods`

**Title:** Periods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Weeks or periods with different assignments which contains the timetable.

| Property                                                    | Pattern | Type            | Deprecated | Definition | Title/Description |
| ----------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------- |
| - [followedPeriods](#planningData_periods_followedPeriods ) | No      | boolean         | No         | -          | FollowedPeriods   |
| + [periodsList](#planningData_periods_periodsList )         | No      | array of object | No         | -          | PeriodsList       |
| - [periodSets](#planningData_periods_periodSets )           | No      | array of object | No         | -          | PeriodsSets       |

#### <a name="planningData_periods_followedPeriods"></a>3.1.1. Property `GhcEngineSchema > planningData > periods > followedPeriods`

**Title:** FollowedPeriods

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether periods or weeks consider the last day of the previous period or week as consecutive days with the first day of the following period or week.

#### <a name="planningData_periods_periodsList"></a>3.1.2. Property `GhcEngineSchema > planningData > periods > periodsList`

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

| Each item of this array must be                   | Description |
| ------------------------------------------------- | ----------- |
| [Period](#planningData_periods_periodsList_items) | -           |

##### <a name="planningData_periods_periodsList_items"></a>3.1.2.1. GhcEngineSchema > planningData > periods > periodsList > Period

**Title:** Period

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                            | Pattern | Type            | Deprecated | Definition | Title/Description                                                                                                                                                                              |
| ------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#planningData_periods_periodsList_items_id )                 | No      | string          | No         | -          | Period identifier.                                                                                                                                                                             |
| - [alias](#planningData_periods_periodsList_items_alias )           | No      | string          | No         | -          | Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to. |
| + [lastDay](#planningData_periods_periodsList_items_lastDay )       | No      | integer         | No         | -          | The end day of the period (included).                                                                                                                                                          |
| - [dayAliases](#planningData_periods_periodsList_items_dayAliases ) | No      | array of object | No         | -          | AliasDayList                                                                                                                                                                                   |

###### <a name="planningData_periods_periodsList_items_id"></a>3.1.2.1.1. Property `GhcEngineSchema > planningData > periods > periodsList > Period > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Period identifier.

###### <a name="planningData_periods_periodsList_items_alias"></a>3.1.2.1.2. Property `GhcEngineSchema > planningData > periods > periodsList > Period > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier assigned to the period based on how it corresponds to the dates in a calendar. It is an interval that indicates which actual calendar day the first and the last day correspond to.

###### <a name="planningData_periods_periodsList_items_lastDay"></a>3.1.2.1.3. Property `GhcEngineSchema > planningData > periods > periodsList > Period > lastDay`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** The end day of the period (included).

###### <a name="planningData_periods_periodsList_items_dayAliases"></a>3.1.2.1.4. Property `GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases`

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

| Each item of this array must be                                                 | Description |
| ------------------------------------------------------------------------------- | ----------- |
| [AliasDayDeifinition](#planningData_periods_periodsList_items_dayAliases_items) | -           |

###### <a name="planningData_periods_periodsList_items_dayAliases_items"></a>3.1.2.1.4.1. GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition

**Title:** AliasDayDeifinition

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                   | Pattern | Type    | Deprecated | Definition | Title/Description                                                     |
| -------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------- |
| + [dayId](#planningData_periods_periodsList_items_dayAliases_items_dayId ) | No      | integer | No         | -          | Identifier of the day of the week, it is unique across all weeks.     |
| + [alias](#planningData_periods_periodsList_items_dayAliases_items_alias ) | No      | string  | No         | -          | Header to identify the day in the results table and the frame column. |

###### <a name="planningData_periods_periodsList_items_dayAliases_items_dayId"></a>3.1.2.1.4.1.1. Property `GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > dayId`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Identifier of the day of the week, it is unique across all weeks.

###### <a name="planningData_periods_periodsList_items_dayAliases_items_alias"></a>3.1.2.1.4.1.2. Property `GhcEngineSchema > planningData > periods > periodsList > Period > dayAliases > AliasDayDeifinition > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Header to identify the day in the results table and the frame column.

#### <a name="planningData_periods_periodSets"></a>3.1.3. Property `GhcEngineSchema > planningData > periods > periodSets`

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

| Each item of this array must be                      | Description |
| ---------------------------------------------------- | ----------- |
| [PeriodsSet](#planningData_periods_periodSets_items) | -           |

##### <a name="planningData_periods_periodSets_items"></a>3.1.3.1. GhcEngineSchema > planningData > periods > periodSets > PeriodsSet

**Title:** PeriodsSet

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                           | Pattern | Type            | Deprecated | Definition | Title/Description                                        |
| ------------------------------------------------------------------ | ------- | --------------- | ---------- | ---------- | -------------------------------------------------------- |
| + [id](#planningData_periods_periodSets_items_id )                 | No      | string          | No         | -          | Period identifier.                                       |
| + [periodList](#planningData_periods_periodSets_items_periodList ) | No      | array of string | No         | -          | List of identifiers of the weeks that belong to the set. |

###### <a name="planningData_periods_periodSets_items_id"></a>3.1.3.1.1. Property `GhcEngineSchema > planningData > periods > periodSets > PeriodsSet > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Period identifier.

###### <a name="planningData_periods_periodSets_items_periodList"></a>3.1.3.1.2. Property `GhcEngineSchema > planningData > periods > periodSets > PeriodsSet > periodList`

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

| Each item of this array must be                                             | Description |
| --------------------------------------------------------------------------- | ----------- |
| [periodList items](#planningData_periods_periodSets_items_periodList_items) | -           |

###### <a name="planningData_periods_periodSets_items_periodList_items"></a>3.1.3.1.2.1. GhcEngineSchema > planningData > periods > periodSets > PeriodsSet > periodList > periodList items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

### <a name="planningData_frames"></a>3.2. Property `GhcEngineSchema > planningData > frames`

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

| Each item of this array must be     | Description |
| ----------------------------------- | ----------- |
| [Frame](#planningData_frames_items) | -           |

#### <a name="planningData_frames_items"></a>3.2.1. GhcEngineSchema > planningData > frames > Frame

**Title:** Frame

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                     | Pattern | Type            | Deprecated | Definition | Title/Description          |
| -------------------------------------------- | ------- | --------------- | ---------- | ---------- | -------------------------- |
| + [id](#planningData_frames_items_id )       | No      | string          | No         | -          | Frame identifier.          |
| - [exKey](#planningData_frames_items_exKey ) | No      | string          | No         | -          | External key of the frame. |
| + [days](#planningData_frames_items_days )   | No      | array of object | No         | -          | Days                       |

##### <a name="planningData_frames_items_id"></a>3.2.1.1. Property `GhcEngineSchema > planningData > frames > Frame > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

##### <a name="planningData_frames_items_exKey"></a>3.2.1.2. Property `GhcEngineSchema > planningData > frames > Frame > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the frame.

##### <a name="planningData_frames_items_days"></a>3.2.1.3. Property `GhcEngineSchema > planningData > frames > Frame > days`

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

| Each item of this array must be                   | Description            |
| ------------------------------------------------- | ---------------------- |
| [FrameDay](#planningData_frames_items_days_items) | Day with its sections. |

###### <a name="planningData_frames_items_days_items"></a>3.2.1.3.1. GhcEngineSchema > planningData > frames > Frame > days > FrameDay

**Title:** FrameDay

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Day with its sections.

| Property                                                      | Pattern | Type            | Deprecated | Definition | Title/Description |
| ------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------- |
| + [day](#planningData_frames_items_days_items_day )           | No      | integer         | No         | -          | Day of the week.  |
| + [sections](#planningData_frames_items_days_items_sections ) | No      | array of object | No         | -          | Sections          |

###### <a name="planningData_frames_items_days_items_day"></a>3.2.1.3.1.1. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week.

###### <a name="planningData_frames_items_days_items_sections"></a>3.2.1.3.1.2. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections`

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

| Each item of this array must be                                 | Description |
| --------------------------------------------------------------- | ----------- |
| [Section](#planningData_frames_items_days_items_sections_items) | -           |

###### <a name="planningData_frames_items_days_items_sections_items"></a>3.2.1.3.1.2.1. GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section

**Title:** Section

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                       | Pattern | Type             | Deprecated | Definition | Title/Description                                                           |
| ------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------------------- |
| + [index](#planningData_frames_items_days_items_sections_items_index )         | No      | integer          | No         | -          | Index built into the day where the section is located.                      |
| + [entryTime](#planningData_frames_items_days_items_sections_items_entryTime ) | No      | string           | No         | -          | Start time of the section.                                                  |
| + [exitTime](#planningData_frames_items_days_items_sections_items_exitTime )   | No      | string           | No         | -          | End time of the section.                                                    |
| - [exKey](#planningData_frames_items_days_items_sections_items_exKey )         | No      | string           | No         | -          | External key of the section.                                                |
| + [duration](#planningData_frames_items_days_items_sections_items_duration )   | No      | integer          | No         | -          | It indicates the duration (real or proportional) of the section in minutes. |
| + [type](#planningData_frames_items_days_items_sections_items_type )           | No      | enum (of string) | No         | -          | SectionType                                                                 |
| - [allowed](#planningData_frames_items_days_items_sections_items_allowed )     | No      | boolean          | No         | -          | It indicates if the section is available to assign.                         |

###### <a name="planningData_frames_items_days_items_sections_items_index"></a>3.2.1.3.1.2.1.1. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="planningData_frames_items_days_items_sections_items_entryTime"></a>3.2.1.3.1.2.1.2. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > entryTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** Start time of the section.

###### <a name="planningData_frames_items_days_items_sections_items_exitTime"></a>3.2.1.3.1.2.1.3. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > exitTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** End time of the section.

###### <a name="planningData_frames_items_days_items_sections_items_exKey"></a>3.2.1.3.1.2.1.4. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the section.

###### <a name="planningData_frames_items_days_items_sections_items_duration"></a>3.2.1.3.1.2.1.5. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > duration`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** It indicates the duration (real or proportional) of the section in minutes.

###### <a name="planningData_frames_items_days_items_sections_items_type"></a>3.2.1.3.1.2.1.6. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > type`

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

###### <a name="planningData_frames_items_days_items_sections_items_allowed"></a>3.2.1.3.1.2.1.7. Property `GhcEngineSchema > planningData > frames > Frame > days > FrameDay > sections > Section > allowed`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates if the section is available to assign.

### <a name="planningData_buildings"></a>3.3. Property `GhcEngineSchema > planningData > buildings`

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

| Each item of this array must be           | Description |
| ----------------------------------------- | ----------- |
| [Building](#planningData_buildings_items) | -           |

#### <a name="planningData_buildings_items"></a>3.3.1. GhcEngineSchema > planningData > buildings > Building

**Title:** Building

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                | Pattern | Type            | Deprecated | Definition | Title/Description    |
| ------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | -------------------- |
| + [id](#planningData_buildings_items_id )               | No      | string          | No         | -          | Building identifier. |
| - [fullName](#planningData_buildings_items_fullName )   | No      | string          | No         | -          | Building full name.  |
| - [distances](#planningData_buildings_items_distances ) | No      | array of object | No         | -          | Distances            |

##### <a name="planningData_buildings_items_id"></a>3.3.1.1. Property `GhcEngineSchema > planningData > buildings > Building > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Building identifier.

##### <a name="planningData_buildings_items_fullName"></a>3.3.1.2. Property `GhcEngineSchema > planningData > buildings > Building > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building full name.

##### <a name="planningData_buildings_items_distances"></a>3.3.1.3. Property `GhcEngineSchema > planningData > buildings > Building > distances`

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

| Each item of this array must be                           | Description |
| --------------------------------------------------------- | ----------- |
| [Distance](#planningData_buildings_items_distances_items) | -           |

###### <a name="planningData_buildings_items_distances_items"></a>3.3.1.3.1. GhcEngineSchema > planningData > buildings > Building > distances > Distance

**Title:** Distance

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                                    | Pattern | Type    | Deprecated | Definition | Title/Description                                               |
| --------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------- |
| + [refBuilding](#planningData_buildings_items_distances_items_refBuilding ) | No      | string  | No         | -          | Identifier of the other building that refers to the distance.   |
| + [minutes](#planningData_buildings_items_distances_items_minutes )         | No      | integer | No         | -          | Distance in minutes from the building of the referred building. |

###### <a name="planningData_buildings_items_distances_items_refBuilding"></a>3.3.1.3.1.1. Property `GhcEngineSchema > planningData > buildings > Building > distances > Distance > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the other building that refers to the distance.

###### <a name="planningData_buildings_items_distances_items_minutes"></a>3.3.1.3.1.2. Property `GhcEngineSchema > planningData > buildings > Building > distances > Distance > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Distance in minutes from the building of the referred building.

### <a name="planningData_classRooms"></a>3.4. Property `GhcEngineSchema > planningData > classRooms`

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

| Each item of this array must be             | Description |
| ------------------------------------------- | ----------- |
| [Classroom](#planningData_classRooms_items) | -           |

#### <a name="planningData_classRooms_items"></a>3.4.1. GhcEngineSchema > planningData > classRooms > Classroom

**Title:** Classroom

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                         | Pattern | Type            | Deprecated | Definition | Title/Description                                                                               |
| ---------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------------------------------------------------------------------------------------- |
| + [id](#planningData_classRooms_items_id )                       | No      | string          | No         | -          | Identifier name of the classroom.                                                               |
| - [shortName](#planningData_classRooms_items_shortName )         | No      | string          | No         | -          | Short name of the classroom                                                                     |
| - [fullName](#planningData_classRooms_items_fullName )           | No      | string          | No         | -          | Complete name of the classroom.                                                                 |
| - [isDedicated](#planningData_classRooms_items_isDedicated )     | No      | boolean         | No         | -          | Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom |
| - [exKey](#planningData_classRooms_items_exKey )                 | No      | string          | No         | -          | External key of the classroom                                                                   |
| - [capacity](#planningData_classRooms_items_capacity )           | No      | integer         | No         | -          | The maximum number of students the classroom can hold.                                          |
| - [frameTemplate](#planningData_classRooms_items_frameTemplate ) | No      | array of object | No         | -          | BannedFrameTemplate                                                                             |
| - [refBuilding](#planningData_classRooms_items_refBuilding )     | No      | string          | No         | -          | Building identifier where the class is located.                                                 |
| - [fullDay](#planningData_classRooms_items_fullDay )             | No      | boolean         | No         | -          | This indicates whether the classroom should be booked all day after holding a subject.          |

##### <a name="planningData_classRooms_items_id"></a>3.4.1.1. Property `GhcEngineSchema > planningData > classRooms > Classroom > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the classroom.

##### <a name="planningData_classRooms_items_shortName"></a>3.4.1.2. Property `GhcEngineSchema > planningData > classRooms > Classroom > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the classroom

##### <a name="planningData_classRooms_items_fullName"></a>3.4.1.3. Property `GhcEngineSchema > planningData > classRooms > Classroom > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the classroom.

##### <a name="planningData_classRooms_items_isDedicated"></a>3.4.1.4. Property `GhcEngineSchema > planningData > classRooms > Classroom > isDedicated`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the classroom is of a special-dedicated type, or is it a general purpose classroom

##### <a name="planningData_classRooms_items_exKey"></a>3.4.1.5. Property `GhcEngineSchema > planningData > classRooms > Classroom > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the classroom

##### <a name="planningData_classRooms_items_capacity"></a>3.4.1.6. Property `GhcEngineSchema > planningData > classRooms > Classroom > capacity`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** The maximum number of students the classroom can hold.

##### <a name="planningData_classRooms_items_frameTemplate"></a>3.4.1.7. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate`

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

| Each item of this array must be                                               | Description                                              |
| ----------------------------------------------------------------------------- | -------------------------------------------------------- |
| [BannedSectionPreference](#planningData_classRooms_items_frameTemplate_items) | Template with only banned section assignment preference. |

###### <a name="planningData_classRooms_items_frameTemplate_items"></a>3.4.1.7.1. GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference

**Title:** BannedSectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Template with only banned section assignment preference.

| Property                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                                      |
| -------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------ |
| + [day](#planningData_classRooms_items_frameTemplate_items_day )     | No      | integer | No         | -          | Day of the week when the section is located.           |
| + [index](#planningData_classRooms_items_frameTemplate_items_index ) | No      | integer | No         | -          | Index built into the day where the section is located. |
| + [frame](#planningData_classRooms_items_frameTemplate_items_frame ) | No      | string  | No         | -          | Frame identifier.                                      |

###### <a name="planningData_classRooms_items_frameTemplate_items_day"></a>3.4.1.7.1.1. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="planningData_classRooms_items_frameTemplate_items_index"></a>3.4.1.7.1.2. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="planningData_classRooms_items_frameTemplate_items_frame"></a>3.4.1.7.1.3. Property `GhcEngineSchema > planningData > classRooms > Classroom > frameTemplate > BannedSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

##### <a name="planningData_classRooms_items_refBuilding"></a>3.4.1.8. Property `GhcEngineSchema > planningData > classRooms > Classroom > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier where the class is located.

##### <a name="planningData_classRooms_items_fullDay"></a>3.4.1.9. Property `GhcEngineSchema > planningData > classRooms > Classroom > fullDay`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** This indicates whether the classroom should be booked all day after holding a subject.

### <a name="planningData_classRoomsSets"></a>3.5. Property `GhcEngineSchema > planningData > classRoomsSets`

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

| Each item of this array must be                    | Description |
| -------------------------------------------------- | ----------- |
| [ClassRoomSet](#planningData_classRoomsSets_items) | -           |

#### <a name="planningData_classRoomsSets_items"></a>3.5.1. GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet

**Title:** ClassRoomSet

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                               | Pattern | Type            | Deprecated | Definition | Title/Description                                                  |
| ---------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------------------------------------------ |
| + [id](#planningData_classRoomsSets_items_id )                         | No      | string          | No         | -          | ClassRooms group identifier.                                       |
| + [rooms](#planningData_classRoomsSets_items_rooms )                   | No      | array of string | No         | -          | ClassRoomEntries                                                   |
| - [anonymousRooms](#planningData_classRoomsSets_items_anonymousRooms ) | No      | integer         | No         | -          | Number of non-specific defined classrooms that the group contains. |

##### <a name="planningData_classRoomsSets_items_id"></a>3.5.1.1. Property `GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** ClassRooms group identifier.

##### <a name="planningData_classRoomsSets_items_rooms"></a>3.5.1.2. Property `GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > rooms`

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

| Each item of this array must be                                | Description           |
| -------------------------------------------------------------- | --------------------- |
| [ClassRoomRef](#planningData_classRoomsSets_items_rooms_items) | Classroom identifier. |

###### <a name="planningData_classRoomsSets_items_rooms_items"></a>3.5.1.2.1. GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > rooms > ClassRoomRef

**Title:** ClassRoomRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom identifier.

##### <a name="planningData_classRoomsSets_items_anonymousRooms"></a>3.5.1.3. Property `GhcEngineSchema > planningData > classRoomsSets > ClassRoomSet > anonymousRooms`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of non-specific defined classrooms that the group contains.

### <a name="planningData_tasks"></a>3.6. Property `GhcEngineSchema > planningData > tasks`

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

| Each item of this array must be   | Description            |
| --------------------------------- | ---------------------- |
| [Task](#planningData_tasks_items) | Teacher activity type. |

#### <a name="planningData_tasks_items"></a>3.6.1. GhcEngineSchema > planningData > tasks > Task

**Title:** Task

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher activity type.

| Property                                                            | Pattern | Type            | Deprecated | Definition               | Title/Description                                     |
| ------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------ | ----------------------------------------------------- |
| + [id](#planningData_tasks_items_id )                               | No      | string          | No         | -                        | Task identifier.                                      |
| - [frameTemplate](#planningData_tasks_items_frameTemplate )         | No      | array of object | No         | In #/$defs/frameTemplate | FrameTemplate                                         |
| - [fullName](#planningData_tasks_items_fullName )                   | No      | string          | No         | -                        | Complete name of the task.                            |
| - [exKey](#planningData_tasks_items_exKey )                         | No      | string          | No         | -                        | External key of the task                              |
| - [refColourInResult](#planningData_tasks_items_refColourInResult ) | No      | string          | No         | -                        | Colour code used to represent the task in the result. |

##### <a name="planningData_tasks_items_id"></a>3.6.1.1. Property `GhcEngineSchema > planningData > tasks > Task > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

##### <a name="planningData_tasks_items_frameTemplate"></a>3.6.1.2. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate`

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

| Each item of this array must be                                    | Description                                    |
| ------------------------------------------------------------------ | ---------------------------------------------- |
| [SectionPreference](#planningData_tasks_items_frameTemplate_items) | Template with a section assignment preference. |

###### <a name="planningData_tasks_items_frameTemplate_items"></a>3.6.1.2.1. GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference

**Title:** SectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Template with a section assignment preference.

| Property                                                        | Pattern | Type             | Deprecated | Definition | Title/Description                                  |
| --------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | -------------------------------------------------- |
| + [day](#planningData_tasks_items_frameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when is located the section.       |
| + [index](#planningData_tasks_items_frameTemplate_items_index ) | No      | integer          | No         | -          | Index inside the day where is located the section. |
| + [frame](#planningData_tasks_items_frameTemplate_items_frame ) | No      | string           | No         | -          | Identifier name of the frame.                      |
| + [type](#planningData_tasks_items_frameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeWithOutPreset                 |

###### <a name="planningData_tasks_items_frameTemplate_items_day"></a>3.6.1.2.1.1. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when is located the section.

###### <a name="planningData_tasks_items_frameTemplate_items_index"></a>3.6.1.2.1.2. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index inside the day where is located the section.

###### <a name="planningData_tasks_items_frameTemplate_items_frame"></a>3.6.1.2.1.3. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the frame.

###### <a name="planningData_tasks_items_frameTemplate_items_type"></a>3.6.1.2.1.4. Property `GhcEngineSchema > planningData > tasks > Task > frameTemplate > SectionPreference > type`

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

##### <a name="planningData_tasks_items_fullName"></a>3.6.1.3. Property `GhcEngineSchema > planningData > tasks > Task > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the task.

##### <a name="planningData_tasks_items_exKey"></a>3.6.1.4. Property `GhcEngineSchema > planningData > tasks > Task > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the task

##### <a name="planningData_tasks_items_refColourInResult"></a>3.6.1.5. Property `GhcEngineSchema > planningData > tasks > Task > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the task in the result.

### <a name="planningData_teachers"></a>3.7. Property `GhcEngineSchema > planningData > teachers`

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

| Each item of this array must be         | Description                                                 |
| --------------------------------------- | ----------------------------------------------------------- |
| [Teacher](#planningData_teachers_items) | Object with personal information and teachers' preferences. |

#### <a name="planningData_teachers_items"></a>3.7.1. GhcEngineSchema > planningData > teachers > Teacher

**Title:** Teacher

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Object with personal information and teachers' preferences.

| Property                                                                       | Pattern | Type            | Deprecated | Definition                                                        | Title/Description                                                                                                                                    |
| ------------------------------------------------------------------------------ | ------- | --------------- | ---------- | ----------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#planningData_teachers_items_id )                                       | No      | string          | No         | -                                                                 | Identifier of the teacher.                                                                                                                           |
| - [shortName](#planningData_teachers_items_shortName )                         | No      | string          | No         | -                                                                 | Short name of the teacher.                                                                                                                           |
| - [fullName](#planningData_teachers_items_fullName )                           | No      | string          | No         | -                                                                 | Complete name of the teacher.                                                                                                                        |
| - [exKey](#planningData_teachers_items_exKey )                                 | No      | string          | No         | -                                                                 | External key of the teacher                                                                                                                          |
| - [associationIdentifier](#planningData_teachers_items_associationIdentifier ) | No      | string          | No         | -                                                                 | Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport. |
| - [overlappedAssessment](#planningData_teachers_items_overlappedAssessment )   | No      | integer         | No         | -                                                                 | Number of overlapped evaluation sessions.                                                                                                            |
| - [frameTemplate](#planningData_teachers_items_frameTemplate )                 | No      | array of object | No         | Same as [frameTemplate](#planningData_tasks_items_frameTemplate ) | FrameTemplate                                                                                                                                        |
| - [generalSettings](#planningData_teachers_items_generalSettings )             | No      | object          | No         | -                                                                 | GeneralSettings                                                                                                                                      |
| - [periodSettings](#planningData_teachers_items_periodSettings )               | No      | array of object | No         | -                                                                 | PeriodsSettings                                                                                                                                      |

##### <a name="planningData_teachers_items_id"></a>3.7.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the teacher.

##### <a name="planningData_teachers_items_shortName"></a>3.7.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the teacher.

##### <a name="planningData_teachers_items_fullName"></a>3.7.1.3. Property `GhcEngineSchema > planningData > teachers > Teacher > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the teacher.

##### <a name="planningData_teachers_items_exKey"></a>3.7.1.4. Property `GhcEngineSchema > planningData > teachers > Teacher > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the teacher

##### <a name="planningData_teachers_items_associationIdentifier"></a>3.7.1.5. Property `GhcEngineSchema > planningData > teachers > Teacher > associationIdentifier`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Group or association of teachers who should have similar check-in and check-out times, if possible. This is useful for teachers who share transport.

##### <a name="planningData_teachers_items_overlappedAssessment"></a>3.7.1.6. Property `GhcEngineSchema > planningData > teachers > Teacher > overlappedAssessment`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** Number of overlapped evaluation sessions.

| Restrictions |        |
| ------------ | ------ |
| **Minimum**  | &ge; 1 |

##### <a name="planningData_teachers_items_frameTemplate"></a>3.7.1.7. Property `GhcEngineSchema > planningData > teachers > Teacher > frameTemplate`

**Title:** FrameTemplate

|                        |                                                          |
| ---------------------- | -------------------------------------------------------- |
| **Type**               | `array of object`                                        |
| **Required**           | No                                                       |
| **Same definition as** | [frameTemplate](#planningData_tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

##### <a name="planningData_teachers_items_generalSettings"></a>3.7.1.8. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings`

**Title:** GeneralSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Strict and measurable teacher's conditions for the timetable. If there are not single periods, these conditions are the default, but can be specified individually for each period in the 'periodSettings' tag.

| Property                                                                                           | Pattern | Type             | Deprecated | Definition                         | Title/Description                                                                                               |
| -------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| - [weeklyStay](#planningData_teachers_items_generalSettings_weeklyStay )                           | No      | object           | No         | In #/$defs/weeklyStay              | WeeklyStay                                                                                                      |
| - [dailyStay](#planningData_teachers_items_generalSettings_dailyStay )                             | No      | object           | No         | In #/$defs/dailyStay               | DailyStay                                                                                                       |
| - [avoidGapsBetweenSesions](#planningData_teachers_items_generalSettings_avoidGapsBetweenSesions ) | No      | boolean          | No         | In #/$defs/avoidGapsBetweenSesions | It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition. |
| - [maxContinuousTeaching](#planningData_teachers_items_generalSettings_maxContinuousTeaching )     | No      | object           | No         | In #/$defs/maxContinuousTeaching   | MaxContinuousTeaching                                                                                           |
| - [avoidClassesAroundBreak](#planningData_teachers_items_generalSettings_avoidClassesAroundBreak ) | No      | enum (of string) | No         | In #/$defs/avoidClassesAroundBreak | ConditionType                                                                                                   |
| - [freeTimes](#planningData_teachers_items_generalSettings_freeTimes )                             | No      | object           | No         | In #/$defs/freeTimes               | FreeTimes                                                                                                       |
| - [freePartTimes](#planningData_teachers_items_generalSettings_freePartTimes )                     | No      | object           | No         | In #/$defs/freePartTimes           | FreePartTime                                                                                                    |
| - [incompatibilities](#planningData_teachers_items_generalSettings_incompatibilities )             | No      | object           | No         | In #/$defs/incompatibilities       | Incompatibilities                                                                                               |
| - [dailyOcupation](#planningData_teachers_items_generalSettings_dailyOcupation )                   | No      | object           | No         | In #/$defs/dailyOcupation          | DailyOcupation                                                                                                  |
| - [middayReference](#planningData_teachers_items_generalSettings_middayReference )                 | No      | object           | No         | In #/$defs/middayReference         | MiddayReference                                                                                                 |
| - [dailyBuildingTransfers](#planningData_teachers_items_generalSettings_dailyBuildingTransfers )   | No      | object           | No         | In #/$defs/dailyBuildingTransfers  | DailyBuildingTransfers                                                                                          |

###### <a name="planningData_teachers_items_generalSettings_weeklyStay"></a>3.7.1.8.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay`

**Title:** WeeklyStay

|                           |                    |
| ------------------------- | ------------------ |
| **Type**                  | `object`           |
| **Required**              | No                 |
| **Additional properties** | Not allowed        |
| **Defined in**            | #/$defs/weeklyStay |

**Description:** It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

| Property                                                                                          | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                            |
| ------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| - [strict](#planningData_teachers_items_generalSettings_weeklyStay_strict )                       | No      | integer | No         | -          | Strict time in minutes of maximum weekly stay.                                                                                               |
| - [preferable](#planningData_teachers_items_generalSettings_weeklyStay_preferable )               | No      | integer | No         | -          | Ponderable Time in minutes of maximum weeekly stay.                                                                                          |
| - [countAroundMidday](#planningData_teachers_items_generalSettings_weeklyStay_countAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day. |

###### <a name="planningData_teachers_items_generalSettings_weeklyStay_strict"></a>3.7.1.8.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict time in minutes of maximum weekly stay.

###### <a name="planningData_teachers_items_generalSettings_weeklyStay_preferable"></a>3.7.1.8.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Ponderable Time in minutes of maximum weeekly stay.

###### <a name="planningData_teachers_items_generalSettings_weeklyStay_countAroundMidday"></a>3.7.1.8.1.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > weeklyStay > countAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

###### <a name="planningData_teachers_items_generalSettings_dailyStay"></a>3.7.1.8.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay`

**Title:** DailyStay

|                           |                   |
| ------------------------- | ----------------- |
| **Type**                  | `object`          |
| **Required**              | No                |
| **Additional properties** | Not allowed       |
| **Defined in**            | #/$defs/dailyStay |

**Description:** This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.

| Property                                                                                         | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                            |
| ------------------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------------------------------------------- |
| - [strict](#planningData_teachers_items_generalSettings_dailyStay_strict )                       | No      | integer | No         | -          | Strict time in minutes of maximum daily stay.                                                                                                |
| - [preferable](#planningData_teachers_items_generalSettings_dailyStay_preferable )               | No      | integer | No         | -          | Ponderable Time in minutes of maximum daily stay.                                                                                            |
| - [countAroundMidday](#planningData_teachers_items_generalSettings_dailyStay_countAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day. |

###### <a name="planningData_teachers_items_generalSettings_dailyStay_strict"></a>3.7.1.8.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict time in minutes of maximum daily stay.

###### <a name="planningData_teachers_items_generalSettings_dailyStay_preferable"></a>3.7.1.8.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Ponderable Time in minutes of maximum daily stay.

###### <a name="planningData_teachers_items_generalSettings_dailyStay_countAroundMidday"></a>3.7.1.8.2.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyStay > countAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of split shifts, that the unoccupied intervals between the morning and afternoon class units are counted each day.

###### <a name="planningData_teachers_items_generalSettings_avoidGapsBetweenSesions"></a>3.7.1.8.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > avoidGapsBetweenSesions`

|                |                                 |
| -------------- | ------------------------------- |
| **Type**       | `boolean`                       |
| **Required**   | No                              |
| **Default**    | `true`                          |
| **Defined in** | #/$defs/avoidGapsBetweenSesions |

**Description:** It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.

###### <a name="planningData_teachers_items_generalSettings_maxContinuousTeaching"></a>3.7.1.8.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching`

**Title:** MaxContinuousTeaching

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Not allowed                   |
| **Defined in**            | #/$defs/maxContinuousTeaching |

**Description:** It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

| Property                                                                                   | Pattern | Type             | Deprecated | Definition               | Title/Description                                  |
| ------------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | ------------------------ | -------------------------------------------------- |
| - [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type )         | No      | enum (of string) | No         | In #/$defs/conditionType | ConditionType                                      |
| - [minutes](#planningData_teachers_items_generalSettings_maxContinuousTeaching_minutes )   | No      | integer          | No         | -                        | Maximum continuous teaching time in minutes.       |
| - [minBreak](#planningData_teachers_items_generalSettings_maxContinuousTeaching_minBreak ) | No      | integer          | No         | -                        | Minimum time period to be considered as break time |

###### <a name="planningData_teachers_items_generalSettings_maxContinuousTeaching_type"></a>3.7.1.8.4.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > type`

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

###### <a name="planningData_teachers_items_generalSettings_maxContinuousTeaching_minutes"></a>3.7.1.8.4.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum continuous teaching time in minutes.

###### <a name="planningData_teachers_items_generalSettings_maxContinuousTeaching_minBreak"></a>3.7.1.8.4.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > maxContinuousTeaching > minBreak`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Minimum time period to be considered as break time

###### <a name="planningData_teachers_items_generalSettings_avoidClassesAroundBreak"></a>3.7.1.8.5. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > avoidClassesAroundBreak`

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

###### <a name="planningData_teachers_items_generalSettings_freeTimes"></a>3.7.1.8.6. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes`

**Title:** FreeTimes

|                           |                   |
| ------------------------- | ----------------- |
| **Type**                  | `object`          |
| **Required**              | No                |
| **Additional properties** | Not allowed       |
| **Defined in**            | #/$defs/freeTimes |

**Description:** It contains the free time spaces that the teacher must have.

| Property                                                                                           | Pattern | Type   | Deprecated | Definition | Title/Description           |
| -------------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | --------------------------- |
| - [fullDay](#planningData_teachers_items_generalSettings_freeTimes_fullDay )                       | No      | object | No         | -          | FullDaysFreeTimes           |
| - [firstMinutes](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes )             | No      | object | No         | -          | FirstMinutesFreeTimes       |
| - [lastMinutes](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes )               | No      | object | No         | -          | LastMinutesFreeTimes        |
| - [consecutiveAnyTime](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime ) | No      | object | No         | -          | ConsecutiveAnyTimeFreeTimes |

###### <a name="planningData_teachers_items_generalSettings_freeTimes_fullDay"></a>3.7.1.8.6.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay`

**Title:** FullDaysFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's full days of free time.

| Property                                                                                         | Pattern | Type    | Deprecated | Definition | Title/Description                                     |
| ------------------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | ----------------------------------------------------- |
| - [strictDays](#planningData_teachers_items_generalSettings_freeTimes_fullDay_strictDays )       | No      | integer | No         | -          | Number of strict days when teacher should be free.    |
| - [preferredDays](#planningData_teachers_items_generalSettings_freeTimes_fullDay_preferredDays ) | No      | integer | No         | -          | Number of preferred days when teacher should be free. |

###### <a name="planningData_teachers_items_generalSettings_freeTimes_fullDay_strictDays"></a>3.7.1.8.6.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of strict days when teacher should be free.

###### <a name="planningData_teachers_items_generalSettings_freeTimes_fullDay_preferredDays"></a>3.7.1.8.6.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > fullDay > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Number of preferred days when teacher should be free.

###### <a name="planningData_teachers_items_generalSettings_freeTimes_firstMinutes"></a>3.7.1.8.6.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes`

**Title:** FirstMinutesFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's free intervals at the beginning of the day.

| Property                                                                                              | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                        |
| ----------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------------------------------------------------------- |
| - [strictDays](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free at the beginning of the day.      |
| - [preferredDays](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free at the beginning of the day. |
| + [minutes](#planningData_teachers_items_generalSettings_freeTimes_firstMinutes_minutes )             | No      | integer | No         | -          | Minutes of free time at the beginning of the day.                                                        |

###### <a name="planningData_teachers_items_generalSettings_freeTimes_firstMinutes_strictDays"></a>3.7.1.8.6.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free at the beginning of the day.

###### <a name="planningData_teachers_items_generalSettings_freeTimes_firstMinutes_preferredDays"></a>3.7.1.8.6.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free at the beginning of the day.

###### <a name="planningData_teachers_items_generalSettings_freeTimes_firstMinutes_minutes"></a>3.7.1.8.6.2.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > firstMinutes > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time at the beginning of the day.

###### <a name="planningData_teachers_items_generalSettings_freeTimes_lastMinutes"></a>3.7.1.8.6.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes`

**Title:** LastMinutesFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's free intervals at the end of the day.

| Property                                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                    |
| ---------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------- |
| - [strictDays](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free at the end of the day.        |
| - [preferredDays](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free at the end of the day. . |
| + [minutes](#planningData_teachers_items_generalSettings_freeTimes_lastMinutes_minutes )             | No      | integer | No         | -          | Minutes of free time at the end of the day.                                                          |

###### <a name="planningData_teachers_items_generalSettings_freeTimes_lastMinutes_strictDays"></a>3.7.1.8.6.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free at the end of the day.

###### <a name="planningData_teachers_items_generalSettings_freeTimes_lastMinutes_preferredDays"></a>3.7.1.8.6.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free at the end of the day. .

###### <a name="planningData_teachers_items_generalSettings_freeTimes_lastMinutes_minutes"></a>3.7.1.8.6.3.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > lastMinutes > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time at the end of the day.

###### <a name="planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime"></a>3.7.1.8.6.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime`

**Title:** ConsecutiveAnyTimeFreeTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Teacher's free intervals at any time of the day.

| Property                                                                                                    | Pattern | Type    | Deprecated | Definition | Title/Description                                                             |
| ----------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------- |
| - [strictDays](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays )       | No      | integer | No         | -          | Strict number of days on which the teacher must have the interval free.       |
| - [preferredDays](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays ) | No      | integer | No         | -          | Preferred number of days on which the teacher should have the interval free.  |
| + [minutes](#planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes )             | No      | integer | No         | -          | Minutes of free time interval.                                                |

###### <a name="planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_strictDays"></a>3.7.1.8.6.4.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > strictDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Strict number of days on which the teacher must have the interval free. 

###### <a name="planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_preferredDays"></a>3.7.1.8.6.4.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > preferredDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Preferred number of days on which the teacher should have the interval free. 

###### <a name="planningData_teachers_items_generalSettings_freeTimes_consecutiveAnyTime_minutes"></a>3.7.1.8.6.4.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freeTimes > consecutiveAnyTime > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Minutes of free time interval.

###### <a name="planningData_teachers_items_generalSettings_freePartTimes"></a>3.7.1.8.7. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes`

**Title:** FreePartTime

|                           |                       |
| ------------------------- | --------------------- |
| **Type**                  | `object`              |
| **Required**              | No                    |
| **Additional properties** | Not allowed           |
| **Defined in**            | #/$defs/freePartTimes |

**Description:** Free half-time periods .

| Property                                                                                   | Pattern | Type   | Deprecated | Definition | Title/Description         |
| ------------------------------------------------------------------------------------------ | ------- | ------ | ---------- | ---------- | ------------------------- |
| - [mornings](#planningData_teachers_items_generalSettings_freePartTimes_mornings )         | No      | object | No         | -          | MorningsFreePartTimes     |
| - [afternoons](#planningData_teachers_items_generalSettings_freePartTimes_afternoons )     | No      | object | No         | -          | AfternoonFreePartTimes    |
| - [indistinctly](#planningData_teachers_items_generalSettings_freePartTimes_indistinctly ) | No      | object | No         | -          | IndistinctlyFreePartTimes |

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_mornings"></a>3.7.1.8.7.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings`

**Title:** MorningsFreePartTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Mornings off.

| Property                                                                                        | Pattern | Type    | Deprecated | Definition | Title/Description                  |
| ----------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------- |
| - [strict](#planningData_teachers_items_generalSettings_freePartTimes_mornings_strict )         | No      | integer | No         | -          | Strict number of mornings off.     |
| - [preferable](#planningData_teachers_items_generalSettings_freePartTimes_mornings_preferable ) | No      | integer | No         | -          | Preferable number of mornings off. |

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_mornings_strict"></a>3.7.1.8.7.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of mornings off.

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_mornings_preferable"></a>3.7.1.8.7.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > mornings > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of mornings off.

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_afternoons"></a>3.7.1.8.7.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons`

**Title:** AfternoonFreePartTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Afternoons off.

| Property                                                                                          | Pattern | Type    | Deprecated | Definition | Title/Description                    |
| ------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------ |
| - [strict](#planningData_teachers_items_generalSettings_freePartTimes_afternoons_strict )         | No      | integer | No         | -          | Strict number of afternoons off..    |
| - [preferable](#planningData_teachers_items_generalSettings_freePartTimes_afternoons_preferable ) | No      | integer | No         | -          | Preferable number of afternoons off. |

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_afternoons_strict"></a>3.7.1.8.7.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of afternoons off..

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_afternoons_preferable"></a>3.7.1.8.7.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > afternoons > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of afternoons off.

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_indistinctly"></a>3.7.1.8.7.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly`

**Title:** IndistinctlyFreePartTimes

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Free mornings or evenings indistinctly.

| Property                                                                                            | Pattern | Type    | Deprecated | Definition | Title/Description                                             |
| --------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------- |
| - [strict](#planningData_teachers_items_generalSettings_freePartTimes_indistinctly_strict )         | No      | integer | No         | -          | Strict number of mornings or afternoons indistinctly off.     |
| - [preferable](#planningData_teachers_items_generalSettings_freePartTimes_indistinctly_preferable ) | No      | integer | No         | -          | Preferable number of mornings or afternoons indistinctly off. |

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_indistinctly_strict"></a>3.7.1.8.7.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict number of mornings or afternoons indistinctly off.

###### <a name="planningData_teachers_items_generalSettings_freePartTimes_indistinctly_preferable"></a>3.7.1.8.7.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > freePartTimes > indistinctly > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Preferable number of mornings or afternoons indistinctly off.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities"></a>3.7.1.8.8. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities`

**Title:** Incompatibilities

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Not allowed               |
| **Defined in**            | #/$defs/incompatibilities |

**Description:** It contains the teacher's incompatibilities on the allocation of class units and rest periods.

| Property                                                                                                                                                                                                 | Pattern | Type             | Deprecated | Definition                       | Title/Description                                      |
| -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | -------------------------------- | ------------------------------------------------------ |
| - [freeTimeBetweenDayBeforeAndCurrent](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent )                                                               | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeBetweenDays                                    |
| - [freeTimeBetweenEndWeekAndStartWeekDays](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays )                                                       | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeBetweenWeeksBorders                            |
| - [freeTimeFirstOrLastHoursDay](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay )                                                                             | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeFirstOrLastHoursDay                            |
| - [doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection ) | No      | enum (of string) | No         | -                                | DoNotFinishAtLastAfternoonSection                      |
| - [doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection )         | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSection                        |
| - [doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection )         | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSectionIfStartAtFirstAfternoon |
| - [doNotFinishAtLastMorningSectionIfHasAfternoonAssignment](#planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment )                     | No      | enum (of string) | No         | -                                | DoNotFinishAtLastMorningSectionIfHasAfternoon          |
| - [doNotStartAtFirstMorningSectionIfHasAfternoonAssignment](#planningData_teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment )                     | No      | enum (of string) | No         | -                                | DoNotStartAtFirstMorningSection                        |
| - [freeTimeAroundMidday](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday )                                                                                           | No      | object           | No         | In #/$defs/conditionTypeWithTime | FreeTimeAroundMidday                                   |

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent"></a>3.7.1.8.8.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent`

**Title:** FreeTimeBetweenDays

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes between departure and arrival of the following day.

| Property                                                                                                                | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                     |
| ----------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                        | Custom time in minutes for condition. |

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.7.1.8.8.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | Yes                                                                             |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.7.1.8.8.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenEndWeekAndStartWeekDays"></a>3.7.1.8.8.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenEndWeekAndStartWeekDays`

**Title:** FreeTimeBetweenWeeksBorders

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes between the end time of the last day of the week and the start time of the following week.

| Property                                                                                                                | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                     |
| ----------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                        | Custom time in minutes for condition. |

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.7.1.8.8.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | Yes                                                                             |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.7.1.8.8.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeFirstOrLastHoursDay"></a>3.7.1.8.8.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeFirstOrLastHoursDay`

**Title:** FreeTimeFirstOrLastHoursDay

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Minutes of free time at first or last hours of the day.

| Property                                                                                                                | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                     |
| ----------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                        | Custom time in minutes for condition. |

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.7.1.8.8.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | Yes                                                                             |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.7.1.8.8.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection"></a>3.7.1.8.8.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastAfternoonSectionIfStartedAtFirstAfternoonSection`

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

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection"></a>3.7.1.8.8.5. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartedAtFirstMorningSection`

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

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection"></a>3.7.1.8.8.6. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfStartAtFirstAfternoonSection`

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

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_doNotFinishAtLastMorningSectionIfHasAfternoonAssignment"></a>3.7.1.8.8.7. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotFinishAtLastMorningSectionIfHasAfternoonAssignment`

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

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_doNotStartAtFirstMorningSectionIfHasAfternoonAssignment"></a>3.7.1.8.8.8. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > doNotStartAtFirstMorningSectionIfHasAfternoonAssignment`

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

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeAroundMidday"></a>3.7.1.8.8.9. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeAroundMidday`

**Title:** FreeTimeAroundMidday

|                           |                               |
| ------------------------- | ----------------------------- |
| **Type**                  | `object`                      |
| **Required**              | No                            |
| **Additional properties** | Any type allowed              |
| **Defined in**            | #/$defs/conditionTypeWithTime |

**Description:** Do not have less than a custom free time around noon pause.

| Property                                                                                                                | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                     |
| ----------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | ------------------------------------- |
| + [type](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type )       | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                         |
| - [minutes](#planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes ) | No      | integer          | No         | -                                                                                        | Custom time in minutes for condition. |

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_type"></a>3.7.1.8.8.9.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | Yes                                                                             |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_incompatibilities_freeTimeBetweenDayBeforeAndCurrent_minutes"></a>3.7.1.8.8.9.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > incompatibilities > freeTimeBetweenDayBeforeAndCurrent > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom time in minutes for condition.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation"></a>3.7.1.8.9. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation`

**Title:** DailyOcupation

|                           |                        |
| ------------------------- | ---------------------- |
| **Type**                  | `object`               |
| **Required**              | No                     |
| **Additional properties** | Not allowed            |
| **Defined in**            | #/$defs/dailyOcupation |

**Description:** Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

| Property                                                                                            | Pattern | Type    | Deprecated | Definition                   | Title/Description                                                                                                        |
| --------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------------------------- | ------------------------------------------------------------------------------------------------------------------------ |
| - [allowFreeDays](#planningData_teachers_items_generalSettings_dailyOcupation_allowFreeDays )       | No      | boolean | No         | -                            | It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked. |
| - [minimumTeaching](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching )   | No      | object  | No         | In #/$defs/conditionOcupancy | MinimumTeaching                                                                                                          |
| - [maximumTeaching](#planningData_teachers_items_generalSettings_dailyOcupation_maximumTeaching )   | No      | object  | No         | In #/$defs/conditionOcupancy | MaximumTeaching                                                                                                          |
| - [minimumOccupancy](#planningData_teachers_items_generalSettings_dailyOcupation_minimumOccupancy ) | No      | object  | No         | In #/$defs/conditionOcupancy | MinimumOccupancy                                                                                                         |
| - [maximumOccupancy](#planningData_teachers_items_generalSettings_dailyOcupation_maximumOccupancy ) | No      | object  | No         | In #/$defs/conditionOcupancy | MaximumOccupancy                                                                                                         |

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_allowFreeDays"></a>3.7.1.8.9.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > allowFreeDays`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** It indicates whether checking of minimums is omitted in the case of non-assigned days. Forbidden days are never checked.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching"></a>3.7.1.8.9.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching`

**Title:** MinimumTeaching

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Minimum teaching time of the teacher with students.

| Property                                                                                                      | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                        | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                        | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                        | time in minutes you add to the assisted time so you generate the total time |

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.7.1.8.9.2.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | No                                                                              |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.7.1.8.9.2.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.7.1.8.9.2.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.7.1.8.9.2.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_maximumTeaching"></a>3.7.1.8.9.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumTeaching`

**Title:** MaximumTeaching

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Maximun teaching time of the teacher with students.

| Property                                                                                                      | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                        | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                        | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                        | time in minutes you add to the assisted time so you generate the total time |

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.7.1.8.9.3.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | No                                                                              |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.7.1.8.9.3.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.7.1.8.9.3.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.7.1.8.9.3.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumOccupancy"></a>3.7.1.8.9.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumOccupancy`

**Title:** MinimumOccupancy

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Minimum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

| Property                                                                                                      | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                        | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                        | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                        | time in minutes you add to the assisted time so you generate the total time |

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.7.1.8.9.4.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | No                                                                              |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.7.1.8.9.4.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.7.1.8.9.4.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.7.1.8.9.4.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_maximumOccupancy"></a>3.7.1.8.9.5. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > maximumOccupancy`

**Title:** MaximumOccupancy

|                           |                           |
| ------------------------- | ------------------------- |
| **Type**                  | `object`                  |
| **Required**              | No                        |
| **Additional properties** | Any type allowed          |
| **Defined in**            | #/$defs/conditionOcupancy |

**Description:** Maximum teaching time of the teacher with students and other non-teaching activities indicated as eligible for calculation.

| Property                                                                                                      | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                                                           |
| ------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| - [type](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type )                   | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                               |
| - [minutes](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes )             | No      | integer          | No         | -                                                                                        | Custom total time in minutes for the ocupancy.                              |
| - [isAssisted](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted )       | No      | boolean          | No         | -                                                                                        | Indicates if the field is assigned manualy or with the assisted mode        |
| - [variationTime](#planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime ) | No      | integer          | No         | -                                                                                        | time in minutes you add to the assisted time so you generate the total time |

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_type"></a>3.7.1.8.9.5.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > type`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | No                                                                              |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** Indicate whether the incompatibility is strict, avoid (penalisable in optimisation) or ignored.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_minutes"></a>3.7.1.8.9.5.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > minutes`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom total time in minutes for the ocupancy.

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_isAssisted"></a>3.7.1.8.9.5.3. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > isAssisted`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Indicates if the field is assigned manualy or with the assisted mode

###### <a name="planningData_teachers_items_generalSettings_dailyOcupation_minimumTeaching_variationTime"></a>3.7.1.8.9.5.4. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyOcupation > minimumTeaching > variationTime`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** time in minutes you add to the assisted time so you generate the total time

###### <a name="planningData_teachers_items_generalSettings_middayReference"></a>3.7.1.8.10. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > middayReference`

**Title:** MiddayReference

|                           |                         |
| ------------------------- | ----------------------- |
| **Type**                  | `object`                |
| **Required**              | No                      |
| **Additional properties** | Not allowed             |
| **Defined in**            | #/$defs/middayReference |

**Description:** It indicate the frame where the teacher takes noon pause.

| Property                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                 |
| ------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [refFrame](#planningData_teachers_items_generalSettings_middayReference_refFrame ) | No      | string  | No         | -          | Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.                        |
| - [strict](#planningData_teachers_items_generalSettings_middayReference_strict )     | No      | boolean | No         | -          | It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause. |

###### <a name="planningData_teachers_items_generalSettings_middayReference_refFrame"></a>3.7.1.8.10.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > middayReference > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of a frame where the teacher takes noon pause. If not specified, the engine shall take the noon pause of the frame with the highest allocation.

###### <a name="planningData_teachers_items_generalSettings_middayReference_strict"></a>3.7.1.8.10.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > middayReference > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates whether the teacher's noon pause should be respected without placing his or her class units in sections of other frameworks that overlap with his or her noon pause.

###### <a name="planningData_teachers_items_generalSettings_dailyBuildingTransfers"></a>3.7.1.8.11. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers`

**Title:** DailyBuildingTransfers

|                           |                                |
| ------------------------- | ------------------------------ |
| **Type**                  | `object`                       |
| **Required**              | No                             |
| **Additional properties** | Not allowed                    |
| **Defined in**            | #/$defs/dailyBuildingTransfers |

**Description:** Maximum number of movements between buildings that the teacher can make per day.

| Property                                                                                        | Pattern | Type    | Deprecated | Definition | Title/Description                                                   |
| ----------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------- |
| - [strict](#planningData_teachers_items_generalSettings_dailyBuildingTransfers_strict )         | No      | integer | No         | -          | Strict maximum number of movements per day.                         |
| - [preferable](#planningData_teachers_items_generalSettings_dailyBuildingTransfers_preferable ) | No      | integer | No         | -          | Maximum number of movements per day that can be weighted/preferred. |

###### <a name="planningData_teachers_items_generalSettings_dailyBuildingTransfers_strict"></a>3.7.1.8.11.1. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > strict`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Strict maximum number of movements per day.

###### <a name="planningData_teachers_items_generalSettings_dailyBuildingTransfers_preferable"></a>3.7.1.8.11.2. Property `GhcEngineSchema > planningData > teachers > Teacher > generalSettings > dailyBuildingTransfers > preferable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum number of movements per day that can be weighted/preferred.

##### <a name="planningData_teachers_items_periodSettings"></a>3.7.1.9. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings`

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

| Each item of this array must be                                    | Description |
| ------------------------------------------------------------------ | ----------- |
| [PeriodSetting](#planningData_teachers_items_periodSettings_items) | -           |

###### <a name="planningData_teachers_items_periodSettings_items"></a>3.7.1.9.1. GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting

**Title:** PeriodSetting

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

| Property                                                                                                | Pattern | Type             | Deprecated | Definition                                                                                               | Title/Description                                                                                               |
| ------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | -------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------- |
| + [refPeriod](#planningData_teachers_items_periodSettings_items_refPeriod )                             | No      | string           | No         | -                                                                                                        | Identifier of the period to which the settings affect.                                                          |
| - [weeklyStay](#planningData_teachers_items_periodSettings_items_weeklyStay )                           | No      | object           | No         | Same as [weeklyStay](#planningData_teachers_items_generalSettings_weeklyStay )                           | WeeklyStay                                                                                                      |
| - [dailyStay](#planningData_teachers_items_periodSettings_items_dailyStay )                             | No      | object           | No         | Same as [dailyStay](#planningData_teachers_items_generalSettings_dailyStay )                             | DailyStay                                                                                                       |
| - [avoidGapsBetweenSesions](#planningData_teachers_items_periodSettings_items_avoidGapsBetweenSesions ) | No      | boolean          | No         | Same as [avoidGapsBetweenSesions](#planningData_teachers_items_generalSettings_avoidGapsBetweenSesions ) | It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition. |
| - [maxContinuousTeaching](#planningData_teachers_items_periodSettings_items_maxContinuousTeaching )     | No      | object           | No         | Same as [maxContinuousTeaching](#planningData_teachers_items_generalSettings_maxContinuousTeaching )     | MaxContinuousTeaching                                                                                           |
| - [avoidClassesAroundBreak](#planningData_teachers_items_periodSettings_items_avoidClassesAroundBreak ) | No      | enum (of string) | No         | Same as [avoidClassesAroundBreak](#planningData_teachers_items_generalSettings_avoidClassesAroundBreak ) | ConditionType                                                                                                   |
| - [freeTimes](#planningData_teachers_items_periodSettings_items_freeTimes )                             | No      | object           | No         | Same as [freeTimes](#planningData_teachers_items_generalSettings_freeTimes )                             | FreeTimes                                                                                                       |
| - [freePartTimes](#planningData_teachers_items_periodSettings_items_freePartTimes )                     | No      | object           | No         | Same as [freePartTimes](#planningData_teachers_items_generalSettings_freePartTimes )                     | FreePartTime                                                                                                    |
| - [incompatibilities](#planningData_teachers_items_periodSettings_items_incompatibilities )             | No      | object           | No         | Same as [incompatibilities](#planningData_teachers_items_generalSettings_incompatibilities )             | Incompatibilities                                                                                               |
| - [dailyOcupation](#planningData_teachers_items_periodSettings_items_dailyOcupation )                   | No      | object           | No         | Same as [dailyOcupation](#planningData_teachers_items_generalSettings_dailyOcupation )                   | DailyOcupation                                                                                                  |
| - [middayReference](#planningData_teachers_items_periodSettings_items_middayReference )                 | No      | object           | No         | Same as [middayReference](#planningData_teachers_items_generalSettings_middayReference )                 | MiddayReference                                                                                                 |
| - [dailyBuildingTransfers](#planningData_teachers_items_periodSettings_items_dailyBuildingTransfers )   | No      | object           | No         | Same as [dailyBuildingTransfers](#planningData_teachers_items_generalSettings_dailyBuildingTransfers )   | DailyBuildingTransfers                                                                                          |

###### <a name="planningData_teachers_items_periodSettings_items_refPeriod"></a>3.7.1.9.1.1. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > refPeriod`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the period to which the settings affect.

###### <a name="planningData_teachers_items_periodSettings_items_weeklyStay"></a>3.7.1.9.1.2. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > weeklyStay`

**Title:** WeeklyStay

|                           |                                                                       |
| ------------------------- | --------------------------------------------------------------------- |
| **Type**                  | `object`                                                              |
| **Required**              | No                                                                    |
| **Additional properties** | Not allowed                                                           |
| **Same definition as**    | [weeklyStay](#planningData_teachers_items_generalSettings_weeklyStay) |

**Description:** It indicates the maximum preferential and strict teacher's stay, for the weekly stay that the teacher can be in the academic institution.

###### <a name="planningData_teachers_items_periodSettings_items_dailyStay"></a>3.7.1.9.1.3. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyStay`

**Title:** DailyStay

|                           |                                                                     |
| ------------------------- | ------------------------------------------------------------------- |
| **Type**                  | `object`                                                            |
| **Required**              | No                                                                  |
| **Additional properties** | Not allowed                                                         |
| **Same definition as**    | [dailyStay](#planningData_teachers_items_generalSettings_dailyStay) |

**Description:** This indicates the maximum preferential and strict time of stay of the teacher, for the daily stay that the teacher can be in the educational institution.

###### <a name="planningData_teachers_items_periodSettings_items_avoidGapsBetweenSesions"></a>3.7.1.9.1.4. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidGapsBetweenSesions`

|                        |                                                                                                 |
| ---------------------- | ----------------------------------------------------------------------------------------------- |
| **Type**               | `boolean`                                                                                       |
| **Required**           | No                                                                                              |
| **Default**            | `true`                                                                                          |
| **Same definition as** | [avoidGapsBetweenSesions](#planningData_teachers_items_generalSettings_avoidGapsBetweenSesions) |

**Description:** It indicates whether gaps between class units for the teacher should be avoided. This is a weighting condition.

###### <a name="planningData_teachers_items_periodSettings_items_maxContinuousTeaching"></a>3.7.1.9.1.5. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > maxContinuousTeaching`

**Title:** MaxContinuousTeaching

|                           |                                                                                             |
| ------------------------- | ------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                    |
| **Required**              | No                                                                                          |
| **Additional properties** | Not allowed                                                                                 |
| **Same definition as**    | [maxContinuousTeaching](#planningData_teachers_items_generalSettings_maxContinuousTeaching) |

**Description:** It indicates the maximum continuous time of class units, which are allowed without having a gap or a non-class units between them.

###### <a name="planningData_teachers_items_periodSettings_items_avoidClassesAroundBreak"></a>3.7.1.9.1.6. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > avoidClassesAroundBreak`

**Title:** ConditionType

|                        |                                                                                                 |
| ---------------------- | ----------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                              |
| **Required**           | No                                                                                              |
| **Default**            | `"ignore"`                                                                                      |
| **Same definition as** | [avoidClassesAroundBreak](#planningData_teachers_items_generalSettings_avoidClassesAroundBreak) |

**Description:** It indicates whether the existence of class units on both sides of a playground supervision taught by this teacher will be penalised or forbidden.

###### <a name="planningData_teachers_items_periodSettings_items_freeTimes"></a>3.7.1.9.1.7. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > freeTimes`

**Title:** FreeTimes

|                           |                                                                     |
| ------------------------- | ------------------------------------------------------------------- |
| **Type**                  | `object`                                                            |
| **Required**              | No                                                                  |
| **Additional properties** | Not allowed                                                         |
| **Same definition as**    | [freeTimes](#planningData_teachers_items_generalSettings_freeTimes) |

**Description:** It contains the free time spaces that the teacher must have.

###### <a name="planningData_teachers_items_periodSettings_items_freePartTimes"></a>3.7.1.9.1.8. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > freePartTimes`

**Title:** FreePartTime

|                           |                                                                             |
| ------------------------- | --------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                    |
| **Required**              | No                                                                          |
| **Additional properties** | Not allowed                                                                 |
| **Same definition as**    | [freePartTimes](#planningData_teachers_items_generalSettings_freePartTimes) |

**Description:** Free half-time periods .

###### <a name="planningData_teachers_items_periodSettings_items_incompatibilities"></a>3.7.1.9.1.9. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > incompatibilities`

**Title:** Incompatibilities

|                           |                                                                                     |
| ------------------------- | ----------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                            |
| **Required**              | No                                                                                  |
| **Additional properties** | Not allowed                                                                         |
| **Same definition as**    | [incompatibilities](#planningData_teachers_items_generalSettings_incompatibilities) |

**Description:** It contains the teacher's incompatibilities on the allocation of class units and rest periods.

###### <a name="planningData_teachers_items_periodSettings_items_dailyOcupation"></a>3.7.1.9.1.10. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyOcupation`

**Title:** DailyOcupation

|                           |                                                                               |
| ------------------------- | ----------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                      |
| **Required**              | No                                                                            |
| **Additional properties** | Not allowed                                                                   |
| **Same definition as**    | [dailyOcupation](#planningData_teachers_items_generalSettings_dailyOcupation) |

**Description:** Maximum and minimum values of teaching or activity time for teachers. This object indicates the type of condition (strict or weighting) and whether the automatic calculation in minutes in the engine should be set.

###### <a name="planningData_teachers_items_periodSettings_items_middayReference"></a>3.7.1.9.1.11. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > middayReference`

**Title:** MiddayReference

|                           |                                                                                 |
| ------------------------- | ------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                        |
| **Required**              | No                                                                              |
| **Additional properties** | Not allowed                                                                     |
| **Same definition as**    | [middayReference](#planningData_teachers_items_generalSettings_middayReference) |

**Description:** It indicate the frame where the teacher takes noon pause.

###### <a name="planningData_teachers_items_periodSettings_items_dailyBuildingTransfers"></a>3.7.1.9.1.12. Property `GhcEngineSchema > planningData > teachers > Teacher > periodSettings > PeriodSetting > dailyBuildingTransfers`

**Title:** DailyBuildingTransfers

|                           |                                                                                               |
| ------------------------- | --------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                      |
| **Required**              | No                                                                                            |
| **Additional properties** | Not allowed                                                                                   |
| **Same definition as**    | [dailyBuildingTransfers](#planningData_teachers_items_generalSettings_dailyBuildingTransfers) |

**Description:** Maximum number of movements between buildings that the teacher can make per day.

### <a name="planningData_subjects"></a>3.8. Property `GhcEngineSchema > planningData > subjects`

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

| Each item of this array must be         | Description |
| --------------------------------------- | ----------- |
| [Subject](#planningData_subjects_items) | -           |

#### <a name="planningData_subjects_items"></a>3.8.1. GhcEngineSchema > planningData > subjects > Subject

**Title:** Subject

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                     | Pattern | Type             | Deprecated | Definition                                                        | Title/Description                                                    |
| ---------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ----------------------------------------------------------------- | -------------------------------------------------------------------- |
| + [id](#planningData_subjects_items_id )                                     | No      | string           | No         | -                                                                 | Subject identifier.                                                  |
| - [shortName](#planningData_subjects_items_shortName )                       | No      | string           | No         | -                                                                 | Short name of the subject.                                           |
| - [fullName](#planningData_subjects_items_fullName )                         | No      | string           | No         | -                                                                 | Complete name of the subject.                                        |
| - [exKey](#planningData_subjects_items_exKey )                               | No      | string           | No         | -                                                                 | External key of the subject                                          |
| - [isStudentMentoring](#planningData_subjects_items_isStudentMentoring )     | No      | boolean          | No         | -                                                                 | Indicates whether the subject is a tutoring session with students    |
| - [technicalTeacher](#planningData_subjects_items_technicalTeacher )         | No      | boolean          | No         | -                                                                 | It indicates whether the subject is teach by technical teacher.      |
| - [type](#planningData_subjects_items_type )                                 | No      | enum (of string) | No         | -                                                                 | Type of the subject                                                  |
| - [refClassroom](#planningData_subjects_items_refClassroom )                 | No      | string           | No         | -                                                                 | Id of the classroom assigned to teach the subject.                   |
| - [refClassRoomSetsList](#planningData_subjects_items_refClassRoomSetsList ) | No      | array of string  | No         | -                                                                 | List of alternative classroom sets assigned to schedule the subject. |
| - [refColourInResult](#planningData_subjects_items_refColourInResult )       | No      | string           | No         | -                                                                 | Colour code used to represent the subject in the result.             |
| - [frameTemplate](#planningData_subjects_items_frameTemplate )               | No      | array of object  | No         | Same as [frameTemplate](#planningData_tasks_items_frameTemplate ) | FrameTemplate                                                        |

##### <a name="planningData_subjects_items_id"></a>3.8.1.1. Property `GhcEngineSchema > planningData > subjects > Subject > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Subject identifier.

##### <a name="planningData_subjects_items_shortName"></a>3.8.1.2. Property `GhcEngineSchema > planningData > subjects > Subject > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the subject.

##### <a name="planningData_subjects_items_fullName"></a>3.8.1.3. Property `GhcEngineSchema > planningData > subjects > Subject > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the subject.

##### <a name="planningData_subjects_items_exKey"></a>3.8.1.4. Property `GhcEngineSchema > planningData > subjects > Subject > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the subject

##### <a name="planningData_subjects_items_isStudentMentoring"></a>3.8.1.5. Property `GhcEngineSchema > planningData > subjects > Subject > isStudentMentoring`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates whether the subject is a tutoring session with students

##### <a name="planningData_subjects_items_technicalTeacher"></a>3.8.1.6. Property `GhcEngineSchema > planningData > subjects > Subject > technicalTeacher`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether the subject is teach by technical teacher.

##### <a name="planningData_subjects_items_type"></a>3.8.1.7. Property `GhcEngineSchema > planningData > subjects > Subject > type`

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

##### <a name="planningData_subjects_items_refClassroom"></a>3.8.1.8. Property `GhcEngineSchema > planningData > subjects > Subject > refClassroom`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the classroom assigned to teach the subject.

##### <a name="planningData_subjects_items_refClassRoomSetsList"></a>3.8.1.9. Property `GhcEngineSchema > planningData > subjects > Subject > refClassRoomSetsList`

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

| Each item of this array must be                                            | Description               |
| -------------------------------------------------------------------------- | ------------------------- |
| [ClassRoomSetRef](#planningData_subjects_items_refClassRoomSetsList_items) | Classroom set identifier. |

###### <a name="planningData_subjects_items_refClassRoomSetsList_items"></a>3.8.1.9.1. GhcEngineSchema > planningData > subjects > Subject > refClassRoomSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

##### <a name="planningData_subjects_items_refColourInResult"></a>3.8.1.10. Property `GhcEngineSchema > planningData > subjects > Subject > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the subject in the result.

##### <a name="planningData_subjects_items_frameTemplate"></a>3.8.1.11. Property `GhcEngineSchema > planningData > subjects > Subject > frameTemplate`

**Title:** FrameTemplate

|                        |                                                          |
| ---------------------- | -------------------------------------------------------- |
| **Type**               | `array of object`                                        |
| **Required**           | No                                                       |
| **Same definition as** | [frameTemplate](#planningData_tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

### <a name="planningData_groups"></a>3.9. Property `GhcEngineSchema > planningData > groups`

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

| Each item of this array must be     | Description |
| ----------------------------------- | ----------- |
| [Group](#planningData_groups_items) | -           |

#### <a name="planningData_groups_items"></a>3.9.1. GhcEngineSchema > planningData > groups > Group

**Title:** Group

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                           | Pattern | Type             | Deprecated | Definition                                                                               | Title/Description                                                                                                                |
| ---------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#planningData_groups_items_id )                                             | No      | string           | No         | -                                                                                        | Group identifier.                                                                                                                |
| - [shortName](#planningData_groups_items_shortName )                               | No      | string           | No         | -                                                                                        | Short name of the group.                                                                                                         |
| - [fullName](#planningData_groups_items_fullName )                                 | No      | string           | No         | -                                                                                        | Complete name of the group.                                                                                                      |
| - [exKey](#planningData_groups_items_exKey )                                       | No      | string           | No         | -                                                                                        | External key of the subject                                                                                                      |
| + [refFrame](#planningData_groups_items_refFrame )                                 | No      | string           | No         | -                                                                                        | Group's frame identifier.                                                                                                        |
| - [frameTemplate](#planningData_groups_items_frameTemplate )                       | No      | array of object  | No         | Same as [frameTemplate](#planningData_tasks_items_frameTemplate )                        | FrameTemplate                                                                                                                    |
| - [numStudents](#planningData_groups_items_numStudents )                           | No      | integer          | No         | -                                                                                        | Number of students in the group.                                                                                                 |
| - [freeAfternoons](#planningData_groups_items_freeAfternoons )                     | No      | integer          | No         | -                                                                                        | Stric number of free afternoons for the group.                                                                                   |
| - [notGaps](#planningData_groups_items_notGaps )                                   | No      | enum (of string) | No         | Same as [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type ) | ConditionType                                                                                                                    |
| - [gapsAlwaysInNonPreferred](#planningData_groups_items_gapsAlwaysInNonPreferred ) | No      | boolean          | No         | -                                                                                        | This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps. |
| - [refCourse](#planningData_groups_items_refCourse )                               | No      | string           | No         | -                                                                                        | Course identifier to which the group belongs.                                                                                    |
| - [includedGroups](#planningData_groups_items_includedGroups )                     | No      | array of string  | No         | -                                                                                        | Identifiers of the groups included in this group. A group that defines this property is considered a group set.                  |
| - [refTeacher](#planningData_groups_items_refTeacher )                             | No      | string           | No         | -                                                                                        | Id of the tutor teacher assigned to the group                                                                                    |
| - [refClassroom](#planningData_groups_items_refClassroom )                         | No      | string           | No         | -                                                                                        | Id of the classroom assigned to the group                                                                                        |
| - [refClassRoomSetsList](#planningData_groups_items_refClassRoomSetsList )         | No      | array of string  | No         | -                                                                                        | List of classroom sets assigned to the group.                                                                                    |

##### <a name="planningData_groups_items_id"></a>3.9.1.1. Property `GhcEngineSchema > planningData > groups > Group > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group identifier.

##### <a name="planningData_groups_items_shortName"></a>3.9.1.2. Property `GhcEngineSchema > planningData > groups > Group > shortName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Short name of the group.

##### <a name="planningData_groups_items_fullName"></a>3.9.1.3. Property `GhcEngineSchema > planningData > groups > Group > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Complete name of the group.

##### <a name="planningData_groups_items_exKey"></a>3.9.1.4. Property `GhcEngineSchema > planningData > groups > Group > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the subject

##### <a name="planningData_groups_items_refFrame"></a>3.9.1.5. Property `GhcEngineSchema > planningData > groups > Group > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group's frame identifier.

##### <a name="planningData_groups_items_frameTemplate"></a>3.9.1.6. Property `GhcEngineSchema > planningData > groups > Group > frameTemplate`

**Title:** FrameTemplate

|                        |                                                          |
| ---------------------- | -------------------------------------------------------- |
| **Type**               | `array of object`                                        |
| **Required**           | No                                                       |
| **Same definition as** | [frameTemplate](#planningData_tasks_items_frameTemplate) |

**Description:** Templates with frame sections assignment preferences.

##### <a name="planningData_groups_items_numStudents"></a>3.9.1.7. Property `GhcEngineSchema > planningData > groups > Group > numStudents`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Number of students in the group.

##### <a name="planningData_groups_items_freeAfternoons"></a>3.9.1.8. Property `GhcEngineSchema > planningData > groups > Group > freeAfternoons`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Stric number of free afternoons for the group.

##### <a name="planningData_groups_items_notGaps"></a>3.9.1.9. Property `GhcEngineSchema > planningData > groups > Group > notGaps`

**Title:** ConditionType

|                        |                                                                                 |
| ---------------------- | ------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                              |
| **Required**           | No                                                                              |
| **Same definition as** | [type](#planningData_teachers_items_generalSettings_maxContinuousTeaching_type) |

**Description:** It indicates if the group can have gaps in its timetable.

##### <a name="planningData_groups_items_gapsAlwaysInNonPreferred"></a>3.9.1.10. Property `GhcEngineSchema > planningData > groups > Group > gapsAlwaysInNonPreferred`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** This indicates whether the engine should be in the positions marked as non-preferred in the template for free intervals or gaps.

##### <a name="planningData_groups_items_refCourse"></a>3.9.1.11. Property `GhcEngineSchema > planningData > groups > Group > refCourse`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Course identifier to which the group belongs.

##### <a name="planningData_groups_items_includedGroups"></a>3.9.1.12. Property `GhcEngineSchema > planningData > groups > Group > includedGroups`

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

| Each item of this array must be                              | Description        |
| ------------------------------------------------------------ | ------------------ |
| [refGroups](#planningData_groups_items_includedGroups_items) | Groups identifier. |

###### <a name="planningData_groups_items_includedGroups_items"></a>3.9.1.12.1. GhcEngineSchema > planningData > groups > Group > includedGroups > refGroups

**Title:** refGroups

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Groups identifier.

##### <a name="planningData_groups_items_refTeacher"></a>3.9.1.13. Property `GhcEngineSchema > planningData > groups > Group > refTeacher`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the tutor teacher assigned to the group

##### <a name="planningData_groups_items_refClassroom"></a>3.9.1.14. Property `GhcEngineSchema > planningData > groups > Group > refClassroom`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Id of the classroom assigned to the group

##### <a name="planningData_groups_items_refClassRoomSetsList"></a>3.9.1.15. Property `GhcEngineSchema > planningData > groups > Group > refClassRoomSetsList`

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

| Each item of this array must be                                          | Description               |
| ------------------------------------------------------------------------ | ------------------------- |
| [ClassRoomSetRef](#planningData_groups_items_refClassRoomSetsList_items) | Classroom set identifier. |

###### <a name="planningData_groups_items_refClassRoomSetsList_items"></a>3.9.1.15.1. GhcEngineSchema > planningData > groups > Group > refClassRoomSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

### <a name="planningData_groupSetRelations"></a>3.10. Property `GhcEngineSchema > planningData > groupSetRelations`

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

| Each item of this array must be                           | Description                                                                       |
| --------------------------------------------------------- | --------------------------------------------------------------------------------- |
| [GroupSetRelation](#planningData_groupSetRelations_items) | Relationship between group sets represented by Group objects with includedGroups. |

#### <a name="planningData_groupSetRelations_items"></a>3.10.1. GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation

**Title:** GroupSetRelation

|                           |                          |
| ------------------------- | ------------------------ |
| **Type**                  | `object`                 |
| **Required**              | No                       |
| **Additional properties** | Not allowed              |
| **Defined in**            | #/$defs/groupSetRelation |

**Description:** Relationship between group sets represented by Group objects with includedGroups.

| Property                                                          | Pattern | Type    | Deprecated | Definition                            | Title/Description                                          |
| ----------------------------------------------------------------- | ------- | ------- | ---------- | ------------------------------------- | ---------------------------------------------------------- |
| + [id](#planningData_groupSetRelations_items_id )                 | No      | integer | No         | -                                     | Group set relationship identifier.                         |
| - [alias](#planningData_groupSetRelations_items_alias )           | No      | string  | No         | -                                     | Optional name used to identify the group set relationship. |
| + [expression](#planningData_groupSetRelations_items_expression ) | No      | object  | No         | In #/$defs/groupSetRelationExpression | GroupSetRelationExpression                                 |

##### <a name="planningData_groupSetRelations_items_id"></a>3.10.1.1. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Group set relationship identifier.

##### <a name="planningData_groupSetRelations_items_alias"></a>3.10.1.2. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > alias`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Optional name used to identify the group set relationship.

##### <a name="planningData_groupSetRelations_items_expression"></a>3.10.1.3. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression`

**Title:** GroupSetRelationExpression

|                           |                                    |
| ------------------------- | ---------------------------------- |
| **Type**                  | `object`                           |
| **Required**              | Yes                                |
| **Additional properties** | Not allowed                        |
| **Defined in**            | #/$defs/groupSetRelationExpression |

**Description:** Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.

| Property                                                                                                   | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                                                |
| ---------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [operator](#planningData_groupSetRelations_items_expression_operator )                                   | No      | enum (of string) | No         | -          | Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding. |
| - [refGroupSet](#planningData_groupSetRelations_items_expression_refGroupSet )                             | No      | array of string  | No         | -          | GroupSetRelationMembers                                                                                                                                          |
| - [nestedRelationExpressions](#planningData_groupSetRelations_items_expression_nestedRelationExpressions ) | No      | array            | No         | -          | NestedRelationExpressions                                                                                                                                        |

###### <a name="planningData_groupSetRelations_items_expression_operator"></a>3.10.1.3.1. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > operator`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Relationship between the referenced group sets. COMPATIBLE allows their included groups to be scheduled simultaneously; EXCLUSIVE prevents them from coinciding.

Must be one of:
* "COMPATIBLE"
* "EXCLUSIVE"

###### <a name="planningData_groupSetRelations_items_expression_refGroupSet"></a>3.10.1.3.2. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet`

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

| Each item of this array must be                                                         | Description                                                                            |
| --------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------- |
| [GroupSetReference](#planningData_groupSetRelations_items_expression_refGroupSet_items) | Identifier of a Group that represents a group set through its includedGroups property. |

###### <a name="planningData_groupSetRelations_items_expression_refGroupSet_items"></a>3.10.1.3.2.1. GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > refGroupSet > GroupSetReference

**Title:** GroupSetReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of a Group that represents a group set through its includedGroups property.

###### <a name="planningData_groupSetRelations_items_expression_nestedRelationExpressions"></a>3.10.1.3.3. Property `GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions`

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

| Each item of this array must be                                                                                | Description                                                                                                        |
| -------------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------ |
| [GroupSetRelationExpression](#planningData_groupSetRelations_items_expression_nestedRelationExpressions_items) | Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously. |

###### <a name="planningData_groupSetRelations_items_expression_nestedRelationExpressions_items"></a>3.10.1.3.3.1. GhcEngineSchema > planningData > groupSetRelations > GroupSetRelation > expression > nestedRelationExpressions > GroupSetRelationExpression

**Title:** GroupSetRelationExpression

|                           |                                                                |
| ------------------------- | -------------------------------------------------------------- |
| **Type**                  | `object`                                                       |
| **Required**              | No                                                             |
| **Additional properties** | Not allowed                                                    |
| **Same definition as**    | [expression](#planningData_groupSetRelations_items_expression) |

**Description:** Expression that indicates whether its referenced group sets or nested expressions can be scheduled simultaneously.

### <a name="planningData_courses"></a>3.11. Property `GhcEngineSchema > planningData > courses`

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

| Each item of this array must be       | Description |
| ------------------------------------- | ----------- |
| [Course](#planningData_courses_items) | -           |

#### <a name="planningData_courses_items"></a>3.11.1. GhcEngineSchema > planningData > courses > Course

**Title:** Course

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                        | Pattern | Type            | Deprecated | Definition | Title/Description                        |
| --------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ---------------------------------------- |
| + [id](#planningData_courses_items_id )                         | No      | string          | No         | -          | Course identifier.                       |
| - [fullName](#planningData_courses_items_fullName )             | No      | string          | No         | -          | Full name of the course.                 |
| - [exKey](#planningData_courses_items_exKey )                   | No      | string          | No         | -          | External key of the course               |
| - [courseSubjects](#planningData_courses_items_courseSubjects ) | No      | array of object | No         | -          | List of subjects assigned to the course. |

##### <a name="planningData_courses_items_id"></a>3.11.1.1. Property `GhcEngineSchema > planningData > courses > Course > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Course identifier.

##### <a name="planningData_courses_items_fullName"></a>3.11.1.2. Property `GhcEngineSchema > planningData > courses > Course > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Full name of the course.

##### <a name="planningData_courses_items_exKey"></a>3.11.1.3. Property `GhcEngineSchema > planningData > courses > Course > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** External key of the course

##### <a name="planningData_courses_items_courseSubjects"></a>3.11.1.4. Property `GhcEngineSchema > planningData > courses > Course > courseSubjects`

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

| Each item of this array must be                                   | Description |
| ----------------------------------------------------------------- | ----------- |
| [CourseSubject](#planningData_courses_items_courseSubjects_items) | -           |

###### <a name="planningData_courses_items_courseSubjects_items"></a>3.11.1.4.1. GhcEngineSchema > planningData > courses > Course > courseSubjects > CourseSubject

**Title:** CourseSubject

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                     | Pattern | Type    | Deprecated | Definition | Title/Description                                                 |
| ---------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------- |
| + [numHours](#planningData_courses_items_courseSubjects_items_numHours )     | No      | integer | No         | -          | Number of hours that this subject is taught. By default, it is 1. |
| + [refSubject](#planningData_courses_items_courseSubjects_items_refSubject ) | No      | string  | No         | -          | Subject of the course.                                            |

###### <a name="planningData_courses_items_courseSubjects_items_numHours"></a>3.11.1.4.1.1. Property `GhcEngineSchema > planningData > courses > Course > courseSubjects > CourseSubject > numHours`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Number of hours that this subject is taught. By default, it is 1.

###### <a name="planningData_courses_items_courseSubjects_items_refSubject"></a>3.11.1.4.1.2. Property `GhcEngineSchema > planningData > courses > Course > courseSubjects > CourseSubject > refSubject`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Subject of the course.

### <a name="planningData_departments"></a>3.12. Property `GhcEngineSchema > planningData > departments`

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

| Each item of this array must be               | Description |
| --------------------------------------------- | ----------- |
| [Department](#planningData_departments_items) | -           |

#### <a name="planningData_departments_items"></a>3.12.1. GhcEngineSchema > planningData > departments > Department

**Title:** Department

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                      | Pattern | Type            | Deprecated | Definition | Title/Description                                                                                 |
| ----------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------- |
| + [id](#planningData_departments_items_id )                                   | No      | string          | No         | -          | Department identifier.                                                                            |
| - [fullName](#planningData_departments_items_fullName )                       | No      | string          | No         | -          | Full name of the department.                                                                      |
| - [messageToDepartment](#planningData_departments_items_messageToDepartment ) | No      | string          | No         | -          | Message that will be shown to the Department in the desiderata capture program.                   |
| - [isNew](#planningData_departments_items_isNew )                             | No      | boolean         | No         | -          | Boolean that indicates if the Department has been newly created in the desiderata capture module. |
| - [exKey](#planningData_departments_items_exKey )                             | No      | string          | No         | -          | Identifier of the Department in external application or academic manager.                         |
| - [email](#planningData_departments_items_email )                             | No      | string          | No         | -          | It is an email type that is associated with the Department                                        |
| - [refTeacher](#planningData_departments_items_refTeacher )                   | No      | array of string | No         | -          | Identifier of the list of teachers who are in this department                                     |
| - [refSubjects](#planningData_departments_items_refSubjects )                 | No      | array of string | No         | -          | Identifier of the list of subjects who are in this department                                     |

##### <a name="planningData_departments_items_id"></a>3.12.1.1. Property `GhcEngineSchema > planningData > departments > Department > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Department identifier.

##### <a name="planningData_departments_items_fullName"></a>3.12.1.2. Property `GhcEngineSchema > planningData > departments > Department > fullName`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Full name of the department.

##### <a name="planningData_departments_items_messageToDepartment"></a>3.12.1.3. Property `GhcEngineSchema > planningData > departments > Department > messageToDepartment`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Message that will be shown to the Department in the desiderata capture program.

##### <a name="planningData_departments_items_isNew"></a>3.12.1.4. Property `GhcEngineSchema > planningData > departments > Department > isNew`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |

**Description:** Boolean that indicates if the Department has been newly created in the desiderata capture module.

##### <a name="planningData_departments_items_exKey"></a>3.12.1.5. Property `GhcEngineSchema > planningData > departments > Department > exKey`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the Department in external application or academic manager.

##### <a name="planningData_departments_items_email"></a>3.12.1.6. Property `GhcEngineSchema > planningData > departments > Department > email`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** It is an email type that is associated with the Department

##### <a name="planningData_departments_items_refTeacher"></a>3.12.1.7. Property `GhcEngineSchema > planningData > departments > Department > refTeacher`

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

| Each item of this array must be                                      | Description |
| -------------------------------------------------------------------- | ----------- |
| [refTeacher items](#planningData_departments_items_refTeacher_items) | -           |

###### <a name="planningData_departments_items_refTeacher_items"></a>3.12.1.7.1. GhcEngineSchema > planningData > departments > Department > refTeacher > refTeacher items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

##### <a name="planningData_departments_items_refSubjects"></a>3.12.1.8. Property `GhcEngineSchema > planningData > departments > Department > refSubjects`

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

| Each item of this array must be                                        | Description |
| ---------------------------------------------------------------------- | ----------- |
| [refSubjects items](#planningData_departments_items_refSubjects_items) | -           |

###### <a name="planningData_departments_items_refSubjects_items"></a>3.12.1.8.1. GhcEngineSchema > planningData > departments > Department > refSubjects > refSubjects items

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

### <a name="planningData_sessions"></a>3.13. Property `GhcEngineSchema > planningData > sessions`

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

| Each item of this array must be         | Description |
| --------------------------------------- | ----------- |
| [Session](#planningData_sessions_items) | -           |

#### <a name="planningData_sessions_items"></a>3.13.1. GhcEngineSchema > planningData > sessions > Session

**Title:** Session

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

| Property                                                                               | Pattern | Type            | Deprecated | Definition                      | Title/Description                                        |
| -------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------- | -------------------------------------------------------- |
| + [id](#planningData_sessions_items_id )                                               | No      | integer         | No         | -                               | Session identifier.                                      |
| + [refFrame](#planningData_sessions_items_refFrame )                                   | No      | string          | No         | -                               | Session's frame identifier.                              |
| + [refMainTask](#planningData_sessions_items_refMainTask )                             | No      | string          | No         | -                               | RefMainTask                                              |
| + [refMainTeacher](#planningData_sessions_items_refMainTeacher )                       | No      | string          | No         | -                               | RefMainTeacher                                           |
| + [refMainSubject](#planningData_sessions_items_refMainSubject )                       | No      | string          | No         | -                               | RefMainSubject                                           |
| + [refMainGroup](#planningData_sessions_items_refMainGroup )                           | No      | object          | No         | In #/$defs/refGroup             | GroupReferenceType                                       |
| - [refColourInResult](#planningData_sessions_items_refColourInResult )                 | No      | string          | No         | -                               | RefColourInResult                                        |
| - [otherElementsInClassRooms](#planningData_sessions_items_otherElementsInClassRooms ) | No      | array of object | No         | -                               | OtherElementsInClassRoomsList                            |
| + [distribution](#planningData_sessions_items_distribution )                           | No      | object          | No         | In #/$defs/distribution         | Distribution                                             |
| + [sessionClassRooms](#planningData_sessions_items_sessionClassRooms )                 | No      | object          | No         | -                               | SessionClassRooms                                        |
| - [frameTemplate](#planningData_sessions_items_frameTemplate )                         | No      | array of object | No         | In #/$defs/sessionFrameTemplate | SessionFrameTemplate                                     |
| - [sessionSettings](#planningData_sessions_items_sessionSettings )                     | No      | object          | No         | -                               | SessionSettings                                          |
| - [sessionRelations](#planningData_sessions_items_sessionRelations )                   | No      | object          | No         | -                               | SessionRelations                                         |
| - [department](#planningData_sessions_items_department )                               | No      | string          | No         | -                               | Contains the reference of the department of the session. |

##### <a name="planningData_sessions_items_id"></a>3.13.1.1. Property `GhcEngineSchema > planningData > sessions > Session > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Session identifier.

##### <a name="planningData_sessions_items_refFrame"></a>3.13.1.2. Property `GhcEngineSchema > planningData > sessions > Session > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

##### <a name="planningData_sessions_items_refMainTask"></a>3.13.1.3. Property `GhcEngineSchema > planningData > sessions > Session > refMainTask`

**Title:** RefMainTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Main Task identifier.

##### <a name="planningData_sessions_items_refMainTeacher"></a>3.13.1.4. Property `GhcEngineSchema > planningData > sessions > Session > refMainTeacher`

**Title:** RefMainTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Main Teacher identifier.

##### <a name="planningData_sessions_items_refMainSubject"></a>3.13.1.5. Property `GhcEngineSchema > planningData > sessions > Session > refMainSubject`

**Title:** RefMainSubject

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the main subject.

##### <a name="planningData_sessions_items_refMainGroup"></a>3.13.1.6. Property `GhcEngineSchema > planningData > sessions > Session > refMainGroup`

**Title:** GroupReferenceType

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | Yes              |
| **Additional properties** | Any type allowed |
| **Defined in**            | #/$defs/refGroup |

**Description:** Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

| Property                                                                | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                    |
| ----------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------ |
| + [refIdGroup](#planningData_sessions_items_refMainGroup_refIdGroup )   | No      | string  | No         | -          | Group identifier.                                                                                                                    |
| - [numStudents](#planningData_sessions_items_refMainGroup_numStudents ) | No      | integer | No         | -          | Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object. |

###### <a name="planningData_sessions_items_refMainGroup_refIdGroup"></a>3.13.1.6.1. Property `GhcEngineSchema > planningData > sessions > Session > refMainGroup > refIdGroup`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Group identifier.

###### <a name="planningData_sessions_items_refMainGroup_numStudents"></a>3.13.1.6.2. Property `GhcEngineSchema > planningData > sessions > Session > refMainGroup > numStudents`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Custom number of students that are in the class units. If it is not specified, the engine defaults to the value of the Group object.

##### <a name="planningData_sessions_items_refColourInResult"></a>3.13.1.7. Property `GhcEngineSchema > planningData > sessions > Session > refColourInResult`

**Title:** RefColourInResult

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the session in the result.

##### <a name="planningData_sessions_items_otherElementsInClassRooms"></a>3.13.1.8. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms`

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

| Each item of this array must be                                                           | Description                                                                                     |
| ----------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------- |
| [OtherElementsInClassRooms](#planningData_sessions_items_otherElementsInClassRooms_items) | It contains interrelated elements that are present in the session in addition to the main ones. |

###### <a name="planningData_sessions_items_otherElementsInClassRooms_items"></a>3.13.1.8.1. GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms

**Title:** OtherElementsInClassRooms

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** It contains interrelated elements that are present in the session in addition to the main ones.

| Property                                                                                 | Pattern | Type   | Deprecated | Definition                                                         | Title/Description  |
| ---------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ------------------------------------------------------------------ | ------------------ |
| - [refSubject](#planningData_sessions_items_otherElementsInClassRooms_items_refSubject ) | No      | string | No         | -                                                                  | SubjectReference   |
| - [refTeacher](#planningData_sessions_items_otherElementsInClassRooms_items_refTeacher ) | No      | string | No         | -                                                                  | TeacherReference   |
| - [refGroup](#planningData_sessions_items_otherElementsInClassRooms_items_refGroup )     | No      | object | No         | Same as [refMainGroup](#planningData_sessions_items_refMainGroup ) | GroupReferenceType |
| - [refTask](#planningData_sessions_items_otherElementsInClassRooms_items_refTask )       | No      | string | No         | -                                                                  | TaskReference      |

###### <a name="planningData_sessions_items_otherElementsInClassRooms_items_refSubject"></a>3.13.1.8.1.1. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refSubject`

**Title:** SubjectReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of other subject in the classroom.

###### <a name="planningData_sessions_items_otherElementsInClassRooms_items_refTeacher"></a>3.13.1.8.1.2. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTeacher`

**Title:** TeacherReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of other teacher in the classroom.

###### <a name="planningData_sessions_items_otherElementsInClassRooms_items_refGroup"></a>3.13.1.8.1.3. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refGroup`

**Title:** GroupReferenceType

|                           |                                                           |
| ------------------------- | --------------------------------------------------------- |
| **Type**                  | `object`                                                  |
| **Required**              | No                                                        |
| **Additional properties** | Any type allowed                                          |
| **Same definition as**    | [refMainGroup](#planningData_sessions_items_refMainGroup) |

**Description:** Contains the reference to a group of the session, and optionally, the number of students of the group that attend the session.

###### <a name="planningData_sessions_items_otherElementsInClassRooms_items_refTask"></a>3.13.1.8.1.4. Property `GhcEngineSchema > planningData > sessions > Session > otherElementsInClassRooms > OtherElementsInClassRooms > refTask`

**Title:** TaskReference

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier name of the task of the other teacher.

##### <a name="planningData_sessions_items_distribution"></a>3.13.1.9. Property `GhcEngineSchema > planningData > sessions > Session > distribution`

**Title:** Distribution

|                           |                      |
| ------------------------- | -------------------- |
| **Type**                  | `object`             |
| **Required**              | Yes                  |
| **Additional properties** | Not allowed          |
| **Defined in**            | #/$defs/distribution |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

| Property                                                                        | Pattern | Type            | Deprecated | Definition | Title/Description |
| ------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------- |
| - [periods](#planningData_sessions_items_distribution_periods )                 | No      | array of string | No         | -          | RefPeriods        |
| - [stablePeriods](#planningData_sessions_items_distribution_stablePeriods )     | No      | object          | No         | -          | StablePeriods     |
| - [variablePeriods](#planningData_sessions_items_distribution_variablePeriods ) | No      | object          | No         | -          | VariablePeriods   |

###### <a name="planningData_sessions_items_distribution_periods"></a>3.13.1.9.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > periods`

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

| Each item of this array must be                                      | Description        |
| -------------------------------------------------------------------- | ------------------ |
| [RefPeriod](#planningData_sessions_items_distribution_periods_items) | Period identifier. |

###### <a name="planningData_sessions_items_distribution_periods_items"></a>3.13.1.9.1.1. GhcEngineSchema > planningData > sessions > Session > distribution > periods > RefPeriod

**Title:** RefPeriod

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Period identifier.

###### <a name="planningData_sessions_items_distribution_stablePeriods"></a>3.13.1.9.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods`

**Title:** StablePeriods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** The allocation of the class unit of the session is the same in each period.

| Property                                                                                        | Pattern | Type             | Deprecated | Definition                | Title/Description |
| ----------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------- | ----------------- |
| - [stableTiming](#planningData_sessions_items_distribution_stablePeriods_stableTiming )         | No      | array of integer | No         | In #/$defs/stableTiming   | StableTiming      |
| - [variableTiming](#planningData_sessions_items_distribution_stablePeriods_variableTiming )     | No      | object           | No         | In #/$defs/variableTiming | VariableTiming    |
| - [stableTimingList](#planningData_sessions_items_distribution_stablePeriods_stableTimingList ) | No      | array            | No         | -                         | StableTimingList  |

###### <a name="planningData_sessions_items_distribution_stablePeriods_stableTiming"></a>3.13.1.9.2.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTiming`

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

| Each item of this array must be                                                            | Description                                                     |
| ------------------------------------------------------------------------------------------ | --------------------------------------------------------------- |
| [DailyMinutes](#planningData_sessions_items_distribution_stablePeriods_stableTiming_items) | Indicates the number of minutes to be allocated on a given day. |

###### <a name="planningData_sessions_items_distribution_stablePeriods_stableTiming_items"></a>3.13.1.9.2.1.1. GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTiming > DailyMinutes

**Title:** DailyMinutes

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the number of minutes to be allocated on a given day.

###### <a name="planningData_sessions_items_distribution_stablePeriods_variableTiming"></a>3.13.1.9.2.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming`

**Title:** VariableTiming

|                           |                        |
| ------------------------- | ---------------------- |
| **Type**                  | `object`               |
| **Required**              | No                     |
| **Additional properties** | Not allowed            |
| **Defined in**            | #/$defs/variableTiming |

**Description:** It defines the allocating time as a total of time, maximum and minimun range of sections per day.

| Property                                                                                                           | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                 |
| ------------------------------------------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------- |
| + [minutesAmount](#planningData_sessions_items_distribution_stablePeriods_variableTiming_minutesAmount )           | No      | integer | No         | -          | Total of session's minutes.                                                                                                       |
| + [maxMinutesDaily](#planningData_sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily )       | No      | integer | No         | -          | Maximum of minutes per day.                                                                                                       |
| - [minMinutesDaily](#planningData_sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily )       | No      | integer | No         | -          | Minimun of minutes per day.                                                                                                       |
| - [avoidMaxDuration](#planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration )     | No      | boolean | No         | -          | It indicates the preference for class units of maximum duration.                                                                  |
| - [avoidMinDuration](#planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration )     | No      | boolean | No         | -          | It indicates the preference for class units of minimun duration.                                                                  |
| - [allowDiscontinuity](#planningData_sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity ) | No      | boolean | No         | -          | It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them. |

###### <a name="planningData_sessions_items_distribution_stablePeriods_variableTiming_minutesAmount"></a>3.13.1.9.2.2.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minutesAmount`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Total of session's minutes.

###### <a name="planningData_sessions_items_distribution_stablePeriods_variableTiming_maxMinutesDaily"></a>3.13.1.9.2.2.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > maxMinutesDaily`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Maximum of minutes per day.

###### <a name="planningData_sessions_items_distribution_stablePeriods_variableTiming_minMinutesDaily"></a>3.13.1.9.2.2.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > minMinutesDaily`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Minimun of minutes per day.

###### <a name="planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMaxDuration"></a>3.13.1.9.2.2.4. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMaxDuration`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates the preference for class units of maximum duration.

###### <a name="planningData_sessions_items_distribution_stablePeriods_variableTiming_avoidMinDuration"></a>3.13.1.9.2.2.5. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > avoidMinDuration`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates the preference for class units of minimun duration.

###### <a name="planningData_sessions_items_distribution_stablePeriods_variableTiming_allowDiscontinuity"></a>3.13.1.9.2.2.6. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > variableTiming > allowDiscontinuity`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether discontinuous sections are allowed, that is, having sections of other class units or breaks in between them.

###### <a name="planningData_sessions_items_distribution_stablePeriods_stableTimingList"></a>3.13.1.9.2.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTimingList`

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

| Each item of this array must be                                                                | Description                                                                 |
| ---------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------- |
| [StableTiming](#planningData_sessions_items_distribution_stablePeriods_stableTimingList_items) | It contains the fixed way of allocating time across the days of the period. |

###### <a name="planningData_sessions_items_distribution_stablePeriods_stableTimingList_items"></a>3.13.1.9.2.3.1. GhcEngineSchema > planningData > sessions > Session > distribution > stablePeriods > stableTimingList > StableTiming

**Title:** StableTiming

|                        |                                                                                      |
| ---------------------- | ------------------------------------------------------------------------------------ |
| **Type**               | `array of integer`                                                                   |
| **Required**           | No                                                                                   |
| **Same definition as** | [stableTiming](#planningData_sessions_items_distribution_stablePeriods_stableTiming) |

**Description:** It contains the fixed way of allocating time across the days of the period.

###### <a name="planningData_sessions_items_distribution_variablePeriods"></a>3.13.1.9.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods`

**Title:** VariablePeriods

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** The total of the class units of the distribution are allocation between the periods.

| Property                                                                                                  | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                                                         |
| --------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [timing](#planningData_sessions_items_distribution_variablePeriods_timing )                             | No      | object  | No         | -          | TimeAllocation                                                                                                                                                                                                                                                                            |
| - [maximunTimeInPeriod](#planningData_sessions_items_distribution_variablePeriods_maximunTimeInPeriod )   | No      | integer | No         | -          | Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.                                                                                                                                                                |
| - [minimnunTimeInPeriod](#planningData_sessions_items_distribution_variablePeriods_minimnunTimeInPeriod ) | No      | integer | No         | -          | Minimum number of minutes to be allocated in each Period.                                                                                                                                                                                                                                 |
| - [maximumTimeframe](#planningData_sessions_items_distribution_variablePeriods_maximumTimeframe )         | No      | integer | No         | -          | Indicates the maximum interval of periods that can be used to assign the session, counting from the first period with a session assignment to the last period with a session assignment. That is, the periods in between are also considered even if they do not have a session assigned. |

###### <a name="planningData_sessions_items_distribution_variablePeriods_timing"></a>3.13.1.9.3.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > timing`

**Title:** TimeAllocation

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | Yes              |
| **Additional properties** | Any type allowed |

**Description:** Contains the specification of how the total time must be allocated within the days of the framework and should be distributed across the period or periods.

| Property                                                                                             | Pattern | Type             | Deprecated | Definition                                                                                        | Title/Description |
| ---------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ------------------------------------------------------------------------------------------------- | ----------------- |
| - [stableTiming](#planningData_sessions_items_distribution_variablePeriods_timing_stableTiming )     | No      | array of integer | No         | Same as [stableTiming](#planningData_sessions_items_distribution_stablePeriods_stableTiming )     | StableTiming      |
| - [variableTiming](#planningData_sessions_items_distribution_variablePeriods_timing_variableTiming ) | No      | object           | No         | Same as [variableTiming](#planningData_sessions_items_distribution_stablePeriods_variableTiming ) | VariableTiming    |

###### <a name="planningData_sessions_items_distribution_variablePeriods_timing_stableTiming"></a>3.13.1.9.3.1.1. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > timing > stableTiming`

**Title:** StableTiming

|                        |                                                                                      |
| ---------------------- | ------------------------------------------------------------------------------------ |
| **Type**               | `array of integer`                                                                   |
| **Required**           | No                                                                                   |
| **Same definition as** | [stableTiming](#planningData_sessions_items_distribution_stablePeriods_stableTiming) |

**Description:** It contains the fixed way of allocating time across the days of the period.

###### <a name="planningData_sessions_items_distribution_variablePeriods_timing_variableTiming"></a>3.13.1.9.3.1.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > timing > variableTiming`

**Title:** VariableTiming

|                           |                                                                                          |
| ------------------------- | ---------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                 |
| **Required**              | No                                                                                       |
| **Additional properties** | Not allowed                                                                              |
| **Same definition as**    | [variableTiming](#planningData_sessions_items_distribution_stablePeriods_variableTiming) |

**Description:** It defines the allocating time as a total of time, maximum and minimun range of sections per day.

###### <a name="planningData_sessions_items_distribution_variablePeriods_maximunTimeInPeriod"></a>3.13.1.9.3.2. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > maximunTimeInPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Maximum number of minutes to be allocated in each Period. If not defined, it is considered that there is no maximum limit.

###### <a name="planningData_sessions_items_distribution_variablePeriods_minimnunTimeInPeriod"></a>3.13.1.9.3.3. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > minimnunTimeInPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `0`       |

**Description:** Minimum number of minutes to be allocated in each Period.

###### <a name="planningData_sessions_items_distribution_variablePeriods_maximumTimeframe"></a>3.13.1.9.3.4. Property `GhcEngineSchema > planningData > sessions > Session > distribution > variablePeriods > maximumTimeframe`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Indicates the maximum interval of periods that can be used to assign the session, counting from the first period with a session assignment to the last period with a session assignment. That is, the periods in between are also considered even if they do not have a session assigned.

##### <a name="planningData_sessions_items_sessionClassRooms"></a>3.13.1.10. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms`

**Title:** SessionClassRooms

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** It contains the information about the classrooms for the class units. At least one classroom is required for the class units.

| Property                                                                                     | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                       |
| -------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------------------------------------------------------------------------------- |
| + [classRoomsToAssign](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign )   | No      | array            | No         | -          | ClassRoomsToAssign                                                                                                                      |
| - [capacityPreference](#planningData_sessions_items_sessionClassRooms_capacityPreference )   | No      | enum (of string) | No         | -          | Preference on whether the engine should assess the capacity of the classroom to allocate each class unit.                               |
| - [capacityType](#planningData_sessions_items_sessionClassRooms_capacityType )               | No      | enum (of string) | No         | -          | It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.                  |
| - [alwaysSameClassRoom](#planningData_sessions_items_sessionClassRooms_alwaysSameClassRoom ) | No      | boolean          | No         | -          | Indicates if the session must be always in the same classroom the hole week or it can be given on different classrooms during the week. |

###### <a name="planningData_sessions_items_sessionClassRooms_classRoomsToAssign"></a>3.13.1.10.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign`

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

| Each item of this array must be                                                                 | Description                                                                                                                   |
| ----------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------- |
| [RefClassRoomToAssign](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items) | Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session. |

###### <a name="planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items"></a>3.13.1.10.1.1. GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign

**Title:** RefClassRoomToAssign

|                           |                              |
| ------------------------- | ---------------------------- |
| **Type**                  | `object`                     |
| **Required**              | No                           |
| **Additional properties** | Not allowed                  |
| **Defined in**            | #/$defs/refClassRoomToAssign |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

| Property                                                                                                            | Pattern | Type            | Deprecated | Definition | Title/Description  |
| ------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------ |
| - [classRoom](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom )                   | No      | string          | No         | -          | ClassRoomRef       |
| - [classRoomsSetsList](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList ) | No      | array of string | No         | -          | ClassRoomsSetsList |

###### <a name="planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoom"></a>3.13.1.10.1.1.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoom`

**Title:** ClassRoomRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom identifier.

###### <a name="planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList"></a>3.13.1.10.1.1.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList`

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

| Each item of this array must be                                                                                     | Description               |
| ------------------------------------------------------------------------------------------------------------------- | ------------------------- |
| [ClassRoomSetRef](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items) | Classroom set identifier. |

###### <a name="planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items_classRoomsSetsList_items"></a>3.13.1.10.1.1.2.1. GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > classRoomsToAssign > RefClassRoomToAssign > classRoomsSetsList > ClassRoomSetRef

**Title:** ClassRoomSetRef

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Classroom set identifier.

###### <a name="planningData_sessions_items_sessionClassRooms_capacityPreference"></a>3.13.1.10.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > capacityPreference`

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

###### <a name="planningData_sessions_items_sessionClassRooms_capacityType"></a>3.13.1.10.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > capacityType`

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | No                 |
| **Default**  | `"individual"`     |

**Description:** It indicates whether all students in the class units should fit in each classroom, or in the amount of all classrooms.

Must be one of:
* "individual"
* "collective"

###### <a name="planningData_sessions_items_sessionClassRooms_alwaysSameClassRoom"></a>3.13.1.10.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionClassRooms > alwaysSameClassRoom`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if the session must be always in the same classroom the hole week or it can be given on different classrooms during the week.

##### <a name="planningData_sessions_items_frameTemplate"></a>3.13.1.11. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate`

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

| Each item of this array must be                                              | Description                    |
| ---------------------------------------------------------------------------- | ------------------------------ |
| [SessionSectionPreference](#planningData_sessions_items_frameTemplate_items) | Section assignment preference. |

###### <a name="planningData_sessions_items_frameTemplate_items"></a>3.13.1.11.1. GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference

**Title:** SessionSectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Section assignment preference.

| Property                                                           | Pattern | Type             | Deprecated | Definition | Title/Description                                      |
| ------------------------------------------------------------------ | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------ |
| + [day](#planningData_sessions_items_frameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when the section is located.           |
| + [index](#planningData_sessions_items_frameTemplate_items_index ) | No      | integer          | No         | -          | Index built into the day where the section is located. |
| + [frame](#planningData_sessions_items_frameTemplate_items_frame ) | No      | string           | No         | -          | Frame identifier.                                      |
| + [type](#planningData_sessions_items_frameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeWithPreset                        |

###### <a name="planningData_sessions_items_frameTemplate_items_day"></a>3.13.1.11.1.1. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="planningData_sessions_items_frameTemplate_items_index"></a>3.13.1.11.1.2. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index built into the day where the section is located.

###### <a name="planningData_sessions_items_frameTemplate_items_frame"></a>3.13.1.11.1.3. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame identifier.

###### <a name="planningData_sessions_items_frameTemplate_items_type"></a>3.13.1.11.1.4. Property `GhcEngineSchema > planningData > sessions > Session > frameTemplate > SessionSectionPreference > type`

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

##### <a name="planningData_sessions_items_sessionSettings"></a>3.13.1.12. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings`

**Title:** SessionSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Conditions on the position of the class unit.

| Property                                                                                                                           | Pattern | Type             | Deprecated | Definition                         | Title/Description                                                                                              |
| ---------------------------------------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------------------------------- | -------------------------------------------------------------------------------------------------------------- |
| - [avoidFirstHourSessions](#planningData_sessions_items_sessionSettings_avoidFirstHourSessions )                                   | No      | boolean          | No         | -                                  | It penalises the position of the class units if more than 50% of the class units are at first hour.            |
| - [avoidLastHourSessions](#planningData_sessions_items_sessionSettings_avoidLastHourSessions )                                     | No      | boolean          | No         | -                                  | It penalises the position of the class units if more than 50% of the class units are at last hour.             |
| - [avoidAssingLastHourAndFirstNextDay](#planningData_sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay )           | No      | boolean          | No         | -                                  | It penalises if the last hour and the first hour of the following day match.                                   |
| - [sameHourPreference](#planningData_sessions_items_sessionSettings_sameHourPreference )                                           | No      | enum (of string) | No         | -                                  | Preference over class units that coincide in the same time slot.                                               |
| - [avoidAfternoonSessions](#planningData_sessions_items_sessionSettings_avoidAfternoonSessions )                                   | No      | boolean          | No         | -                                  | It penalises if there is more than one class unit after noon stop..                                            |
| - [avoidAfterBreakSessions](#planningData_sessions_items_sessionSettings_avoidAfterBreakSessions )                                 | No      | boolean          | No         | -                                  | It penalises if more than 50% of the class unit are after the last break of the day.                           |
| - [nonBreakInTheMiddleOfConsecutiveSession](#planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession ) | No      | boolean          | No         | -                                  | Do not allow breaks between consecutive class units (class duration of more than one section).                 |
| - [nonBreakInTheMiddleOfSession](#planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfSession )                       | No      | boolean          | No         | -                                  | Do not allow breaks between class units of multiple duration (class duration of more than one section).        |
| - [followedDaysPreference](#planningData_sessions_items_sessionSettings_followedDaysPreference )                                   | No      | enum (of string) | No         | -                                  | If the class unit has more than one lesson, indicates the preference on assigning them on consecutive days.    |
| - [consecutiveWeeksBorders](#planningData_sessions_items_sessionSettings_consecutiveWeeksBorders )                                 | No      | boolean          | No         | -                                  | It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'. |
| - [samePositionEveryPeriod](#planningData_sessions_items_sessionSettings_samePositionEveryPeriod )                                 | No      | enum (of string) | No         | In #/$defs/samePositionEveryPeriod | SamePositionEveryPeriod                                                                                        |

###### <a name="planningData_sessions_items_sessionSettings_avoidFirstHourSessions"></a>3.13.1.12.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidFirstHourSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises the position of the class units if more than 50% of the class units are at first hour.

###### <a name="planningData_sessions_items_sessionSettings_avoidLastHourSessions"></a>3.13.1.12.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidLastHourSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises the position of the class units if more than 50% of the class units are at last hour.

###### <a name="planningData_sessions_items_sessionSettings_avoidAssingLastHourAndFirstNextDay"></a>3.13.1.12.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidAssingLastHourAndFirstNextDay`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if the last hour and the first hour of the following day match.

###### <a name="planningData_sessions_items_sessionSettings_sameHourPreference"></a>3.13.1.12.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > sameHourPreference`

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

###### <a name="planningData_sessions_items_sessionSettings_avoidAfternoonSessions"></a>3.13.1.12.5. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidAfternoonSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if there is more than one class unit after noon stop..

###### <a name="planningData_sessions_items_sessionSettings_avoidAfterBreakSessions"></a>3.13.1.12.6. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > avoidAfterBreakSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It penalises if more than 50% of the class unit are after the last break of the day.

###### <a name="planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfConsecutiveSession"></a>3.13.1.12.7. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfConsecutiveSession`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** Do not allow breaks between consecutive class units (class duration of more than one section).

###### <a name="planningData_sessions_items_sessionSettings_nonBreakInTheMiddleOfSession"></a>3.13.1.12.8. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > nonBreakInTheMiddleOfSession`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Do not allow breaks between class units of multiple duration (class duration of more than one section).

###### <a name="planningData_sessions_items_sessionSettings_followedDaysPreference"></a>3.13.1.12.9. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > followedDaysPreference`

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

###### <a name="planningData_sessions_items_sessionSettings_consecutiveWeeksBorders"></a>3.13.1.12.10. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > consecutiveWeeksBorders`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It considers the end-of-week day, and the start-of-week day, as consecutive days for 'followedDaysPreference'.

###### <a name="planningData_sessions_items_sessionSettings_samePositionEveryPeriod"></a>3.13.1.12.11. Property `GhcEngineSchema > planningData > sessions > Session > sessionSettings > samePositionEveryPeriod`

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

##### <a name="planningData_sessions_items_sessionRelations"></a>3.13.1.13. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations`

**Title:** SessionRelations

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains information on the relationships between this and other class units. These conditions can only apply to class units with students.

| Property                                                                                          | Pattern | Type             | Deprecated | Definition | Title/Description      |
| ------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ---------------------- |
| - [refSimultaneusGroup](#planningData_sessions_items_sessionRelations_refSimultaneusGroup )       | No      | integer          | No         | -          | RefSimultaneusGroup    |
| - [differentDays](#planningData_sessions_items_sessionRelations_differentDays )                   | No      | object           | No         | -          | DifferentDays          |
| - [consecutiveGroup](#planningData_sessions_items_sessionRelations_consecutiveGroup )             | No      | object           | No         | -          | ConsecutiveGroup       |
| - [nonConsecutiveSessions](#planningData_sessions_items_sessionRelations_nonConsecutiveSessions ) | No      | array of integer | No         | -          | NonConsecutiveSessions |
| - [nonSimultaneus](#planningData_sessions_items_sessionRelations_nonSimultaneus )                 | No      | array of integer | No         | -          | NonSimultaneus         |
| - [previousTo](#planningData_sessions_items_sessionRelations_previousTo )                         | No      | array of integer | No         | -          | PreviousTo             |
| - [afterTo](#planningData_sessions_items_sessionRelations_afterTo )                               | No      | array of integer | No         | -          | AfterTo                |
| - [maximumSeparationTo](#planningData_sessions_items_sessionRelations_maximumSeparationTo )       | No      | array of object  | No         | -          | MaximumSeparationTo    |
| - [minimumSeparationTo](#planningData_sessions_items_sessionRelations_minimumSeparationTo )       | No      | array of object  | No         | -          | MinimumSeparationTo    |

###### <a name="planningData_sessions_items_sessionRelations_refSimultaneusGroup"></a>3.13.1.13.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > refSimultaneusGroup`

**Title:** RefSimultaneusGroup

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Identifier of the group of simultaneous class units of the subject. Indicates that the class units are to be taught at the same time as the group class units. 

###### <a name="planningData_sessions_items_sessionRelations_differentDays"></a>3.13.1.13.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays`

**Title:** DifferentDays

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Conditions on this and another class unit cannot coincide on the same day.

| Property                                                                                  | Pattern | Type             | Deprecated | Definition | Title/Description                                               |
| ----------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | --------------------------------------------------------------- |
| + [refSesions](#planningData_sessions_items_sessionRelations_differentDays_refSesions )   | No      | array of integer | No         | -          | RefSesions                                                      |
| - [daysSetting](#planningData_sessions_items_sessionRelations_differentDays_daysSetting ) | No      | enum (of string) | No         | -          | Keep the same position each week or period for the class units. |

###### <a name="planningData_sessions_items_sessionRelations_differentDays_refSesions"></a>3.13.1.13.2.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays > refSesions`

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

| Each item of this array must be                                                            | Description         |
| ------------------------------------------------------------------------------------------ | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_differentDays_refSesions_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_differentDays_refSesions_items"></a>3.13.1.13.2.1.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays > refSesions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_differentDays_daysSetting"></a>3.13.1.13.2.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > differentDays > daysSetting`

|              |                              |
| ------------ | ---------------------------- |
| **Type**     | `enum (of string)`           |
| **Required** | No                           |
| **Default**  | `"indifferentDaysPreferred"` |

**Description:** Keep the same position each week or period for the class units.

Must be one of:
* "nonConsecutiveDaysPreferred"
* "indifferentDaysPreferred"
* "strictNonConsecutiveDays"
* "strictConsecutiveDays"

###### <a name="planningData_sessions_items_sessionRelations_consecutiveGroup"></a>3.13.1.13.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup`

**Title:** ConsecutiveGroup

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Contains the references of a continuous sessions group.

| Property                                                                                                                 | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                                                          |
| ------------------------------------------------------------------------------------------------------------------------ | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------ |
| + [id](#planningData_sessions_items_sessionRelations_consecutiveGroup_id )                                               | No      | integer          | No         | -          | Continuous sessions group identifier.                                                                                                      |
| + [refSessions](#planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions )                             | No      | array of integer | No         | -          | SessionRefs                                                                                                                                |
| - [order](#planningData_sessions_items_sessionRelations_consecutiveGroup_order )                                         | No      | enum (of string) | No         | -          | Indicates if the sessions must be 'ordered', 'unordered' or 'sameDay'  (it does not matter as long as they are allocated on the same day). |
| - [allowBreakBetweenSessions](#planningData_sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions ) | No      | boolean          | No         | -          | Indicates if break between sessions is allowed to keep the relation.                                                                       |

###### <a name="planningData_sessions_items_sessionRelations_consecutiveGroup_id"></a>3.13.1.13.3.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Continuous sessions group identifier.

###### <a name="planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions"></a>3.13.1.13.3.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions`

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

| Each item of this array must be                                                                | Description         |
| ---------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_consecutiveGroup_refSessions_items"></a>3.13.1.13.3.2.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_consecutiveGroup_order"></a>3.13.1.13.3.3. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > order`

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

###### <a name="planningData_sessions_items_sessionRelations_consecutiveGroup_allowBreakBetweenSessions"></a>3.13.1.13.3.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > consecutiveGroup > allowBreakBetweenSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** Indicates if break between sessions is allowed to keep the relation.

###### <a name="planningData_sessions_items_sessionRelations_nonConsecutiveSessions"></a>3.13.1.13.4. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions`

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

| Each item of this array must be                                                          | Description         |
| ---------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_nonConsecutiveSessions_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_nonConsecutiveSessions_items"></a>3.13.1.13.4.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonConsecutiveSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_nonSimultaneus"></a>3.13.1.13.5. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonSimultaneus`

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

| Each item of this array must be                                                  | Description         |
| -------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_nonSimultaneus_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_nonSimultaneus_items"></a>3.13.1.13.5.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > nonSimultaneus > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_previousTo"></a>3.13.1.13.6. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > previousTo`

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

| Each item of this array must be                                              | Description         |
| ---------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_previousTo_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_previousTo_items"></a>3.13.1.13.6.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > previousTo > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_afterTo"></a>3.13.1.13.7. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > afterTo`

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

| Each item of this array must be                                           | Description         |
| ------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_afterTo_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_afterTo_items"></a>3.13.1.13.7.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > afterTo > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_maximumSeparationTo"></a>3.13.1.13.8. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo`

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

| Each item of this array must be                                                                       | Description                                                                                                           |
| ----------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------- |
| [MaximumSeparationToSession](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items) | It contains the session identifier of the class unit to be taught with a number of days in between, and maximum days. |

###### <a name="planningData_sessions_items_sessionRelations_maximumSeparationTo_items"></a>3.13.1.13.8.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession

**Title:** MaximumSeparationToSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains the session identifier of the class unit to be taught with a number of days in between, and maximum days.

| Property                                                                                              | Pattern | Type             | Deprecated | Definition | Title/Description             |
| ----------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ----------------------------- |
| + [refSessions](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions ) | No      | array of integer | No         | -          | SessionRefs                   |
| + [days](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items_days )               | No      | integer          | No         | -          | Days of separation condition. |

###### <a name="planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions"></a>3.13.1.13.8.1.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions`

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

| Each item of this array must be                                                                         | Description         |
| ------------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_maximumSeparationTo_items_refSessions_items"></a>3.13.1.13.8.1.1.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_maximumSeparationTo_items_days"></a>3.13.1.13.8.1.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > maximumSeparationTo > MaximumSeparationToSession > days`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Days of separation condition.

###### <a name="planningData_sessions_items_sessionRelations_minimumSeparationTo"></a>3.13.1.13.9. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo`

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

| Each item of this array must be                                                                       | Description                                                                                                      |
| ----------------------------------------------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------- |
| [MinimumSeparationToSession](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items) | It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days. |

###### <a name="planningData_sessions_items_sessionRelations_minimumSeparationTo_items"></a>3.13.1.13.9.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession

**Title:** MinimumSeparationToSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains session identifier of the class unit to be taught with a number of days apart, and the minimum days.

| Property                                                                                              | Pattern | Type             | Deprecated | Definition | Title/Description                                                                                       |
| ----------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------- |
| + [refSessions](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions ) | No      | array of integer | No         | -          | SessionRefs                                                                                             |
| + [days](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items_days )               | No      | integer          | No         | -          | Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'. |

###### <a name="planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions"></a>3.13.1.13.9.1.1. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions`

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

| Each item of this array must be                                                                         | Description         |
| ------------------------------------------------------------------------------------------------------- | ------------------- |
| [SessionRef](#planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items) | Session identifier. |

###### <a name="planningData_sessions_items_sessionRelations_minimumSeparationTo_items_refSessions_items"></a>3.13.1.13.9.1.1.1. GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > refSessions > SessionRef

**Title:** SessionRef

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Session identifier.

###### <a name="planningData_sessions_items_sessionRelations_minimumSeparationTo_items_days"></a>3.13.1.13.9.1.2. Property `GhcEngineSchema > planningData > sessions > Session > sessionRelations > minimumSeparationTo > MinimumSeparationToSession > days`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Days of separation condition. If the value is 0 or 1 it is equivalent to the condition 'DifferentDays'.

##### <a name="planningData_sessions_items_department"></a>3.13.1.14. Property `GhcEngineSchema > planningData > sessions > Session > department`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Contains the reference of the department of the session.

### <a name="planningData_meetings"></a>3.14. Property `GhcEngineSchema > planningData > meetings`

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

| Each item of this array must be         | Description                         |
| --------------------------------------- | ----------------------------------- |
| [Meeting](#planningData_meetings_items) | Sevice of meeting between teachers. |

#### <a name="planningData_meetings_items"></a>3.14.1. GhcEngineSchema > planningData > meetings > Meeting

**Title:** Meeting

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Sevice of meeting between teachers.

| Property                                                                     | Pattern | Type            | Deprecated | Definition                                                                                               | Title/Description                                                                                                                                                                                 |
| ---------------------------------------------------------------------------- | ------- | --------------- | ---------- | -------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#planningData_meetings_items_id )                                     | No      | string          | No         | -                                                                                                        | Session identifier.                                                                                                                                                                               |
| + [refFrame](#planningData_meetings_items_refFrame )                         | No      | string          | No         | -                                                                                                        | Session's frame identifier.                                                                                                                                                                       |
| + [refTask](#planningData_meetings_items_refTask )                           | No      | string          | No         | -                                                                                                        | RefTask                                                                                                                                                                                           |
| + [refTeachers](#planningData_meetings_items_refTeachers )                   | No      | array of string | No         | -                                                                                                        | RefTeachers                                                                                                                                                                                       |
| - [refColourInResult](#planningData_meetings_items_refColourInResult )       | No      | string          | No         | -                                                                                                        | Colour code used to represent the meeting in the result.                                                                                                                                          |
| + [distribution](#planningData_meetings_items_distribution )                 | No      | object          | No         | Same as [distribution](#planningData_sessions_items_distribution )                                       | Distribution                                                                                                                                                                                      |
| - [frameTemplate](#planningData_meetings_items_frameTemplate )               | No      | array of object | No         | Same as [frameTemplate](#planningData_sessions_items_frameTemplate )                                     | SessionFrameTemplate                                                                                                                                                                              |
| - [refClassRoomToAssign](#planningData_meetings_items_refClassRoomToAssign ) | No      | object          | No         | Same as [RefClassRoomToAssign](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items ) | RefClassRoomToAssign                                                                                                                                                                              |
| - [refBuilding](#planningData_meetings_items_refBuilding )                   | No      | string          | No         | -                                                                                                        | Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom. |
| - [settings](#planningData_meetings_items_settings )                         | No      | object          | No         | In #/$defs/nonClassSessionSettings                                                                       | NonClassSessionSettings                                                                                                                                                                           |

##### <a name="planningData_meetings_items_id"></a>3.14.1.1. Property `GhcEngineSchema > planningData > meetings > Meeting > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session identifier.

##### <a name="planningData_meetings_items_refFrame"></a>3.14.1.2. Property `GhcEngineSchema > planningData > meetings > Meeting > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

##### <a name="planningData_meetings_items_refTask"></a>3.14.1.3. Property `GhcEngineSchema > planningData > meetings > Meeting > refTask`

**Title:** RefTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

##### <a name="planningData_meetings_items_refTeachers"></a>3.14.1.4. Property `GhcEngineSchema > planningData > meetings > Meeting > refTeachers`

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

| Each item of this array must be                              | Description         |
| ------------------------------------------------------------ | ------------------- |
| [RefTeacher](#planningData_meetings_items_refTeachers_items) | Teacher identifier. |

###### <a name="planningData_meetings_items_refTeachers_items"></a>3.14.1.4.1. GhcEngineSchema > planningData > meetings > Meeting > refTeachers > RefTeacher

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Teacher identifier.

##### <a name="planningData_meetings_items_refColourInResult"></a>3.14.1.5. Property `GhcEngineSchema > planningData > meetings > Meeting > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the meeting in the result.

##### <a name="planningData_meetings_items_distribution"></a>3.14.1.6. Property `GhcEngineSchema > planningData > meetings > Meeting > distribution`

**Title:** Distribution

|                           |                                                           |
| ------------------------- | --------------------------------------------------------- |
| **Type**                  | `object`                                                  |
| **Required**              | Yes                                                       |
| **Additional properties** | Not allowed                                               |
| **Same definition as**    | [distribution](#planningData_sessions_items_distribution) |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

##### <a name="planningData_meetings_items_frameTemplate"></a>3.14.1.7. Property `GhcEngineSchema > planningData > meetings > Meeting > frameTemplate`

**Title:** SessionFrameTemplate

|                        |                                                             |
| ---------------------- | ----------------------------------------------------------- |
| **Type**               | `array of object`                                           |
| **Required**           | No                                                          |
| **Same definition as** | [frameTemplate](#planningData_sessions_items_frameTemplate) |

**Description:** Complete template of preferences.

##### <a name="planningData_meetings_items_refClassRoomToAssign"></a>3.14.1.8. Property `GhcEngineSchema > planningData > meetings > Meeting > refClassRoomToAssign`

**Title:** RefClassRoomToAssign

|                           |                                                                                                 |
| ------------------------- | ----------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                        |
| **Required**              | No                                                                                              |
| **Additional properties** | Not allowed                                                                                     |
| **Same definition as**    | [RefClassRoomToAssign](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items) |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

##### <a name="planningData_meetings_items_refBuilding"></a>3.14.1.9. Property `GhcEngineSchema > planningData > meetings > Meeting > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

##### <a name="planningData_meetings_items_settings"></a>3.14.1.10. Property `GhcEngineSchema > planningData > meetings > Meeting > settings`

**Title:** NonClassSessionSettings

|                           |                                 |
| ------------------------- | ------------------------------- |
| **Type**                  | `object`                        |
| **Required**              | No                              |
| **Additional properties** | Not allowed                     |
| **Defined in**            | #/$defs/nonClassSessionSettings |

**Description:** Settings of the meeting.

| Property                                                                                        | Pattern | Type             | Deprecated | Definition                                                                                               | Title/Description                                                                                                                                           |
| ----------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | -------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [computeForMaxMinOccupancy](#planningData_meetings_items_settings_computeForMaxMinOccupancy ) | No      | boolean          | No         | -                                                                                                        |  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students. |
| - [samePositionEveryPeriod](#planningData_meetings_items_settings_samePositionEveryPeriod )     | No      | enum (of string) | No         | Same as [samePositionEveryPeriod](#planningData_sessions_items_sessionSettings_samePositionEveryPeriod ) | SamePositionEveryPeriod                                                                                                                                     |

###### <a name="planningData_meetings_items_settings_computeForMaxMinOccupancy"></a>3.14.1.10.1. Property `GhcEngineSchema > planningData > meetings > Meeting > settings > computeForMaxMinOccupancy`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:**  It indicates whether the class unit counts for the maximum and minimum daily teacher occupancy. By default, the engine computes class units with students.

###### <a name="planningData_meetings_items_settings_samePositionEveryPeriod"></a>3.14.1.10.2. Property `GhcEngineSchema > planningData > meetings > Meeting > settings > samePositionEveryPeriod`

**Title:** SamePositionEveryPeriod

|                        |                                                                                                 |
| ---------------------- | ----------------------------------------------------------------------------------------------- |
| **Type**               | `enum (of string)`                                                                              |
| **Required**           | No                                                                                              |
| **Default**            | `"ignore"`                                                                                      |
| **Same definition as** | [samePositionEveryPeriod](#planningData_sessions_items_sessionSettings_samePositionEveryPeriod) |

**Description:** Keep the same position every week or period for the class units.

### <a name="planningData_complementaryActivities"></a>3.15. Property `GhcEngineSchema > planningData > complementaryActivities`

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

| Each item of this array must be                              | Description                                  |
| ------------------------------------------------------------ | -------------------------------------------- |
| [Complementary](#planningData_complementaryActivities_items) | Service of teacher's complementary activity. |

#### <a name="planningData_complementaryActivities_items"></a>3.15.1. GhcEngineSchema > planningData > complementaryActivities > Complementary

**Title:** Complementary

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Service of teacher`s complementary activity.

| Property                                                                                    | Pattern | Type            | Deprecated | Definition                                                                                               | Title/Description                                                                                                                                                                                 |
| ------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | -------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#planningData_complementaryActivities_items_id )                                     | No      | integer         | No         | -                                                                                                        | Session identifier.                                                                                                                                                                               |
| + [refFrame](#planningData_complementaryActivities_items_refFrame )                         | No      | string          | No         | -                                                                                                        | Session's frame identifier.                                                                                                                                                                       |
| + [refTask](#planningData_complementaryActivities_items_refTask )                           | No      | string          | No         | -                                                                                                        | RefTask                                                                                                                                                                                           |
| + [refTeacher](#planningData_complementaryActivities_items_refTeacher )                     | No      | string          | No         | -                                                                                                        | RefTeacher                                                                                                                                                                                        |
| - [refColourInResult](#planningData_complementaryActivities_items_refColourInResult )       | No      | string          | No         | -                                                                                                        | Colour code used to represent the complementary activity in the result.                                                                                                                           |
| + [distribution](#planningData_complementaryActivities_items_distribution )                 | No      | object          | No         | Same as [distribution](#planningData_sessions_items_distribution )                                       | Distribution                                                                                                                                                                                      |
| - [frameTemplate](#planningData_complementaryActivities_items_frameTemplate )               | No      | array of object | No         | Same as [frameTemplate](#planningData_sessions_items_frameTemplate )                                     | SessionFrameTemplate                                                                                                                                                                              |
| - [refClassRoomToAssign](#planningData_complementaryActivities_items_refClassRoomToAssign ) | No      | object          | No         | Same as [RefClassRoomToAssign](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items ) | RefClassRoomToAssign                                                                                                                                                                              |
| - [refBuilding](#planningData_complementaryActivities_items_refBuilding )                   | No      | string          | No         | -                                                                                                        | Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom. |
| - [settings](#planningData_complementaryActivities_items_settings )                         | No      | object          | No         | Same as [settings](#planningData_meetings_items_settings )                                               | NonClassSessionSettings                                                                                                                                                                           |

##### <a name="planningData_complementaryActivities_items_id"></a>3.15.1.1. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > id`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Session identifier.

##### <a name="planningData_complementaryActivities_items_refFrame"></a>3.15.1.2. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Session's frame identifier.

##### <a name="planningData_complementaryActivities_items_refTask"></a>3.15.1.3. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refTask`

**Title:** RefTask

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

##### <a name="planningData_complementaryActivities_items_refTeacher"></a>3.15.1.4. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refTeacher`

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher identifier.

##### <a name="planningData_complementaryActivities_items_refColourInResult"></a>3.15.1.5. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the complementary activity in the result.

##### <a name="planningData_complementaryActivities_items_distribution"></a>3.15.1.6. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > distribution`

**Title:** Distribution

|                           |                                                           |
| ------------------------- | --------------------------------------------------------- |
| **Type**                  | `object`                                                  |
| **Required**              | Yes                                                       |
| **Additional properties** | Not allowed                                               |
| **Same definition as**    | [distribution](#planningData_sessions_items_distribution) |

**Description:** It contains information on how the class units of the session are distributed throughout the week. It must contain only one element between 'stablePeriods' and 'variablePeriods'.

##### <a name="planningData_complementaryActivities_items_frameTemplate"></a>3.15.1.7. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > frameTemplate`

**Title:** SessionFrameTemplate

|                        |                                                             |
| ---------------------- | ----------------------------------------------------------- |
| **Type**               | `array of object`                                           |
| **Required**           | No                                                          |
| **Same definition as** | [frameTemplate](#planningData_sessions_items_frameTemplate) |

**Description:** Complete template of preferences.

##### <a name="planningData_complementaryActivities_items_refClassRoomToAssign"></a>3.15.1.8. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refClassRoomToAssign`

**Title:** RefClassRoomToAssign

|                           |                                                                                                 |
| ------------------------- | ----------------------------------------------------------------------------------------------- |
| **Type**                  | `object`                                                                                        |
| **Required**              | No                                                                                              |
| **Additional properties** | Not allowed                                                                                     |
| **Same definition as**    | [RefClassRoomToAssign](#planningData_sessions_items_sessionClassRooms_classRoomsToAssign_items) |

**Description:** Object, with classrooms and/or set of classrooms, where the engine should assign classroom to each class unit of the session.

##### <a name="planningData_complementaryActivities_items_refBuilding"></a>3.15.1.9. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Building identifier of the building where the class unit takes place. This is used to know the moving time and the number of moves between buildings for teachers without specifying a classroom.

##### <a name="planningData_complementaryActivities_items_settings"></a>3.15.1.10. Property `GhcEngineSchema > planningData > complementaryActivities > Complementary > settings`

**Title:** NonClassSessionSettings

|                           |                                                   |
| ------------------------- | ------------------------------------------------- |
| **Type**                  | `object`                                          |
| **Required**              | No                                                |
| **Additional properties** | Not allowed                                       |
| **Same definition as**    | [settings](#planningData_meetings_items_settings) |

**Description:** Settings of the meeting.

### <a name="planningData_onCallServices"></a>3.16. Property `GhcEngineSchema > planningData > onCallServices`

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

| Each item of this array must be                     | Description                                                          |
| --------------------------------------------------- | -------------------------------------------------------------------- |
| [OnCallService](#planningData_onCallServices_items) | On-call service of teachers who supervise the free time of students. |

#### <a name="planningData_onCallServices_items"></a>3.16.1. GhcEngineSchema > planningData > onCallServices > OnCallService

**Title:** OnCallService

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** On-call service of teachers who supervise the free time of students.

| Property                                                                         | Pattern | Type            | Deprecated | Definition                                                                                                 | Title/Description                                                                                                                                         |
| -------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------------------------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------- |
| + [id](#planningData_onCallServices_items_id )                                   | No      | string          | No         | -                                                                                                          | On-Call service identifier.                                                                                                                               |
| + [refFrame](#planningData_onCallServices_items_refFrame )                       | No      | string          | No         | -                                                                                                          | Identifier of the frame where the service will be set.                                                                                                    |
| - [refPeriods](#planningData_onCallServices_items_refPeriods )                   | No      | array of string | No         | -                                                                                                          | RefPeriods                                                                                                                                                |
| + [refTask](#planningData_onCallServices_items_refTask )                         | No      | string          | No         | -                                                                                                          | Task identifier.                                                                                                                                          |
| - [inBreak](#planningData_onCallServices_items_inBreak )                         | No      | boolean         | No         | -                                                                                                          | It indicates whether it is a break supervision.                                                                                                           |
| + [teachersEachSection](#planningData_onCallServices_items_teachersEachSection ) | No      | object          | No         | -                                                                                                          | TeachersEachSection                                                                                                                                       |
| + [refTeachers](#planningData_onCallServices_items_refTeachers )                 | No      | array of object | No         | -                                                                                                          | RefTeachersOnCall                                                                                                                                         |
| - [refColourInResult](#planningData_onCallServices_items_refColourInResult )     | No      | string          | No         | -                                                                                                          | Colour code used to represent the on-call service in the result.                                                                                          |
| - [frameTemplate](#planningData_onCallServices_items_frameTemplate )             | No      | array of object | No         | Same as [teacherFrameTemplate](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate ) | OnCallTemplate                                                                                                                                            |
| - [refBuilding](#planningData_onCallServices_items_refBuilding )                 | No      | string          | No         | -                                                                                                          | Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers. |
| - [settings](#planningData_onCallServices_items_settings )                       | No      | object          | No         | Same as [settings](#planningData_meetings_items_settings )                                                 | NonClassSessionSettings                                                                                                                                   |

##### <a name="planningData_onCallServices_items_id"></a>3.16.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > id`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** On-Call service identifier.

##### <a name="planningData_onCallServices_items_refFrame"></a>3.16.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the frame where the service will be set.

##### <a name="planningData_onCallServices_items_refPeriods"></a>3.16.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refPeriods`

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

| Each item of this array must be                                  | Description        |
| ---------------------------------------------------------------- | ------------------ |
| [RefPeriod](#planningData_onCallServices_items_refPeriods_items) | Period identifier. |

###### <a name="planningData_onCallServices_items_refPeriods_items"></a>3.16.1.3.1. GhcEngineSchema > planningData > onCallServices > OnCallService > refPeriods > RefPeriod

**Title:** RefPeriod

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Period identifier.

##### <a name="planningData_onCallServices_items_refTask"></a>3.16.1.4. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTask`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Task identifier.

##### <a name="planningData_onCallServices_items_inBreak"></a>3.16.1.5. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > inBreak`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `false`   |

**Description:** It indicates whether it is a break supervision.

##### <a name="planningData_onCallServices_items_teachersEachSection"></a>3.16.1.6. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection`

**Title:** TeachersEachSection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Information about number of teacher in all sections.

| Property                                                                         | Pattern | Type            | Deprecated | Definition | Title/Description                                    |
| -------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ---------------------------------------------------- |
| - [byDefault](#planningData_onCallServices_items_teachersEachSection_byDefault ) | No      | integer         | No         | -          | Default value for number of teacher in all sections. |
| - [bySection](#planningData_onCallServices_items_teachersEachSection_bySection ) | No      | array of object | No         | -          | TeachersBySections                                   |

###### <a name="planningData_onCallServices_items_teachersEachSection_byDefault"></a>3.16.1.6.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > byDefault`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |

**Description:** Default value for number of teacher in all sections.

###### <a name="planningData_onCallServices_items_teachersEachSection_bySection"></a>3.16.1.6.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection`

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

| Each item of this array must be                                                             | Description                                         |
| ------------------------------------------------------------------------------------------- | --------------------------------------------------- |
| [TeachersBySection](#planningData_onCallServices_items_teachersEachSection_bySection_items) | Custom number of teachers in one timetable section. |

###### <a name="planningData_onCallServices_items_teachersEachSection_bySection_items"></a>3.16.1.6.2.1. GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection

**Title:** TeachersBySection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Custom number of teachers in one timetable section.

| Property                                                                                             | Pattern | Type    | Deprecated | Definition | Title/Description                                        |
| ---------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | -------------------------------------------------------- |
| + [day](#planningData_onCallServices_items_teachersEachSection_bySection_items_day )                 | No      | integer | No         | -          | Day of the week.                                         |
| + [index](#planningData_onCallServices_items_teachersEachSection_bySection_items_index )             | No      | integer | No         | -          | Index of the section.                                    |
| + [numTeachers](#planningData_onCallServices_items_teachersEachSection_bySection_items_numTeachers ) | No      | integer | No         | -          | Custom number of teachers to be assigned in the section. |

###### <a name="planningData_onCallServices_items_teachersEachSection_bySection_items_day"></a>3.16.1.6.2.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week.

###### <a name="planningData_onCallServices_items_teachersEachSection_bySection_items_index"></a>3.16.1.6.2.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index of the section.

###### <a name="planningData_onCallServices_items_teachersEachSection_bySection_items_numTeachers"></a>3.16.1.6.2.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > teachersEachSection > bySection > TeachersBySection > numTeachers`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Custom number of teachers to be assigned in the section.

##### <a name="planningData_onCallServices_items_refTeachers"></a>3.16.1.7. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers`

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

| Each item of this array must be                                    | Description                                                           |
| ------------------------------------------------------------------ | --------------------------------------------------------------------- |
| [RefTeacher](#planningData_onCallServices_items_refTeachers_items) | It contains a teacher reference and the number of section oversight . |

###### <a name="planningData_onCallServices_items_refTeachers_items"></a>3.16.1.7.1. GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher

**Title:** RefTeacher

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains a teacher reference and the number of section oversight .

| Property                                                                                             | Pattern | Type            | Deprecated | Definition                            | Title/Description                                            |
| ---------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------- | ------------------------------------------------------------ |
| + [teacherId](#planningData_onCallServices_items_refTeachers_items_teacherId )                       | No      | string          | No         | -                                     | Teacher identifier.                                          |
| - [numOfSections](#planningData_onCallServices_items_refTeachers_items_numOfSections )               | No      | integer         | No         | -                                     | Number of on-call services to be done weekly by the teacher. |
| - [teacherFrameTemplate](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate ) | No      | array of object | No         | In #/$defs/onCallServiceframeTemplate | OnCallTemplate                                               |

###### <a name="planningData_onCallServices_items_refTeachers_items_teacherId"></a>3.16.1.7.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherId`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher identifier.

###### <a name="planningData_onCallServices_items_refTeachers_items_numOfSections"></a>3.16.1.7.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > numOfSections`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** Number of on-call services to be done weekly by the teacher.

###### <a name="planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate"></a>3.16.1.7.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate`

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

| Each item of this array must be                                                                            | Description                                                              |
| ---------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------ |
| [OnCallSectionPreference](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items) | Template with a teacher section assignment preference about the service. |

###### <a name="planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items"></a>3.16.1.7.1.3.1. GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference

**Title:** OnCallSectionPreference

|                           |                  |
| ------------------------- | ---------------- |
| **Type**                  | `object`         |
| **Required**              | No               |
| **Additional properties** | Any type allowed |

**Description:** Template with a teacher section assignment preference about the service.

| Property                                                                                          | Pattern | Type             | Deprecated | Definition | Title/Description                                  |
| ------------------------------------------------------------------------------------------------- | ------- | ---------------- | ---------- | ---------- | -------------------------------------------------- |
| + [day](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day )     | No      | integer          | No         | -          | Day of the week when is located the section.       |
| + [index](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index ) | No      | integer          | No         | -          | Index inside the day where is located the section. |
| + [frame](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame ) | No      | string           | No         | -          | Identifier name of the frame.                      |
| + [type](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type )   | No      | enum (of string) | No         | -          | SectionPreferenceTypeBannedPreset                  |

###### <a name="planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_day"></a>3.16.1.7.1.3.1.1. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when is located the section.

###### <a name="planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_index"></a>3.16.1.7.1.3.1.2. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > index`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Index inside the day where is located the section.

###### <a name="planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_frame"></a>3.16.1.7.1.3.1.3. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > frame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier name of the frame.

###### <a name="planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate_items_type"></a>3.16.1.7.1.3.1.4. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refTeachers > RefTeacher > teacherFrameTemplate > OnCallSectionPreference > type`

**Title:** SectionPreferenceTypeBannedPreset

|              |                    |
| ------------ | ------------------ |
| **Type**     | `enum (of string)` |
| **Required** | Yes                |

**Description:** Teacher availability to be assigned to the section.

Must be one of:
* "banned"
* "preset"

##### <a name="planningData_onCallServices_items_refColourInResult"></a>3.16.1.8. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refColourInResult`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Colour code used to represent the on-call service in the result.

##### <a name="planningData_onCallServices_items_frameTemplate"></a>3.16.1.9. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > frameTemplate`

**Title:** OnCallTemplate

|                        |                                                                                                   |
| ---------------------- | ------------------------------------------------------------------------------------------------- |
| **Type**               | `array of object`                                                                                 |
| **Required**           | No                                                                                                |
| **Same definition as** | [teacherFrameTemplate](#planningData_onCallServices_items_refTeachers_items_teacherFrameTemplate) |

**Description:** Template with teacher's preferences in the on-call service.

##### <a name="planningData_onCallServices_items_refBuilding"></a>3.16.1.10. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > refBuilding`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the building where the service is located. It is used to know the transfer time and the number of transfers between buildings for teachers.

##### <a name="planningData_onCallServices_items_settings"></a>3.16.1.11. Property `GhcEngineSchema > planningData > onCallServices > OnCallService > settings`

**Title:** NonClassSessionSettings

|                           |                                                   |
| ------------------------- | ------------------------------------------------- |
| **Type**                  | `object`                                          |
| **Required**              | No                                                |
| **Additional properties** | Not allowed                                       |
| **Same definition as**    | [settings](#planningData_meetings_items_settings) |

**Description:** Settings of the meeting.

### <a name="planningData_optimizationWeights"></a>3.17. Property `GhcEngineSchema > planningData > optimizationWeights`

**Title:** OptimizationWeights

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** This indicates the weights that the weighting options will have for the engine optimisation process. The engine shall apply default values for elements that have not been specified.

| Property                                                                            | Pattern | Type   | Deprecated | Definition | Title/Description                 |
| ----------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | --------------------------------- |
| - [timetableGaps](#planningData_optimizationWeights_timetableGaps )                 | No      | object | No         | -          | TimetableGaps                     |
| - [nonPreferredPositions](#planningData_optimizationWeights_nonPreferredPositions ) | No      | object | No         | -          | NonPreferredPositionsOptimization |
| - [sessions](#planningData_optimizationWeights_sessions )                           | No      | object | No         | -          | SessionsOptimization              |
| - [teachers](#planningData_optimizationWeights_teachers )                           | No      | object | No         | -          | TeachersOptimization              |

#### <a name="planningData_optimizationWeights_timetableGaps"></a>3.17.1. Property `GhcEngineSchema > planningData > optimizationWeights > timetableGaps`

**Title:** TimetableGaps

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to timetable-gaps weights.

| Property                                                                      | Pattern | Type    | Deprecated | Definition | Title/Description                                                                  |
| ----------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------- |
| - [groupGaps](#planningData_optimizationWeights_timetableGaps_groupGaps )     | No      | integer | No         | -          | It indicates the weight given to the fact of leaving gaps in groups' timetables.   |
| - [teacherGaps](#planningData_optimizationWeights_timetableGaps_teacherGaps ) | No      | integer | No         | -          | It indicates the weight given to the fact of leaving gaps in teachers' timetables. |

##### <a name="planningData_optimizationWeights_timetableGaps_groupGaps"></a>3.17.1.1. Property `GhcEngineSchema > planningData > optimizationWeights > timetableGaps > groupGaps`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `5`       |

**Description:** It indicates the weight given to the fact of leaving gaps in groups' timetables.

##### <a name="planningData_optimizationWeights_timetableGaps_teacherGaps"></a>3.17.1.2. Property `GhcEngineSchema > planningData > optimizationWeights > timetableGaps > teacherGaps`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight given to the fact of leaving gaps in teachers' timetables.

#### <a name="planningData_optimizationWeights_nonPreferredPositions"></a>3.17.2. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions`

**Title:** NonPreferredPositionsOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to allocation in non-preferred sections.

| Property                                                                                          | Pattern | Type    | Deprecated | Definition | Title/Description                                                                          |
| ------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------ |
| - [inGroups](#planningData_optimizationWeights_nonPreferredPositions_inGroups )                   | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a group.             |
| - [inTeachers](#planningData_optimizationWeights_nonPreferredPositions_inTeachers )               | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a teacher.           |
| - [inSubjectsAndTask](#planningData_optimizationWeights_nonPreferredPositions_inSubjectsAndTask ) | No      | integer | No         | -          | It indicates the weight to be placed in a non-preferential section of a subject or a task. |
| - [inSessions](#planningData_optimizationWeights_nonPreferredPositions_inSessions )               | No      | integer | No         | -          | Indicates the weight to be placed in a non-preferential section of a session.              |

##### <a name="planningData_optimizationWeights_nonPreferredPositions_inGroups"></a>3.17.2.1. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inGroups`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `4`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a group.

##### <a name="planningData_optimizationWeights_nonPreferredPositions_inTeachers"></a>3.17.2.2. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inTeachers`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a teacher.

##### <a name="planningData_optimizationWeights_nonPreferredPositions_inSubjectsAndTask"></a>3.17.2.3. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inSubjectsAndTask`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight to be placed in a non-preferential section of a subject or a task.

##### <a name="planningData_optimizationWeights_nonPreferredPositions_inSessions"></a>3.17.2.4. Property `GhcEngineSchema > planningData > optimizationWeights > nonPreferredPositions > inSessions`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** Indicates the weight to be placed in a non-preferential section of a session.

#### <a name="planningData_optimizationWeights_sessions"></a>3.17.3. Property `GhcEngineSchema > planningData > optimizationWeights > sessions`

**Title:** SessionsOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to optimisable conditions for sessions.

| Property                                                                                                   | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                          |
| ---------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [nonPreferredClassRoom](#planningData_optimizationWeights_sessions_nonPreferredClassRoom )               | No      | integer | No         | -          | It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.                                                   |
| - [samePositionEveryPeriod](#planningData_optimizationWeights_sessions_samePositionEveryPeriod )           | No      | integer | No         | -          | It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).                                                                                                 |
| - [consecutiveDays](#planningData_optimizationWeights_sessions_consecutiveDays )                           | No      | integer | No         | -          | It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.                                                                  |
| - [bordersTimetable](#planningData_optimizationWeights_sessions_bordersTimetable )                         | No      | integer | No         | -          | It indicates the weight of the class units assigned at the ends of the timetable.                                                                                                                                                                          |
| - [afternoonOrAfterBreakClasses](#planningData_optimizationWeights_sessions_afternoonOrAfterBreakClasses ) | No      | integer | No         | -          | It indicates the weight of the penalty of having class units after the last break or in the afternoon.                                                                                                                                                     |
| - [sameHourSessionClasses](#planningData_optimizationWeights_sessions_sameHourSessionClasses )             | No      | integer | No         | -          | It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.                                                                                                                                               |
| - [classRoomsChanges](#planningData_optimizationWeights_sessions_classRoomsChanges )                       | No      | integer | No         | -          | It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break. |

##### <a name="planningData_optimizationWeights_sessions_nonPreferredClassRoom"></a>3.17.3.1. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > nonPreferredClassRoom`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight if the class units are configured with a preferred classroom and with a set of alternative classrooms, the weight placed in one of the alternative classrooms will be penalised.

##### <a name="planningData_optimizationWeights_sessions_samePositionEveryPeriod"></a>3.17.3.2. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > samePositionEveryPeriod`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of placing the entities of a class unit belonging to several periods in the same positions or not (also affects on-call services).

##### <a name="planningData_optimizationWeights_sessions_consecutiveDays"></a>3.17.3.3. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > consecutiveDays`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the condition that has been set in each case on the properties of each class unit to place two or three class units, that is, all of them on consecutive days.

##### <a name="planningData_optimizationWeights_sessions_bordersTimetable"></a>3.17.3.4. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > bordersTimetable`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of the class units assigned at the ends of the timetable.

##### <a name="planningData_optimizationWeights_sessions_afternoonOrAfterBreakClasses"></a>3.17.3.5. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > afternoonOrAfterBreakClasses`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the penalty of having class units after the last break or in the afternoon.

##### <a name="planningData_optimizationWeights_sessions_sameHourSessionClasses"></a>3.17.3.6. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > sameHourSessionClasses`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the penalty for not complying with the preference allocation on consecutive days.

##### <a name="planningData_optimizationWeights_sessions_classRoomsChanges"></a>3.17.3.7. Property `GhcEngineSchema > planningData > optimizationWeights > sessions > classRoomsChanges`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of all class units of each subject not taught in the same classroom, and also to avoid classroom changes of groups. This means a change of classrooms of a group only between consecutive intervals, not those divided by a break.

#### <a name="planningData_optimizationWeights_teachers"></a>3.17.4. Property `GhcEngineSchema > planningData > optimizationWeights > teachers`

**Title:** TeachersOptimization

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** It contains options related to optimisable conditions for teachers.

| Property                                                                                                 | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                               |
| -------------------------------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| - [teacherIncompatibities](#planningData_optimizationWeights_teachers_teacherIncompatibities )           | No      | integer | No         | -          | It indicates the weight of the teacher's incompatibilities that can be optimised.                                                                                               |
| - [uniformDailyDistribution](#planningData_optimizationWeights_teachers_uniformDailyDistribution )       | No      | integer | No         | -          | It indicates the weight of placing a teacher's class units in a non-uniform way during the week.                                                                                |
| - [excessContinuousTeaching](#planningData_optimizationWeights_teachers_excessContinuousTeaching )       | No      | integer | No         | -          | It indicates the weight of placing more continuous class units than those declared in the settings.                                                                             |
| - [excessPermanence](#planningData_optimizationWeights_teachers_excessPermanence )                       | No      | integer | No         | -          | It indicates the weight of assigning more daily or weekly stay than the declared in the settings.                                                                               |
| - [continuousSessionsWithGroup](#planningData_optimizationWeights_teachers_continuousSessionsWithGroup ) | No      | integer | No         | -          | It indicates the weight of having consecutive class units taught to the same group.                                                                                             |
| - [onCallSectionsOnBorders](#planningData_optimizationWeights_teachers_onCallSectionsOnBorders )         | No      | integer | No         | -          | It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units. |
| - [teacherOrder](#planningData_optimizationWeights_teachers_teacherOrder )                               | No      | integer | No         | -          | It indicates the weight of the teacher order not being assigned with a preference besides other teachers.                                                                       |

##### <a name="planningData_optimizationWeights_teachers_teacherIncompatibities"></a>3.17.4.1. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > teacherIncompatibities`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of the teacher's incompatibilities that can be optimised.

##### <a name="planningData_optimizationWeights_teachers_uniformDailyDistribution"></a>3.17.4.2. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > uniformDailyDistribution`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `3`       |

**Description:** It indicates the weight of placing a teacher's class units in a non-uniform way during the week.

##### <a name="planningData_optimizationWeights_teachers_excessContinuousTeaching"></a>3.17.4.3. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > excessContinuousTeaching`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of placing more continuous class units than those declared in the settings.

##### <a name="planningData_optimizationWeights_teachers_excessPermanence"></a>3.17.4.4. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > excessPermanence`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `2`       |

**Description:** It indicates the weight of assigning more daily or weekly stay than the declared in the settings.

##### <a name="planningData_optimizationWeights_teachers_continuousSessionsWithGroup"></a>3.17.4.5. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > continuousSessionsWithGroup`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of having consecutive class units taught to the same group.

##### <a name="planningData_optimizationWeights_teachers_onCallSectionsOnBorders"></a>3.17.4.6. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > onCallSectionsOnBorders`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of the teacher being assigned an on-call hour within the limits of his or her timetable, thus trying to fit it into the gaps in his or her class units.

##### <a name="planningData_optimizationWeights_teachers_teacherOrder"></a>3.17.4.7. Property `GhcEngineSchema > planningData > optimizationWeights > teachers > teacherOrder`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | No        |
| **Default**  | `1`       |

**Description:** It indicates the weight of the teacher order not being assigned with a preference besides other teachers.

### <a name="planningData_engineSettings"></a>3.18. Property `GhcEngineSchema > planningData > engineSettings`

**Title:** EngineSettings

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Customised engine configuration parameters.

| Property                                                                       | Pattern | Type    | Deprecated | Definition | Title/Description                                                                                                                                                                                                                                            |
| ------------------------------------------------------------------------------ | ------- | ------- | ---------- | ---------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| - [teacherBalance](#planningData_engineSettings_teacherBalance )               | No      | boolean | No         | -          | It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.                                                                                                               |
| - [countGapsAroundMidday](#planningData_engineSettings_countGapsAroundMidday ) | No      | boolean | No         | -          | It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable. |

#### <a name="planningData_engineSettings_teacherBalance"></a>3.18.1. Property `GhcEngineSchema > planningData > engineSettings > teacherBalance`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates whether the optimiser should balance the timetables of different teachers, to avoid very bad timetables for a particular teacher.

#### <a name="planningData_engineSettings_countGapsAroundMidday"></a>3.18.2. Property `GhcEngineSchema > planningData > engineSettings > countGapsAroundMidday`

|              |           |
| ------------ | --------- |
| **Type**     | `boolean` |
| **Required** | No        |
| **Default**  | `true`    |

**Description:** It indicates, in the case of a split day (with a noon pause), that the unoccupied intervals between the morning and afternoon class units should be counted. This option affects the weighting in the teacher's optimisation of the gaps in their timetable.

## <a name="results"></a>4. Property `GhcEngineSchema > results`

**Title:** EngineResults

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

| Each item of this array must be | Description                           |
| ------------------------------- | ------------------------------------- |
| [EngineResult](#results_items)  | GHC engine result from specification. |

### <a name="results_items"></a>4.1. GhcEngineSchema > results > EngineResult

**Title:** EngineResult

|                           |                                       |
| ------------------------- | ------------------------------------- |
| **Type**                  | `object`                              |
| **Required**              | No                                    |
| **Additional properties** | Not allowed                           |
| **Defined in**            | ../common/ghcEngineOutput.schema.json |

**Description:** GHC engine result from specification.

| Property                                 | Pattern | Type    | Deprecated | Definition | Title/Description      |
| ---------------------------------------- | ------- | ------- | ---------- | ---------- | ---------------------- |
| - [date](#results_items_date )           | No      | string  | No         | -          | JsonGenerationDate     |
| + [weight](#results_items_weight )       | No      | integer | No         | -          | ResultWeight           |
| + [timetable](#results_items_timetable ) | No      | object  | No         | -          | GeneratedJsonTimetable |

#### <a name="results_items_date"></a>4.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > date`

**Title:** JsonGenerationDate

|              |             |
| ------------ | ----------- |
| **Type**     | `string`    |
| **Required** | No          |
| **Format**   | `date-time` |

**Description:** Date of result creation.

#### <a name="results_items_weight"></a>4.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > weight`

**Title:** ResultWeight

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Weight of the result according to the non-mandatory conditions not fulfilled.

#### <a name="results_items_timetable"></a>4.1.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable`

**Title:** GeneratedJsonTimetable

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Object with timetable specification resolved.

| Property                                                               | Pattern | Type            | Deprecated | Definition | Title/Description        |
| ---------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------ |
| - [anonymousClassRooms](#results_items_timetable_anonymousClassRooms ) | No      | array of object | No         | -          | SetOfAnonymousClassRooms |
| + [assignedSections](#results_items_timetable_assignedSections )       | No      | array of object | No         | -          | AssignedSections         |

##### <a name="results_items_timetable_anonymousClassRooms"></a>4.1.3.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms`

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

| Each item of this array must be                                          | Description                                                      |
| ------------------------------------------------------------------------ | ---------------------------------------------------------------- |
| [AnonymousClassRoom](#results_items_timetable_anonymousClassRooms_items) | Object with anonymous classrooms created in a set of classrooms. |

###### <a name="results_items_timetable_anonymousClassRooms_items"></a>4.1.3.1.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom

**Title:** AnonymousClassRoom

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Object with anonymous classrooms created in a set of classrooms.

| Property                                                                                     | Pattern | Type            | Deprecated | Definition | Title/Description                   |
| -------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ----------------------------------- |
| + [refClassRoomsSet](#results_items_timetable_anonymousClassRooms_items_refClassRoomsSet )   | No      | string          | No         | -          | Identifier of the ClassRooms group. |
| + [classRoomsCreated](#results_items_timetable_anonymousClassRooms_items_classRoomsCreated ) | No      | array of string | No         | -          | ListOfAnonymousRooms                |

###### <a name="results_items_timetable_anonymousClassRooms_items_refClassRoomsSet"></a>4.1.3.1.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > refClassRoomsSet`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the ClassRooms group.

###### <a name="results_items_timetable_anonymousClassRooms_items_classRoomsCreated"></a>4.1.3.1.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated`

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

| Each item of this array must be                                                             | Description                            |
| ------------------------------------------------------------------------------------------- | -------------------------------------- |
| [AnonymousRoom](#results_items_timetable_anonymousClassRooms_items_classRoomsCreated_items) | Identifier of the anonymous classroom. |

###### <a name="results_items_timetable_anonymousClassRooms_items_classRoomsCreated_items"></a>4.1.3.1.1.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > anonymousClassRooms > AnonymousClassRoom > classRoomsCreated > AnonymousRoom

**Title:** AnonymousRoom

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the anonymous classroom.

##### <a name="results_items_timetable_assignedSections"></a>4.1.3.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections`

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

| Each item of this array must be                                    | Description                                               |
| ------------------------------------------------------------------ | --------------------------------------------------------- |
| [AssignedSection](#results_items_timetable_assignedSections_items) | Section with one class units (or on call hours) assigned. |

###### <a name="results_items_timetable_assignedSections_items"></a>4.1.3.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection

**Title:** AssignedSection

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Section with one class units (or on call hours) assigned.

| Property                                                                            | Pattern | Type    | Deprecated | Definition | Title/Description                                                             |
| ----------------------------------------------------------------------------------- | ------- | ------- | ---------- | ---------- | ----------------------------------------------------------------------------- |
| + [refFrame](#results_items_timetable_assignedSections_items_refFrame )             | No      | string  | No         | -          | Frame timetable section with assignment.                                      |
| + [day](#results_items_timetable_assignedSections_items_day )                       | No      | integer | No         | -          | Day of the week when the section is located.                                  |
| + [realIndex](#results_items_timetable_assignedSections_items_realIndex )           | No      | integer | No         | -          | Position on the day, of the real section, in the frame.                       |
| + [fictionalIndex](#results_items_timetable_assignedSections_items_fictionalIndex ) | No      | integer | No         | -          | Position on the day, of the fictional section, in the frame.                  |
| + [startTime](#results_items_timetable_assignedSections_items_startTime )           | No      | string  | No         | -          | Start time of the section with a fictional index where sessions are assigned. |
| + [endTime](#results_items_timetable_assignedSections_items_endTime )               | No      | string  | No         | -          | End time of the section with a fictional index where sessions are assigned.   |
| + [assignment](#results_items_timetable_assignedSections_items_assignment )         | No      | object  | No         | -          | Assignment                                                                    |

###### <a name="results_items_timetable_assignedSections_items_refFrame"></a>4.1.3.2.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > refFrame`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Frame timetable section with assignment.

###### <a name="results_items_timetable_assignedSections_items_day"></a>4.1.3.2.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > day`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Day of the week when the section is located.

###### <a name="results_items_timetable_assignedSections_items_realIndex"></a>4.1.3.2.1.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > realIndex`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Position on the day, of the real section, in the frame.

###### <a name="results_items_timetable_assignedSections_items_fictionalIndex"></a>4.1.3.2.1.4. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > fictionalIndex`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Position on the day, of the fictional section, in the frame.

###### <a name="results_items_timetable_assignedSections_items_startTime"></a>4.1.3.2.1.5. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > startTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** Start time of the section with a fictional index where sessions are assigned.

###### <a name="results_items_timetable_assignedSections_items_endTime"></a>4.1.3.2.1.6. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > endTime`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |
| **Format**   | `time`   |

**Description:** End time of the section with a fictional index where sessions are assigned.

###### <a name="results_items_timetable_assignedSections_items_assignment"></a>4.1.3.2.1.7. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment`

**Title:** Assignment

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | Yes         |
| **Additional properties** | Not allowed |

**Description:** Object with list of each type of session can be assigned in the section (teaching session, meetings, complementary activities, on call services).

| Property                                                                                                         | Pattern | Type            | Deprecated | Definition | Title/Description               |
| ---------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ---------- | ------------------------------- |
| - [teachingSessions](#results_items_timetable_assignedSections_items_assignment_teachingSessions )               | No      | array of object | No         | -          | TeachingSessions                |
| - [meetings](#results_items_timetable_assignedSections_items_assignment_meetings )                               | No      | array of object | No         | -          | AssignedMeetings                |
| - [complementaryActivities](#results_items_timetable_assignedSections_items_assignment_complementaryActivities ) | No      | array of object | No         | -          | ComplementaryActivitiesAssigned |
| - [onCallServices](#results_items_timetable_assignedSections_items_assignment_onCallServices )                   | No      | array of object | No         | -          | OnCallServices                  |

###### <a name="results_items_timetable_assignedSections_items_assignment_teachingSessions"></a>4.1.3.2.1.7.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions`

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

| Each item of this array must be                                                                              | Description                                           |
| ------------------------------------------------------------------------------------------------------------ | ----------------------------------------------------- |
| [AssignedTeachingSession](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items) | Class unit or on call hour assigned in the timetable. |

###### <a name="results_items_timetable_assignedSections_items_assignment_teachingSessions_items"></a>4.1.3.2.1.7.1.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession

**Title:** AssignedTeachingSession

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Class unit or on call hour assigned in the timetable.

| Property                                                                                                            | Pattern | Type            | Deprecated | Definition               | Title/Description                            |
| ------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------ | -------------------------------------------- |
| + [refSession](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refSession )       | No      | integer         | No         | -                        | Identifier of the teaching session assigned. |
| + [refClassRomms](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | No      | array of string | No         | In #/$defs/refClassRomms | RefclassRomms                                |
| - [refTeachers](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers )     | No      | array of string | No         | -                        | RefTeachers                                  |

###### <a name="results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refSession"></a>4.1.3.2.1.7.1.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refSession`

|              |           |
| ------------ | --------- |
| **Type**     | `integer` |
| **Required** | Yes       |

**Description:** Identifier of the teaching session assigned.

###### <a name="results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms"></a>4.1.3.2.1.7.1.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms`

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

| Each item of this array must be                                                                                       | Description                                    |
| --------------------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| [RefclassRomm](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items) | Identifier of the classroom in the input file. |

###### <a name="results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms_items"></a>4.1.3.2.1.7.1.1.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refClassRomms > RefclassRomm

**Title:** RefclassRomm

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the classroom in the input file.

###### <a name="results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers"></a>4.1.3.2.1.7.1.1.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers`

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

| Each item of this array must be                                                                                   | Description                                  |
| ----------------------------------------------------------------------------------------------------------------- | -------------------------------------------- |
| [RefTeacher](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items) | Identifier of the teacher in the input file. |

###### <a name="results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refTeachers_items"></a>4.1.3.2.1.7.1.1.3.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > teachingSessions > AssignedTeachingSession > refTeachers > RefTeacher

**Title:** RefTeacher

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | No       |

**Description:** Identifier of the teacher in the input file.

###### <a name="results_items_timetable_assignedSections_items_assignment_meetings"></a>4.1.3.2.1.7.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings`

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

| Each item of this array must be                                                              | Description                                    |
| -------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| [AssignedMeeting](#results_items_timetable_assignedSections_items_assignment_meetings_items) | Meeting of teachers assigned in the timetable. |

###### <a name="results_items_timetable_assignedSections_items_assignment_meetings_items"></a>4.1.3.2.1.7.2.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting

**Title:** AssignedMeeting

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Meeting of teachers assigned in the timetable.

| Property                                                                                                    | Pattern | Type            | Deprecated | Definition                                                                                                                | Title/Description                   |
| ----------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------------------------------------------------------------------------------------------- | ----------------------------------- |
| + [refMeeting](#results_items_timetable_assignedSections_items_assignment_meetings_items_refMeeting )       | No      | string          | No         | -                                                                                                                         | Identifier of the meeting assigned. |
| - [refClassRomms](#results_items_timetable_assignedSections_items_assignment_meetings_items_refClassRomms ) | No      | array of string | No         | Same as [refClassRomms](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | RefclassRomms                       |

###### <a name="results_items_timetable_assignedSections_items_assignment_meetings_items_refMeeting"></a>4.1.3.2.1.7.2.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refMeeting`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the meeting assigned.

###### <a name="results_items_timetable_assignedSections_items_assignment_meetings_items_refClassRomms"></a>4.1.3.2.1.7.2.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > meetings > AssignedMeeting > refClassRomms`

**Title:** RefclassRomms

|                        |                                                                                                                  |
| ---------------------- | ---------------------------------------------------------------------------------------------------------------- |
| **Type**               | `array of string`                                                                                                |
| **Required**           | No                                                                                                               |
| **Same definition as** | [refClassRomms](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms) |

**Description:** List of classrooms assigned to teach the class unit.

###### <a name="results_items_timetable_assignedSections_items_assignment_complementaryActivities"></a>4.1.3.2.1.7.3. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities`

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

| Each item of this array must be                                                                                   | Description                                                 |
| ----------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------- |
| [AssignedComplementary](#results_items_timetable_assignedSections_items_assignment_complementaryActivities_items) | Teacher's complementary activity assigned in the timetable. |

###### <a name="results_items_timetable_assignedSections_items_assignment_complementaryActivities_items"></a>4.1.3.2.1.7.3.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary

**Title:** AssignedComplementary

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Teacher's complementary activity assigned in the timetable.

| Property                                                                                                                         | Pattern | Type            | Deprecated | Definition                                                                                                                | Title/Description                                  |
| -------------------------------------------------------------------------------------------------------------------------------- | ------- | --------------- | ---------- | ------------------------------------------------------------------------------------------------------------------------- | -------------------------------------------------- |
| + [refComplementary](#results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary ) | No      | string          | No         | -                                                                                                                         | Identifier of the Complementary Activity assigned. |
| - [refClassRomms](#results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms )       | No      | array of string | No         | Same as [refClassRomms](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms ) | RefclassRomms                                      |

###### <a name="results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refComplementary"></a>4.1.3.2.1.7.3.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refComplementary`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the Complementary Activity assigned.

###### <a name="results_items_timetable_assignedSections_items_assignment_complementaryActivities_items_refClassRomms"></a>4.1.3.2.1.7.3.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > complementaryActivities > AssignedComplementary > refClassRomms`

**Title:** RefclassRomms

|                        |                                                                                                                  |
| ---------------------- | ---------------------------------------------------------------------------------------------------------------- |
| **Type**               | `array of string`                                                                                                |
| **Required**           | No                                                                                                               |
| **Same definition as** | [refClassRomms](#results_items_timetable_assignedSections_items_assignment_teachingSessions_items_refClassRomms) |

**Description:** List of classrooms assigned to teach the class unit.

###### <a name="results_items_timetable_assignedSections_items_assignment_onCallServices"></a>4.1.3.2.1.7.4. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices`

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

| Each item of this array must be                                                                          | Description                          |
| -------------------------------------------------------------------------------------------------------- | ------------------------------------ |
| [AssignedOnCallService](#results_items_timetable_assignedSections_items_assignment_onCallServices_items) | Call hour assigned in the timetable. |

###### <a name="results_items_timetable_assignedSections_items_assignment_onCallServices_items"></a>4.1.3.2.1.7.4.1. GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService

**Title:** AssignedOnCallService

|                           |             |
| ------------------------- | ----------- |
| **Type**                  | `object`    |
| **Required**              | No          |
| **Additional properties** | Not allowed |

**Description:** Call hour assigned in the timetable.

| Property                                                                                                    | Pattern | Type   | Deprecated | Definition | Title/Description                            |
| ----------------------------------------------------------------------------------------------------------- | ------- | ------ | ---------- | ---------- | -------------------------------------------- |
| + [refOnCall](#results_items_timetable_assignedSections_items_assignment_onCallServices_items_refOnCall )   | No      | string | No         | -          | Identifier of the teaching session assigned. |
| + [refTeacher](#results_items_timetable_assignedSections_items_assignment_onCallServices_items_refTeacher ) | No      | string | No         | -          | RefTeachers                                  |

###### <a name="results_items_timetable_assignedSections_items_assignment_onCallServices_items_refOnCall"></a>4.1.3.2.1.7.4.1.1. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refOnCall`

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Identifier of the teaching session assigned.

###### <a name="results_items_timetable_assignedSections_items_assignment_onCallServices_items_refTeacher"></a>4.1.3.2.1.7.4.1.2. Property `GhcEngineSchema > results > EngineOutputGHCSchema > timetable > assignedSections > AssignedSection > assignment > onCallServices > AssignedOnCallService > refTeacher`

**Title:** RefTeachers

|              |          |
| ------------ | -------- |
| **Type**     | `string` |
| **Required** | Yes      |

**Description:** Teacher assigned in section on call service.

----------------------------------------------------------------------------------------------------------------------------
Generated using [json-schema-for-humans](https://github.com/coveooss/json-schema-for-humans) on 2026-11-09 at 11:34:14 +0100
