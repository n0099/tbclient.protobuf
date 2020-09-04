package tbclient.GetPostList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.CommonReq;
/* loaded from: classes16.dex */
public final class DataReq extends Message {
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f1107common;
    @ProtoField(tag = 8, type = Message.Datatype.INT32)
    public final Integer is_comm_reverse;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long kz;
    @ProtoField(label = Message.Label.REPEATED, tag = 4, type = Message.Datatype.INT64)
    public final List<Long> post_id;
    @ProtoField(tag = 6, type = Message.Datatype.INT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.INT32)
    public final Integer scr_w;
    @ProtoField(tag = 7, type = Message.Datatype.INT32)
    public final Integer st_type;
    @ProtoField(tag = 3, type = Message.Datatype.INT32)
    public final Integer with_floor;
    public static final Long DEFAULT_KZ = 0L;
    public static final Integer DEFAULT_WITH_FLOOR = 0;
    public static final List<Long> DEFAULT_POST_ID = Collections.emptyList();
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_ST_TYPE = 0;
    public static final Integer DEFAULT_IS_COMM_REVERSE = 0;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f1107common = builder.f1108common;
            if (builder.kz == null) {
                this.kz = DEFAULT_KZ;
            } else {
                this.kz = builder.kz;
            }
            if (builder.with_floor == null) {
                this.with_floor = DEFAULT_WITH_FLOOR;
            } else {
                this.with_floor = builder.with_floor;
            }
            if (builder.post_id == null) {
                this.post_id = DEFAULT_POST_ID;
            } else {
                this.post_id = immutableCopyOf(builder.post_id);
            }
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
            if (builder.st_type == null) {
                this.st_type = DEFAULT_ST_TYPE;
            } else {
                this.st_type = builder.st_type;
            }
            if (builder.is_comm_reverse == null) {
                this.is_comm_reverse = DEFAULT_IS_COMM_REVERSE;
                return;
            } else {
                this.is_comm_reverse = builder.is_comm_reverse;
                return;
            }
        }
        this.f1107common = builder.f1108common;
        this.kz = builder.kz;
        this.with_floor = builder.with_floor;
        this.post_id = immutableCopyOf(builder.post_id);
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.st_type = builder.st_type;
        this.is_comm_reverse = builder.is_comm_reverse;
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f1108common;
        public Integer is_comm_reverse;
        public Long kz;
        public List<Long> post_id;
        public Integer scr_h;
        public Integer scr_w;
        public Integer st_type;
        public Integer with_floor;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f1108common = dataReq.f1107common;
                this.kz = dataReq.kz;
                this.with_floor = dataReq.with_floor;
                this.post_id = DataReq.copyOf(dataReq.post_id);
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.st_type = dataReq.st_type;
                this.is_comm_reverse = dataReq.is_comm_reverse;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
