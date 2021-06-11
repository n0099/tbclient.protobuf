package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes8.dex */
public final class SubBottomMenu extends Message {
    public static final String DEFAULT_NAME = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<SubBottomMenu> {
        public String name;
        public String url;

        public Builder() {
        }

        public Builder(SubBottomMenu subBottomMenu) {
            super(subBottomMenu);
            if (subBottomMenu == null) {
                return;
            }
            this.name = subBottomMenu.name;
            this.url = subBottomMenu.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public SubBottomMenu build(boolean z) {
            return new SubBottomMenu(this, z);
        }
    }

    public SubBottomMenu(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.url;
            if (str2 == null) {
                this.url = "";
                return;
            } else {
                this.url = str2;
                return;
            }
        }
        this.name = builder.name;
        this.url = builder.url;
    }
}
