package tbclient.Channel;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class OpArea extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_PATH = "";
    public static final String DEFAULT_SUB_TITLE = "";
    public static final String DEFAULT_TITLE = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String path;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String sub_title;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String title;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<OpArea> {
        public String icon;
        public String path;
        public String sub_title;
        public String title;

        public Builder() {
        }

        public Builder(OpArea opArea) {
            super(opArea);
            if (opArea == null) {
                return;
            }
            this.title = opArea.title;
            this.sub_title = opArea.sub_title;
            this.icon = opArea.icon;
            this.path = opArea.path;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public OpArea build(boolean z) {
            return new OpArea(this, z);
        }
    }

    public OpArea(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.title;
            if (str == null) {
                this.title = "";
            } else {
                this.title = str;
            }
            String str2 = builder.sub_title;
            if (str2 == null) {
                this.sub_title = "";
            } else {
                this.sub_title = str2;
            }
            String str3 = builder.icon;
            if (str3 == null) {
                this.icon = "";
            } else {
                this.icon = str3;
            }
            String str4 = builder.path;
            if (str4 == null) {
                this.path = "";
                return;
            } else {
                this.path = str4;
                return;
            }
        }
        this.title = builder.title;
        this.sub_title = builder.sub_title;
        this.icon = builder.icon;
        this.path = builder.path;
    }
}
