package tbclient.TestClose;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
/* loaded from: classes2.dex */
public final class TestCloseReqIdl extends Message {
    @ProtoField(tag = 1)
    public final DataReq data;

    private TestCloseReqIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.data = builder.data;
        } else {
            this.data = builder.data;
        }
    }

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<TestCloseReqIdl> {
        public DataReq data;

        public Builder() {
        }

        public Builder(TestCloseReqIdl testCloseReqIdl) {
            super(testCloseReqIdl);
            if (testCloseReqIdl != null) {
                this.data = testCloseReqIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TestCloseReqIdl build(boolean z) {
            return new TestCloseReqIdl(this, z);
        }
    }
}
