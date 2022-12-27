package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class PushType extends Message {
    public static final String DEFAULT_ICON = "";
    public static final String DEFAULT_NAME = "";
    public static final Integer DEFAULT_TYPE = 0;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String icon;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String name;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer type;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PushType> {
        public String icon;
        public String name;
        public Integer type;

        public Builder() {
        }

        public Builder(PushType pushType) {
            super(pushType);
            if (pushType == null) {
                return;
            }
            this.type = pushType.type;
            this.name = pushType.name;
            this.icon = pushType.icon;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PushType build(boolean z) {
            return new PushType(this, z);
        }
    }

    public PushType(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.type;
            if (num == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = num;
            }
            String str = builder.name;
            if (str == null) {
                this.name = "";
            } else {
                this.name = str;
            }
            String str2 = builder.icon;
            if (str2 == null) {
                this.icon = "";
                return;
            } else {
                this.icon = str2;
                return;
            }
        }
        this.type = builder.type;
        this.name = builder.name;
        this.icon = builder.icon;
    }
}
