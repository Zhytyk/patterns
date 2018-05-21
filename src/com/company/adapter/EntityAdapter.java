package com.company.adapter;

public class EntityAdapter implements EntityInterfaceApapter {
    private Entity _entity;

    public EntityAdapter(Entity _entity) {
        this._entity = _entity;
    }

    @Override
    public String getFullData() {
        return _entity.getId() + " " + _entity.getName();
    }
}
