package tbclient.GetConsentList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.Error;
import tbclient.Page;
/* loaded from: classes22.dex */
public final class DataRes extends Message {
    public static final List<ConsentUser> DEFAULT_CONSENT = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ConsentUser> consent;
    @ProtoField(tag = 1)
    public final Error error;
    @ProtoField(tag = 3)
    public final Page page;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.error = builder.error;
            if (builder.consent == null) {
                this.consent = DEFAULT_CONSENT;
            } else {
                this.consent = immutableCopyOf(builder.consent);
            }
            this.page = builder.page;
            return;
        }
        this.error = builder.error;
        this.consent = immutableCopyOf(builder.consent);
        this.page = builder.page;
    }

    /* loaded from: classes22.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ConsentUser> consent;
        public Error error;
        public Page page;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.error = dataRes.error;
                this.consent = DataRes.copyOf(dataRes.consent);
                this.page = dataRes.page;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
