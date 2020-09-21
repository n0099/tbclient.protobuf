package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes21.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_FRIEND_UID_PORTRAIT = "";
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 9)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1182common;
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

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.need_post_count == null) {
                this.need_post_count = DEFAULT_NEED_POST_COUNT;
            } else {
                this.need_post_count = builder.need_post_count;
            }
            if (builder.friend_uid == null) {
                this.friend_uid = DEFAULT_FRIEND_UID;
            } else {
                this.friend_uid = builder.friend_uid;
            }
            if (builder.is_guest == null) {
                this.is_guest = DEFAULT_IS_GUEST;
            } else {
                this.is_guest = builder.is_guest;
            }
            if (builder.st_type == null) {
                this.st_type = "";
            } else {
                this.st_type = builder.st_type;
            }
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.rn == null) {
                this.rn = DEFAULT_RN;
            } else {
                this.rn = builder.rn;
            }
            if (builder.has_plist == null) {
                this.has_plist = DEFAULT_HAS_PLIST;
            } else {
                this.has_plist = builder.has_plist;
            }
            this.f1182common = builder.f1183common;
            if (builder.scr_w == null) {
                this.scr_w = DEFAULT_SCR_W;
            } else {
                this.scr_w = builder.scr_w;
            }
            if (builder.scr_h == null) {
                this.scr_h = DEFAULT_SCR_H;
            } else {
                this.scr_h = builder.scr_h;
            }
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            if (builder.scr_dip == null) {
                this.scr_dip = DEFAULT_SCR_DIP;
            } else {
                this.scr_dip = builder.scr_dip;
            }
            if (builder.is_from_usercenter == null) {
                this.is_from_usercenter = DEFAULT_IS_FROM_USERCENTER;
            } else {
                this.is_from_usercenter = builder.is_from_usercenter;
            }
            if (builder.page == null) {
                this.page = DEFAULT_PAGE;
            } else {
                this.page = builder.page;
            }
            if (builder.friend_uid_portrait == null) {
                this.friend_uid_portrait = "";
                return;
            } else {
                this.friend_uid_portrait = builder.friend_uid_portrait;
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
        this.f1182common = builder.f1183common;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.scr_dip = builder.scr_dip;
        this.is_from_usercenter = builder.is_from_usercenter;
        this.page = builder.page;
        this.friend_uid_portrait = builder.friend_uid_portrait;
    }

    /* loaded from: classes21.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1183common;
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
            if (dataReq != null) {
                this.uid = dataReq.uid;
                this.need_post_count = dataReq.need_post_count;
                this.friend_uid = dataReq.friend_uid;
                this.is_guest = dataReq.is_guest;
                this.st_type = dataReq.st_type;
                this.pn = dataReq.pn;
                this.rn = dataReq.rn;
                this.has_plist = dataReq.has_plist;
                this.f1183common = dataReq.f1182common;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
                this.scr_dip = dataReq.scr_dip;
                this.is_from_usercenter = dataReq.is_from_usercenter;
                this.page = dataReq.page;
                this.friend_uid_portrait = dataReq.friend_uid_portrait;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
