package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FRIEND_UID_PORTRAIT = "";
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 9)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f69497common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long friend_uid;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String friend_uid_portrait;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer has_plist;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_from_usercenter;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_guest;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer need_post_count;
    @ProtoField(tag = 15, type = Message.Datatype.INT32)
    public final Integer page;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 12, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 13, type = Message.Datatype.DOUBLE)
    public final Double scr_dip;
    @ProtoField(tag = 11, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 10, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 1, type = Message.Datatype.INT64)
    public final Long uid;
    public static final Long DEFAULT_UID = 0L;
    public static final Integer DEFAULT_NEED_POST_COUNT = 0;
    public static final Long DEFAULT_FRIEND_UID = 0L;
    public static final Integer DEFAULT_IS_GUEST = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_HAS_PLIST = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;
    public static final Double DEFAULT_SCR_DIP = Double.valueOf(0.0d);
    public static final Integer DEFAULT_IS_FROM_USERCENTER = 0;
    public static final Integer DEFAULT_PAGE = 0;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69498common;
        public Long friend_uid;
        public String friend_uid_portrait;
        public Integer has_plist;
        public Integer is_from_usercenter;
        public Integer is_guest;
        public Integer need_post_count;
        public Integer page;
        public Integer pn;
        public Integer q_type;
        public Integer rn;
        public Double scr_dip;
        public Integer scr_h;
        public Integer scr_w;
        public String st_type;
        public Long uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.uid = dataReq.uid;
            this.need_post_count = dataReq.need_post_count;
            this.friend_uid = dataReq.friend_uid;
            this.is_guest = dataReq.is_guest;
            this.st_type = dataReq.st_type;
            this.pn = dataReq.pn;
            this.rn = dataReq.rn;
            this.has_plist = dataReq.has_plist;
            this.f69498common = dataReq.f69497common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.q_type = dataReq.q_type;
            this.scr_dip = dataReq.scr_dip;
            this.is_from_usercenter = dataReq.is_from_usercenter;
            this.page = dataReq.page;
            this.friend_uid_portrait = dataReq.friend_uid_portrait;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }

    public DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            Integer num = builder.need_post_count;
            if (num == null) {
                this.need_post_count = DEFAULT_NEED_POST_COUNT;
            } else {
                this.need_post_count = num;
            }
            Long l2 = builder.friend_uid;
            if (l2 == null) {
                this.friend_uid = DEFAULT_FRIEND_UID;
            } else {
                this.friend_uid = l2;
            }
            Integer num2 = builder.is_guest;
            if (num2 == null) {
                this.is_guest = DEFAULT_IS_GUEST;
            } else {
                this.is_guest = num2;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            Integer num3 = builder.pn;
            if (num3 == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num3;
            }
            Integer num4 = builder.rn;
            if (num4 == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = num4;
            }
            Integer num5 = builder.has_plist;
            if (num5 == null) {
                this.has_plist = DEFAULT_HAS_PLIST;
            } else {
                this.has_plist = num5;
            }
            this.f69497common = builder.f69498common;
            Integer num6 = builder.scr_w;
            if (num6 == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = num6;
            }
            Integer num7 = builder.scr_h;
            if (num7 == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = num7;
            }
            Integer num8 = builder.q_type;
            if (num8 == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = num8;
            }
            Double d2 = builder.scr_dip;
            if (d2 == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d2;
            }
            Integer num9 = builder.is_from_usercenter;
            if (num9 == null) {
                this.is_from_usercenter = DEFAULT_IS_FROM_USERCENTER;
            } else {
                this.is_from_usercenter = num9;
            }
            Integer num10 = builder.page;
            if (num10 == null) {
                this.page = DEFAULT_PAGE;
            } else {
                this.page = num10;
            }
            String str2 = builder.friend_uid_portrait;
            if (str2 == null) {
                this.friend_uid_portrait = "";
                return;
            } else {
                this.friend_uid_portrait = str2;
                return;
            }
        }
        this.uid = builder.uid;
        this.need_post_count = builder.need_post_count;
        this.friend_uid = builder.friend_uid;
        this.is_guest = builder.is_guest;
        this.st_type = builder.st_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.has_plist = builder.has_plist;
        this.f69497common = builder.f69498common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.is_from_usercenter = builder.is_from_usercenter;
        this.page = builder.page;
        this.friend_uid_portrait = builder.friend_uid_portrait;
    }
}
