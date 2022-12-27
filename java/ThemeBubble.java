package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class ThemeBubble extends Message {
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer package_id;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_PACKAGE_ID = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<ThemeBubble> {
        public String jump_url;
        public Integer package_id;
        public Integer props_id;

        public Builder() {
        }

        public Builder(ThemeBubble themeBubble) {
            super(themeBubble);
            if (themeBubble == null) {
                return;
            }
            this.props_id = themeBubble.props_id;
            this.package_id = themeBubble.package_id;
            this.jump_url = themeBubble.jump_url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public ThemeBubble build(boolean z) {
            return new ThemeBubble(this, z);
        }
    }

    public ThemeBubble(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            Integer num2 = builder.package_id;
            if (num2 == null) {
                this.package_id = DEFAULT_PACKAGE_ID;
            } else {
                this.package_id = num2;
            }
            String str = builder.jump_url;
            if (str == null) {
                this.jump_url = "";
                return;
            } else {
                this.jump_url = str;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.package_id = builder.package_id;
        this.jump_url = builder.jump_url;
    }
}
