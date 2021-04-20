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
    public final CommonReq f69610common;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String isforum;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String word;

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<DataReq> {

        /* renamed from: common  reason: collision with root package name */
        public CommonReq f69611common;
        public String isforum;
        public String word;

        public Builder() {
        }

        public Builder(DataReq dataReq) {
            super(dataReq);
            if (dataReq == null) {
                return;
            }
            this.f69611common = dataReq.f69610common;
            this.word = dataReq.word;
            this.isforum = dataReq.isforum;
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
            this.f69610common = builder.f69611common;
            String str = builder.word;
            if (str == null) {
                this.word = "";
            } else {
                this.word = str;
            }
            String str2 = builder.isforum;
            if (str2 == null) {
                this.isforum = "";
                return;
            } else {
                this.isforum = str2;
                return;
            }
        }
        this.f69610common = builder.f69611common;
        this.word = builder.word;
        this.isforum = builder.isforum;
    }
}
