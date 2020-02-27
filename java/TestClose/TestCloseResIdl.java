package tbclient.TestClose;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import tbclient.Error;
/* loaded from: classes9.dex */
public final class TestCloseResIdl extends Message {
    @ProtoField(tag = 2)
    public final DataRes data;
    @ProtoField(tag = 1)
    public final Error error;

    private TestCloseResIdl(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            this.data = builder.data;
            return;
        }
        this.error = builder.error;
        this.data = builder.data;
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<TestCloseResIdl> {
        public DataRes data;
        public Error error;

        public Builder() {
        }

        public Builder(TestCloseResIdl testCloseResIdl) {
            super(testCloseResIdl);
            if (testCloseResIdl != null) {
                this.error = testCloseResIdl.error;
                this.data = testCloseResIdl.data;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TestCloseResIdl build(boolean z) {
            return new TestCloseResIdl(this, z);
        }
    }
}
