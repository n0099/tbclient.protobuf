package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long uid;
    public static final Integer DEFAULT_PN = 0;
    public static final Long DEFAULT_UID = 0L;

    /* synthetic */ DataReq(Builder builder, boolean z, DataReq dataReq) {
        this(builder, z);
    }

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.pn == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = builder.pn;
            }
            if (builder.uid == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = builder.uid;
            }
            if (builder.st_type == null) {
                this.st_type = "";
                return;
            } else {
                this.st_type = builder.st_type;
                return;
            }
        }
        this.pn = builder.pn;
        this.uid = builder.uid;
        this.st_type = builder.st_type;
    }

    /* loaded from: classes.dex */
    public final class Builder extends Message.Builder<DataReq> {
        public Integer pn;
        public String st_type;
        public Long uid;

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.pn = dataReq.pn;
                this.uid = dataReq.uid;
                this.st_type = dataReq.st_type;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z, null);
        }
    }
}
