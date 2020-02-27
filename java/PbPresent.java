package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes9.dex */
public final class PbPresent extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PbPresentList> list;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer total;
    public static final Integer DEFAULT_TOTAL = 0;
    public static final List<PbPresentList> DEFAULT_LIST = Collections.emptyList();

    private PbPresent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.total == null) {
                this.total = DEFAULT_TOTAL;
            } else {
                this.total = builder.total;
            }
            if (builder.list == null) {
                this.list = DEFAULT_LIST;
                return;
            } else {
                this.list = immutableCopyOf(builder.list);
                return;
            }
        }
        this.total = builder.total;
        this.list = immutableCopyOf(builder.list);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<PbPresent> {
        public List<PbPresentList> list;
        public Integer total;

        public Builder() {
        }

        public Builder(PbPresent pbPresent) {
            super(pbPresent);
            if (pbPresent != null) {
                this.total = pbPresent.total;
                this.list = PbPresent.copyOf(pbPresent.list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbPresent build(boolean z) {
            return new PbPresent(this, z);
        }
    }
}
