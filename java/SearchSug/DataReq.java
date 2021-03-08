package tbclient.SearchSug;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.CommonReq;
/* loaded from: classes7.dex */
public final class DataReq extends Message {
    public static final String DEFAULT_ISFORUM = "";
    public static final String DEFAULT_WORD = "";
    @ProtoField(tag = 1)

    /* renamed from: common  reason: collision with root package name */
    public final CommonReq f8921common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String isforum;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    private DataReq(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.f8921common = builder.f8922common;
            if (builder.word == null) {
                this.word = "";
            } else {
                this.word = builder.word;
            }
            if (builder.isforum == null) {
                this.isforum = "";
                return;
            } else {
                this.isforum = builder.isforum;
                return;
            }
        }
        this.f8921common = builder.f8922common;
        this.word = builder.word;
        this.isforum = builder.isforum;
    }

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f8922common;
        public String isforum;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq != null) {
                this.f8922common = dataReq.f8921common;
                this.word = dataReq.word;
                this.isforum = dataReq.isforum;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataReq build(boolean z) {
            return new DataReq(this, z);
        }
    }
}
