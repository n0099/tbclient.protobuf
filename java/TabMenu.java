package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TabMenu extends Message {
    public static final Integer DEFAULT_CLASS_ID = 0;
    public static final String DEFAULT_CLASS_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer class_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String class_name;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TabMenu> {
        public Integer class_id;
        public String class_name;

        public Builder() {
        }

        public Builder(TabMenu tabMenu) {
            super(tabMenu);
            if (tabMenu == null) {
                return;
            }
            this.class_id = tabMenu.class_id;
            this.class_name = tabMenu.class_name;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TabMenu build(boolean z) {
            return new TabMenu(this, z);
        }
    }

    public TabMenu(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.class_id;
            if (num == null) {
                this.class_id = DEFAULT_CLASS_ID;
            } else {
                this.class_id = num;
            }
            String str = builder.class_name;
            if (str == null) {
                this.class_name = "";
                return;
            } else {
                this.class_name = str;
                return;
            }
        }
        this.class_id = builder.class_id;
        this.class_name = builder.class_name;
    }
}
