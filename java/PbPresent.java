package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class PbPresent extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<PbPresentList> list;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer total;
    public static final Integer DEFAULT_TOTAL = 0;
    public static final List<PbPresentList> DEFAULT_LIST = Collections.emptyList();

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PbPresent> {
        public List<PbPresentList> list;
        public Integer total;

        public Builder() {
        }

        public Builder(PbPresent pbPresent) {
            super(pbPresent);
            if (pbPresent == null) {
                return;
            }
            this.total = pbPresent.total;
            this.list = Message.copyOf(pbPresent.list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PbPresent build(boolean z) {
            return new PbPresent(this, z);
        }
    }

    public PbPresent(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.total;
            if (num == null) {
                this.total = DEFAULT_TOTAL;
            } else {
                this.total = num;
            }
            List<PbPresentList> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
                return;
            } else {
                this.list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.total = builder.total;
        this.list = Message.immutableCopyOf(builder.list);
    }
}
