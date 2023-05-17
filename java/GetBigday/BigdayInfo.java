package tbclient.GetBigday;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes10.dex */
public final class BigdayInfo extends Message {
    public static final String DEFAULT_IMG_URL = "";
    public static final String DEFAULT_JUMP_URL = "";
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long end_time;
    @ProtoField(tag = 5, type = Message.Datatype.INT64)
    public final Long id;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer img_colour;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String img_url;
    @ProtoField(tag = 6, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer position;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long start_time;
    public static final Long DEFAULT_START_TIME = 0L;
    public static final Long DEFAULT_END_TIME = 0L;
    public static final Integer DEFAULT_POSITION = 0;
    public static final Long DEFAULT_ID = 0L;
    public static final Integer DEFAULT_IMG_COLOUR = 0;

    /* loaded from: classes10.dex */
    public static final class Builder extends Message.Builder<BigdayInfo> {
        public Long end_time;
        public Long id;
        public Integer img_colour;
        public String img_url;
        public String jump_url;
        public Integer position;
        public Long start_time;

        public Builder() {
        }

        public Builder(BigdayInfo bigdayInfo) {
            super(bigdayInfo);
            if (bigdayInfo == null) {
                return;
            }
            this.start_time = bigdayInfo.start_time;
            this.end_time = bigdayInfo.end_time;
            this.position = bigdayInfo.position;
            this.img_url = bigdayInfo.img_url;
            this.id = bigdayInfo.id;
            this.jump_url = bigdayInfo.jump_url;
            this.img_colour = bigdayInfo.img_colour;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BigdayInfo build(boolean z) {
            return new BigdayInfo(this, z);
        }
    }

    public BigdayInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.start_time;
            if (l == null) {
                this.start_time = DEFAULT_START_TIME;
            } else {
                this.start_time = l;
            }
            Long l2 = builder.end_time;
            if (l2 == null) {
                this.end_time = DEFAULT_END_TIME;
            } else {
                this.end_time = l2;
            }
            Integer num = builder.position;
            if (num == null) {
                this.position = DEFAULT_POSITION;
            } else {
                this.position = num;
            }
            String str = builder.img_url;
            if (str == null) {
                this.img_url = "";
            } else {
                this.img_url = str;
            }
            Long l3 = builder.id;
            if (l3 == null) {
                this.id = DEFAULT_ID;
            } else {
                this.id = l3;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            Integer num2 = builder.img_colour;
            if (num2 == null) {
                this.img_colour = DEFAULT_IMG_COLOUR;
                return;
            } else {
                this.img_colour = num2;
                return;
            }
        }
        this.start_time = builder.start_time;
        this.end_time = builder.end_time;
        this.position = builder.position;
        this.img_url = builder.img_url;
        this.id = builder.id;
        this.jump_url = builder.jump_url;
        this.img_colour = builder.img_colour;
    }
}
