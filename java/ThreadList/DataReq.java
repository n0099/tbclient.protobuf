package tbclient.ThreadList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_THREAD_IDS = "";
    @ProtoField(tag = 8)
    public final CommonReq common;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long forum_id;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer need_abstract;
    @ProtoField(tag = 7, type = Message.Datatype.UINT32)
    public final Integer q_type;
    @ProtoField(tag = 6, type = Message.Datatype.UINT32)
    public final Integer scr_h;
    @ProtoField(tag = 5, type = Message.Datatype.UINT32)
    public final Integer scr_w;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer st_type;
    @ProtoField(tag = 1, type = Message.Datatype.STRING)
    public final String thread_ids;
    public static final Long DEFAULT_FORUM_ID = 0L;
    public static final Integer DEFAULT_NEED_ABSTRACT = 0;
    public static final Integer DEFAULT_ST_TYPE = 0;
    public static final Integer DEFAULT_SCR_W = 0;
    public static final Integer DEFAULT_SCR_H = 0;
    public static final Integer DEFAULT_Q_TYPE = 0;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.thread_ids == null) {
                this.thread_ids = "";
            } else {
                this.thread_ids = builder.thread_ids;
            }
            if (builder.forum_id == null) {
                this.forum_id = DEFAULT_FORUM_ID;
            } else {
                this.forum_id = builder.forum_id;
            }
            if (builder.need_abstract == null) {
                this.need_abstract = DEFAULT_NEED_ABSTRACT;
            } else {
                this.need_abstract = builder.need_abstract;
            }
            if (builder.st_type == null) {
                this.st_type = DEFAULT_ST_TYPE;
            } else {
                this.st_type = builder.st_type;
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
            if (builder.q_type == null) {
                this.q_type = DEFAULT_Q_TYPE;
            } else {
                this.q_type = builder.q_type;
            }
            this.common = builder.common;
            return;
        }
        this.thread_ids = builder.thread_ids;
        this.forum_id = builder.forum_id;
        this.need_abstract = builder.need_abstract;
        this.st_type = builder.st_type;
        this.scr_w = builder.scr_w;
        this.scr_h = builder.scr_h;
        this.q_type = builder.q_type;
        this.common = builder.common;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public CommonReq common;
        public Long forum_id;
        public Integer need_abstract;
        public Integer q_type;
        public Integer scr_h;
        public Integer scr_w;
        public Integer st_type;
        public String thread_ids;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.thread_ids = dataReq.thread_ids;
                this.forum_id = dataReq.forum_id;
                this.need_abstract = dataReq.need_abstract;
                this.st_type = dataReq.st_type;
                this.scr_w = dataReq.scr_w;
                this.scr_h = dataReq.scr_h;
                this.q_type = dataReq.q_type;
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
