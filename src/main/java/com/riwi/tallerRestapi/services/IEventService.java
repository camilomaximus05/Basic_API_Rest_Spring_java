package com.riwi.tallerRestapi.services;

import com.riwi.tallerRestapi.Models.Event;
import com.riwi.tallerRestapi.services.crud.*;

public interface IEventService extends Save<Event>, ReadById<Event>, ReadAll<Event>, Update<Event>, DeleteById{
}
