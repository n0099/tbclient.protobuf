package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes8.dex */
public final class AlaLiveInsert extends Message {
    public static final List<ThreadInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> ala_live_list;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<AlaLiveInsert> {
        public List<ThreadInfo> ala_live_list;

        public Builder() {
        }

        public Builder(AlaLiveInsert alaLiveInsert) {
            super(alaLiveInsert);
            if (alaLiveInsert == null) {
                return;
            }
            this.ala_live_list = Message.copyOf(alaLiveInsert.ala_live_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveInsert build(boolean z) {
            return new AlaLiveInsert(this, z);
        }
    }

    public AlaLiveInsert(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<ThreadInfo> list = builder.ala_live_list;
            if (list == null) {
                this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
                return;
            } else {
                this.ala_live_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.ala_live_list = Message.immutableCopyOf(builder.ala_live_list);
    }
}
