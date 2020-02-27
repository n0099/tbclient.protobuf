package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class High extends Message {
    public static final String DEFAULT_PIC_URL = "";
    public static final String DEFAULT_PORTRAIT = "";
    public static final String DEFAULT_USER_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT64)
    public final Long album_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer create_time;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long hid;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer num_cai;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer num_zan;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String pic_url;
    @ProtoField(tag = 10, type = Message.Datatype.STRING)
    public final String portrait;
    @ProtoField(tag = 9, type = Message.Datatype.UINT32)
    public final Integer type;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long uid;
    @ProtoField(tag = 11, type = Message.Datatype.STRING)
    public final String user_name;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer weight;
    public static final Long DEFAULT_ALBUM_ID = 0L;
    public static final Long DEFAULT_HID = 0L;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_CREATE_TIME = 0;
    public static final Integer DEFAULT_NUM_ZAN = 0;
    public static final Integer DEFAULT_NUM_CAI = 0;
    public static final Integer DEFAULT_WEIGHT = 0;
    public static final Integer DEFAULT_TYPE = 0;

    private High(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.album_id == null) {
                this.album_id = DEFAULT_ALBUM_ID;
            } else {
                this.album_id = builder.album_id;
            }
            if (builder.hid == null) {
                this.hid = DEFAULT_HID;
            } else {
                this.hid = builder.hid;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.pic_url == null) {
                this.pic_url = "";
            } else {
                this.pic_url = builder.pic_url;
            }
            if (builder.create_time == null) {
                this.create_time = DEFAULT_CREATE_TIME;
            } else {
                this.create_time = builder.create_time;
            }
            if (builder.num_zan == null) {
                this.num_zan = DEFAULT_NUM_ZAN;
            } else {
                this.num_zan = builder.num_zan;
            }
            if (builder.num_cai == null) {
                this.num_cai = DEFAULT_NUM_CAI;
            } else {
                this.num_cai = builder.num_cai;
            }
            if (builder.weight == null) {
                this.weight = DEFAULT_WEIGHT;
            } else {
                this.weight = builder.weight;
            }
            if (builder.type == null) {
                this.type = DEFAULT_TYPE;
            } else {
                this.type = builder.type;
            }
            if (builder.portrait == null) {
                this.portrait = "";
            } else {
                this.portrait = builder.portrait;
            }
            if (builder.user_name == null) {
                this.user_name = "";
                return;
            } else {
                this.user_name = builder.user_name;
                return;
            }
        }
        this.album_id = builder.album_id;
        this.hid = builder.hid;
        this.uid = builder.uid;
        this.pic_url = builder.pic_url;
        this.create_time = builder.create_time;
        this.num_zan = builder.num_zan;
        this.num_cai = builder.num_cai;
        this.weight = builder.weight;
        this.type = builder.type;
        this.portrait = builder.portrait;
        this.user_name = builder.user_name;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<High> {
        public Long album_id;
        public Integer create_time;
        public Long hid;
        public Integer num_cai;
        public Integer num_zan;
        public String pic_url;
        public String portrait;
        public Integer type;
        public Long uid;
        public String user_name;
        public Integer weight;

        public Builder() {
        }

        public Builder(High high) {
            super(high);
            if (high != null) {
                this.album_id = high.album_id;
                this.hid = high.hid;
                this.uid = high.uid;
                this.pic_url = high.pic_url;
                this.create_time = high.create_time;
                this.num_zan = high.num_zan;
                this.num_cai = high.num_cai;
                this.weight = high.weight;
                this.type = high.type;
                this.portrait = high.portrait;
                this.user_name = high.user_name;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public High build(boolean z) {
            return new High(this, z);
        }
    }
}
