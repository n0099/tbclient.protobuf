package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes26.dex */
public final class SubMenu extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer action_type;
    @ProtoField(tag = 8, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer parent_id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer update_time;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_FORUM_ID = 0;
    public static final Integer DEFAULT_LEVEL = 0;
    public static final Integer DEFAULT_PARENT_ID = 0;
    public static final Integer DEFAULT_ACTION_TYPE = 0;
    public static final Integer DEFAULT_UPDATE_TIME = 0;

    private SubMenu(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.id == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = builder.id;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.level == null) {
                this.level = DEFAULT_LEVEL;
            } else {
                this.level = builder.level;
            }
            if (builder.parent_id == null) {
                this.parent_id = DEFAULT_PARENT_ID;
            } else {
                this.parent_id = builder.parent_id;
            }
            if (builder.name == null) {
                this.name = "";
            } else {
                this.name = builder.name;
            }
            if (builder.action_type == null) {
                this.action_type = DEFAULT_ACTION_TYPE;
            } else {
                this.action_type = builder.action_type;
            }
            if (builder.update_time == null) {
                this.update_time = DEFAULT_UPDATE_TIME;
            } else {
                this.update_time = builder.update_time;
            }
            if (builder.content == null) {
                this.content = "";
                return;
            } else {
                this.content = builder.content;
                return;
            }
        }
        this.id = builder.id;
        this.forum_id = builder.forum_id;
        this.level = builder.level;
        this.parent_id = builder.parent_id;
        this.name = builder.name;
        this.action_type = builder.action_type;
        this.update_time = builder.update_time;
        this.content = builder.content;
    }

    /* loaded from: classes26.dex */
    public static final class Builder extends Message.Builder<SubMenu> {
        public Integer action_type;
        public String content;
        public Integer forum_id;
        public Integer id;
        public Integer level;
        public String name;
        public Integer parent_id;
        public Integer update_time;

        public Builder() {
        }

        public Builder(SubMenu subMenu) {
            super(subMenu);
            if (subMenu != null) {
                this.id = subMenu.id;
                this.forum_id = subMenu.forum_id;
                this.level = subMenu.level;
                this.parent_id = subMenu.parent_id;
                this.name = subMenu.name;
                this.action_type = subMenu.action_type;
                this.update_time = subMenu.update_time;
                this.content = subMenu.content;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubMenu build(boolean z) {
            return new SubMenu(this, z);
        }
    }
}
