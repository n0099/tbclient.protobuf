package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class ThemeTailInUser extends Message {
    public static final String DEFAULT_DYNAMIC = "";
    public static final String DEFAULT_PROPS_ID = "";
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String dynamic;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String props_id;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String url;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<ThemeTailInUser> {
        public String dynamic;
        public String props_id;
        public String url;

        public Builder() {
        }

        public Builder(ThemeTailInUser themeTailInUser) {
            super(themeTailInUser);
            if (themeTailInUser == null) {
                return;
            }
            this.url = themeTailInUser.url;
            this.dynamic = themeTailInUser.dynamic;
            this.props_id = themeTailInUser.props_id;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeTailInUser build(boolean z) {
            return new ThemeTailInUser(this, z);
        }
    }

    public ThemeTailInUser(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.url;
            if (str == null) {
                this.url = "";
            } else {
                this.url = str;
            }
            String str2 = builder.dynamic;
            if (str2 == null) {
                this.dynamic = "";
            } else {
                this.dynamic = str2;
            }
            String str3 = builder.props_id;
            if (str3 == null) {
                this.props_id = "";
                return;
            } else {
                this.props_id = str3;
                return;
            }
        }
        this.url = builder.url;
        this.dynamic = builder.dynamic;
        this.props_id = builder.props_id;
    }
}
