package tbclient.FrsPage;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThreadInfo;
/* loaded from: classes16.dex */
public final class AlaLiveInsert extends Message {
    public static final List<ThreadInfo> DEFAULT_ALA_LIVE_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<ThreadInfo> ala_live_list;

    private AlaLiveInsert(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.ala_live_list == null) {
                this.ala_live_list = DEFAULT_ALA_LIVE_LIST;
                return;
            } else {
                this.ala_live_list = immutableCopyOf(builder.ala_live_list);
                return;
            }
        }
        this.ala_live_list = immutableCopyOf(builder.ala_live_list);
    }

    /* loaded from: classes16.dex */
    public static final class Builder extends Message.Builder<AlaLiveInsert> {
        public List<ThreadInfo> ala_live_list;

        public Builder() {
        }

        public Builder(AlaLiveInsert alaLiveInsert) {
            super(alaLiveInsert);
            if (alaLiveInsert != null) {
                this.ala_live_list = AlaLiveInsert.copyOf(alaLiveInsert.ala_live_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AlaLiveInsert build(boolean z) {
            return new AlaLiveInsert(this, z);
        }
    }
}
