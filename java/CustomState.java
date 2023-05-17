package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class CustomState extends Message {
    public static final String DEFAULT_CONTENT = "";
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_ICON_TYPE = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String content;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon_type;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<CustomState> {
        public String content;
        public String icon;
        public String icon_type;

        public Builder() {
        }

        public Builder(CustomState customState) {
            super(customState);
            if (customState == null) {
                return;
            }
            this.icon = customState.icon;
            this.content = customState.content;
            this.icon_type = customState.icon_type;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public CustomState build(boolean z) {
            return new CustomState(this, z);
        }
    }

    public CustomState(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.icon;
            if (str == null) {
                this.icon = "";
            } else {
                this.icon = str;
            }
            String str2 = builder.content;
            if (str2 == null) {
                this.content = "";
            } else {
                this.content = str2;
            }
            String str3 = builder.icon_type;
            if (str3 == null) {
                this.icon_type = "";
                return;
            } else {
                this.icon_type = str3;
                return;
            }
        }
        this.icon = builder.icon;
        this.content = builder.content;
        this.icon_type = builder.icon_type;
    }
}
