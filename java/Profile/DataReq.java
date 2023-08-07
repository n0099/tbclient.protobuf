package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes2.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FRIEND_UID_PORTRAIT = "";
    public static final String DEFAULT_HISTORY_FORUM_IDS = "";
    public static final String DEFAULT_HISTORY_FORUM_NAMES = "";
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 9)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1460common;
    @ProtoField(tag = 3, type = Message.Datatype.INT64)
    public final Long friend_uid;
    @ProtoField(tag = 16, type = Message.Datatype.STRING)
    public final String friend_uid_portrait;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer has_plist;
    @ProtoField(tag = 17, type = Message.Datatype.STRING)
    public final String history_forum_ids;
    @ProtoField(tag = 18, type = Message.Datatype.STRING)
    public final String history_forum_names;
    @ProtoField(tag = 20, type = Message.Datatype.INT32)
    public final Integer is_enable_naws;
    @ProtoField(tag = 14, type = Message.Datatype.INT32)
    public final Integer is_from_usercenter;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_guest;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer need_post_count;
    @ProtoField(tag = 19, type = Message.Datatype.INT32)
    public final Integer need_usergrowth_task;
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
    public static final Integer DEFAULT_NEED_USERGROWTH_TASK = 0;
    public static final Integer DEFAULT_IS_ENABLE_NAWS = 0;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1461common;
        public Long friend_uid;
        public String friend_uid_portrait;
        public Integer has_plist;
        public String history_forum_ids;
        public String history_forum_names;
        public Integer is_enable_naws;
        public Integer is_from_usercenter;
        public Integer is_guest;
        public Integer need_post_count;
        public Integer need_usergrowth_task;
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
            this.f1461common = dataReq.f1460common;
            this.scr_w = dataReq.scr_w;
            this.scr_h = dataReq.scr_h;
            this.q_type = dataReq.q_type;
            this.scr_dip = dataReq.scr_dip;
            this.is_from_usercenter = dataReq.is_from_usercenter;
            this.page = dataReq.page;
            this.friend_uid_portrait = dataReq.friend_uid_portrait;
            this.history_forum_ids = dataReq.history_forum_ids;
            this.history_forum_names = dataReq.history_forum_names;
            this.need_usergrowth_task = dataReq.need_usergrowth_task;
            this.is_enable_naws = dataReq.is_enable_naws;
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
            this.f1460common = builder.f1461common;
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
            Double d = builder.scr_dip;
            if (d == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = d;
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
            } else {
                this.friend_uid_portrait = str2;
            }
            String str3 = builder.history_forum_ids;
            if (str3 == null) {
                this.history_forum_ids = "";
            } else {
                this.history_forum_ids = str3;
            }
            String str4 = builder.history_forum_names;
            if (str4 == null) {
                this.history_forum_names = "";
            } else {
                this.history_forum_names = str4;
            }
            Integer num11 = builder.need_usergrowth_task;
            if (num11 == null) {
                this.need_usergrowth_task = DEFAULT_NEED_USERGROWTH_TASK;
            } else {
                this.need_usergrowth_task = num11;
            }
            Integer num12 = builder.is_enable_naws;
            if (num12 == null) {
                this.is_enable_naws = DEFAULT_IS_ENABLE_NAWS;
                return;
            } else {
                this.is_enable_naws = num12;
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
        this.f1460common = builder.f1461common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.is_from_usercenter = builder.is_from_usercenter;
        this.page = builder.page;
        this.friend_uid_portrait = builder.friend_uid_portrait;
        this.history_forum_ids = builder.history_forum_ids;
        this.history_forum_names = builder.history_forum_names;
        this.need_usergrowth_task = builder.need_usergrowth_task;
        this.is_enable_naws = builder.is_enable_naws;
    }
}
