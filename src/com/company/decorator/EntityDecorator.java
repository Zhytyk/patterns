package com.company.decorator;

public class EntityDecorator extends Entity {
    private Entity _entity;

    private String alias;

    public EntityDecorator(String alias, Entity _entity) {
        super(_entity.getId(), _entity.getName());

        this.alias = alias;
        this._entity = _entity;
    }

    @Override
    public int getId() {
        return _entity.getId();
    }

    @Override
    public String getName() {
        return _entity.getName();
    }

    @Override
    public void setId(int id) {
        _entity.setId(id);
    }

    @Override
    public void setName(String name) {
        _entity.setName(name);
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}
