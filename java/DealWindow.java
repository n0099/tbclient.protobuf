package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes8.dex */
public final class DealWindow extends Message {
    public static final List<DisplayWindowInfo> DEFAULT_LIST = Collections.emptyList();
    public static final Long DEFAULT_TOTAL = 0L;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<DisplayWindowInfo> list;
    @ProtoField(tag = 2, type = Message.Datatype.UINT64)
    public final Long total;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DealWindow> {
        public List<DisplayWindowInfo> list;
        public Long total;

        public Builder() {
        }

        public Builder(DealWindow dealWindow) {
            super(dealWindow);
            if (dealWindow == null) {
                return;
            }
            this.list = Message.copyOf(dealWindow.list);
            this.total = dealWindow.total;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DealWindow build(boolean z) {
            return new DealWindow(this, z);
        }
    }

    public DealWindow(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<DisplayWindowInfo> list = builder.list;
            if (list == null) {
                this.list = DEFAULT_LIST;
            } else {
                this.list = Message.immutableCopyOf(list);
            }
            Long l = builder.total;
            if (l == null) {
                this.total = DEFAULT_TOTAL;
                return;
            } else {
                this.total = l;
                return;
            }
        }
        this.list = Message.immutableCopyOf(builder.list);
        this.total = builder.total;
    }
}
