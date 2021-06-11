package tbclient.GetGiftMyList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes8.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ST_TYPE = "";
    @ProtoField(tag = 4)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f72666common;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer pn;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String st_type;
    @ProtoField(tag = 2, type = Message.Datatype.INT64)
    public final Long uid;
    public static final Integer DEFAULT_PN = 0;
    public static final Long DEFAULT_UID = 0L;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f72667common;
        public Integer pn;
        public String st_type;
        public Long uid;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.pn = dataReq.pn;
            this.uid = dataReq.uid;
            this.st_type = dataReq.st_type;
            this.f72667common = dataReq.f72666common;
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
            Integer num = builder.pn;
            if (num == null) {
                this.pn = DEFAULT_PN;
            } else {
                this.pn = num;
            }
            Long l = builder.uid;
            if (l == null) {
                this.uid = DEFAULT_UID;
            } else {
                this.uid = l;
            }
            String str = builder.st_type;
            if (str == null) {
                this.st_type = "";
            } else {
                this.st_type = str;
            }
            this.f72666common = builder.f72667common;
            return;
        }
        this.pn = builder.pn;
        this.uid = builder.uid;
        this.st_type = builder.st_type;
        this.f72666common = builder.f72667common;
    }
}
