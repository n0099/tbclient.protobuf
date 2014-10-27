package tbclient.Profile;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 9)
    public final CommonReq common;
    @ProtoField(tag = 3, type = Message.Datatype.UINT64)
    public final Long friend_uid;
    @ProtoField(tag = 8, type = Message.Datatype.UINT32)
    public final Integer has_plist;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_guest;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer need_post_count;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer rn;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer uid;
    public static final Integer DEFAULT_UID = 0;
    public static final Integer DEFAULT_NEED_POST_COUNT = 0;
    public static final Long DEFAULT_FRIEND_UID = 0L;
    public static final Integer DEFAULT_IS_GUEST = 0;
    public static final Integer DEFAULT_PN = 0;
    public static final Integer DEFAULT_RN = 0;
    public static final Integer DEFAULT_HAS_PLIST = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

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
            this.common = builder.common;
            return;
        }
        this.uid = builder.uid;
        this.need_post_count = builder.need_post_count;
        this.friend_uid = builder.friend_uid;
        this.is_guest = builder.is_guest;
        this.st_type = builder.st_type;
        this.pn = builder.pn;
        this.rn = builder.rn;
        this.has_plist = builder.has_plist;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long friend_uid;
        public Integer has_plist;
        public Integer is_guest;
        public Integer need_post_count;
        public Integer pn;
        public Integer rn;
        public String st_type;
        public Integer uid;

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
                this.common = dataReq.common;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
