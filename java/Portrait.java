package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class Portrait extends Message {
    public static final String DEFAULT_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer end_time;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer props_id;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String url;
    public static final Integer DEFAULT_PROPS_ID = 0;
    public static final Integer DEFAULT_END_TIME = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<Portrait> {
        public Integer end_time;
        public Integer props_id;
        public String url;

        public Builder() {
        }

        public Builder(Portrait portrait) {
            super(portrait);
            if (portrait == null) {
                return;
            }
            this.props_id = portrait.props_id;
            this.end_time = portrait.end_time;
            this.url = portrait.url;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Portrait build(boolean z) {
            return new Portrait(this, z);
        }
    }

    public Portrait(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.props_id;
            if (num == null) {
                this.props_id = DEFAULT_PROPS_ID;
            } else {
                this.props_id = num;
            }
            Integer num2 = builder.end_time;
            if (num2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = num2;
            }
            String str = builder.url;
            if (str == null) {
                this.url = "";
                return;
            } else {
                this.url = str;
                return;
            }
        }
        this.props_id = builder.props_id;
        this.end_time = builder.end_time;
        this.url = builder.url;
    }
}
