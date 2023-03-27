package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class BaseTextColor extends Message {
    public static final String DEFAULT_DAY = "";
    public static final String DEFAULT_NIGHT = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String day;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String night;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<BaseTextColor> {
        public String day;
        public String night;
        public Integer type;

        public Builder() {
        }

        public Builder(BaseTextColor baseTextColor) {
            super(baseTextColor);
            if (baseTextColor == null) {
                return;
            }
            this.type = baseTextColor.type;
            this.day = baseTextColor.day;
            this.night = baseTextColor.night;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BaseTextColor build(boolean z) {
            return new BaseTextColor(this, z);
        }
    }

    public BaseTextColor(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.day;
            if (str == null) {
                this.day = "";
            } else {
                this.day = str;
            }
            String str2 = builder.night;
            if (str2 == null) {
                this.night = "";
                return;
            } else {
                this.night = str2;
                return;
            }
        }
        this.type = builder.type;
        this.day = builder.day;
        this.night = builder.night;
    }
}
