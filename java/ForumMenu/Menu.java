package tbclient.ForumMenu;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes10.dex */
public final class Menu extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_NAME = "";
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer action_type;
    @ProtoField(tag = 7, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer create_time;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer forum_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer id;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer level;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(label = Message.Label.REPEATED, tag = 8)
    public final List<SubMenu> sub_menu;
    public static final Integer DEFAULT_ID = 0;
    public static final Integer DEFAULT_FORUM_ID = 0;
    public static final Integer DEFAULT_LEVEL = 0;
    public static final Integer DEFAULT_ACTION_TYPE = 0;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final List<SubMenu> DEFAULT_SUB_MENU = Collections.emptyList();

    private Menu(Builder builder, boolean z) {
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
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.content == null) {
                this.content = "";
            } else {
                this.content = builder.content;
            }
            if (builder.sub_menu == null) {
                this.sub_menu = DEFAULT_SUB_MENU;
                return;
            } else {
                this.sub_menu = immutableCopyOf(builder.sub_menu);
                return;
            }
        }
        this.id = builder.id;
        this.forum_id = builder.forum_id;
        this.level = builder.level;
        this.name = builder.name;
        this.action_type = builder.action_type;
        this.create_time = builder.create_time;
        this.content = builder.content;
        this.sub_menu = immutableCopyOf(builder.sub_menu);
    }

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<Menu> {
        public Integer action_type;
        public String content;
        public Integer create_time;
        public Integer forum_id;
        public Integer id;
        public Integer level;
        public String name;
        public List<SubMenu> sub_menu;

        public Builder() {
        }

        public Builder(Menu menu) {
            super(menu);
            if (menu != null) {
                this.id = menu.id;
                this.forum_id = menu.forum_id;
                this.level = menu.level;
                this.name = menu.name;
                this.action_type = menu.action_type;
                this.create_time = menu.create_time;
                this.content = menu.content;
                this.sub_menu = Menu.copyOf(menu.sub_menu);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Menu build(boolean z) {
            return new Menu(this, z);
        }
    }
}
