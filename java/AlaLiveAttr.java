package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes9.dex */
public final class AlaLiveAttr extends Message {
    public static final String DEFAULT_ALA_LIVE_COVER = "";
    public static final String DEFAULT_ALA_PORTRAIT = "";
    public static final String DEFAULT_ALA_USER_NAME = "";
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String ala_live_cover;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String ala_portrait;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String ala_user_name;
    @ProtoField(tag = 11, type = Message.Datatype.INT32)
    public final Integer audience_count;
    @ProtoField(tag = 6, type = Message.Datatype.UINT64)
    public final Long group_id;
    @ProtoField(tag = 5, type = Message.Datatype.UINT64)
    public final Long live_id;
    @ProtoField(tag = 10, type = Message.Datatype.INT32)
    public final Integer live_status;
    @ProtoField(tag = 4, type = Message.Datatype.INT32)
    public final Integer live_thread_type;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer live_type;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer open_type;
    @ProtoField(tag = 9, type = Message.Datatype.INT32)
    public final Integer screen_direction;
    public static final Integer DEFAULT_LIVE_THREAD_TYPE = 0;
    public static final Long DEFAULT_LIVE_ID = 0L;
    public static final Long DEFAULT_GROUP_ID = 0L;
    public static final Integer DEFAULT_LIVE_TYPE = 0;
    public static final Integer DEFAULT_OPEN_TYPE = 0;
    public static final Integer DEFAULT_SCREEN_DIRECTION = 0;
    public static final Integer DEFAULT_LIVE_STATUS = 0;
    public static final Integer DEFAULT_AUDIENCE_COUNT = 0;

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<AlaLiveAttr> {
        public String ala_live_cover;
        public String ala_portrait;
        public String ala_user_name;
        public Integer audience_count;
        public Long group_id;
        public Long live_id;
        public Integer live_status;
        public Integer live_thread_type;
        public Integer live_type;
        public Integer open_type;
        public Integer screen_direction;

        public Builder() {
        }

        public Builder(AlaLiveAttr alaLiveAttr) {
            super(alaLiveAttr);
            if (alaLiveAttr == null) {
                return;
            }
            this.ala_user_name = alaLiveAttr.ala_user_name;
            this.ala_portrait = alaLiveAttr.ala_portrait;
            this.ala_live_cover = alaLiveAttr.ala_live_cover;
            this.live_thread_type = alaLiveAttr.live_thread_type;
            this.live_id = alaLiveAttr.live_id;
            this.group_id = alaLiveAttr.group_id;
            this.live_type = alaLiveAttr.live_type;
            this.open_type = alaLiveAttr.open_type;
            this.screen_direction = alaLiveAttr.screen_direction;
            this.live_status = alaLiveAttr.live_status;
            this.audience_count = alaLiveAttr.audience_count;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveAttr build(boolean z) {
            return new AlaLiveAttr(this, z);
        }
    }

    public AlaLiveAttr(Builder builder, boolean z) {
        super(builder);
        if (z) {
            String str = builder.ala_user_name;
            if (str == null) {
                this.ala_user_name = "";
            } else {
                this.ala_user_name = str;
            }
            String str2 = builder.ala_portrait;
            if (str2 == null) {
                this.ala_portrait = "";
            } else {
                this.ala_portrait = str2;
            }
            String str3 = builder.ala_live_cover;
            if (str3 == null) {
                this.ala_live_cover = "";
            } else {
                this.ala_live_cover = str3;
            }
            Integer num = builder.live_thread_type;
            if (num == null) {
                this.live_thread_type = DEFAULT_LIVE_THREAD_TYPE;
            } else {
                this.live_thread_type = num;
            }
            Long l = builder.live_id;
            if (l == null) {
                this.live_id = DEFAULT_LIVE_ID;
            } else {
                this.live_id = l;
            }
            Long l2 = builder.group_id;
            if (l2 == null) {
                this.group_id = DEFAULT_GROUP_ID;
            } else {
                this.group_id = l2;
            }
            Integer num2 = builder.live_type;
            if (num2 == null) {
                this.live_type = DEFAULT_LIVE_TYPE;
            } else {
                this.live_type = num2;
            }
            Integer num3 = builder.open_type;
            if (num3 == null) {
                this.open_type = DEFAULT_OPEN_TYPE;
            } else {
                this.open_type = num3;
            }
            Integer num4 = builder.screen_direction;
            if (num4 == null) {
                this.screen_direction = DEFAULT_SCREEN_DIRECTION;
            } else {
                this.screen_direction = num4;
            }
            Integer num5 = builder.live_status;
            if (num5 == null) {
                this.live_status = DEFAULT_LIVE_STATUS;
            } else {
                this.live_status = num5;
            }
            Integer num6 = builder.audience_count;
            if (num6 == null) {
                this.audience_count = DEFAULT_AUDIENCE_COUNT;
                return;
            } else {
                this.audience_count = num6;
                return;
            }
        }
        this.ala_user_name = builder.ala_user_name;
        this.ala_portrait = builder.ala_portrait;
        this.ala_live_cover = builder.ala_live_cover;
        this.live_thread_type = builder.live_thread_type;
        this.live_id = builder.live_id;
        this.group_id = builder.group_id;
        this.live_type = builder.live_type;
        this.open_type = builder.open_type;
        this.screen_direction = builder.screen_direction;
        this.live_status = builder.live_status;
        this.audience_count = builder.audience_count;
    }
}
