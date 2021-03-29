package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes7.dex */
public final class Fans extends Message {
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer is_get;
    @ProtoField(tag = 2, type = Message.Datatype.INT32)
    public final Integer left_time;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer num;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer open;
    @ProtoField(tag = 1, type = Message.Datatype.INT32)
    public final Integer start_time;
    public static final Integer DEFAULT_START_TIME = 0;
    public static final Integer DEFAULT_LEFT_TIME = 0;
    public static final Integer DEFAULT_OPEN = 0;
    public static final Integer DEFAULT_IS_GET = 0;
    public static final Integer DEFAULT_NUM = 0;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<Fans> {
        public Integer is_get;
        public Integer left_time;
        public Integer num;
        public Integer open;
        public Integer start_time;

        public Builder() {
        }

        public Builder(Fans fans) {
            super(fans);
            if (fans == null) {
                return;
            }
            this.start_time = fans.start_time;
            this.left_time = fans.left_time;
            this.open = fans.open;
            this.is_get = fans.is_get;
            this.num = fans.num;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public Fans build(boolean z) {
            return new Fans(this, z);
        }
    }

    public Fans(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.start_time;
            if (num == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = num;
            }
            Integer num2 = builder.left_time;
            if (num2 == null) {
                this.left_time = DEFAULT_LEFT_TIME;
            } else {
                this.left_time = num2;
            }
            Integer num3 = builder.open;
            if (num3 == null) {
                this.open = DEFAULT_OPEN;
            } else {
                this.open = num3;
            }
            Integer num4 = builder.is_get;
            if (num4 == null) {
                this.is_get = DEFAULT_IS_GET;
            } else {
                this.is_get = num4;
            }
            Integer num5 = builder.num;
            if (num5 == null) {
                this.num = DEFAULT_NUM;
                return;
            } else {
                this.num = num5;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.left_time = builder.left_time;
        this.open = builder.open;
        this.is_get = builder.is_get;
        this.num = builder.num;
    }
}
