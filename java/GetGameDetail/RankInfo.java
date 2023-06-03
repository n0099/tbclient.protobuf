package tbclient.GetGameDetail;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
public final class RankInfo extends Message {
    public static final List<RankItem> DEFAULT_RANK_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<RankItem> rank_list;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<RankInfo> {
        public List<RankItem> rank_list;

        public Builder() {
        }

        public Builder(RankInfo rankInfo) {
            super(rankInfo);
            if (rankInfo == null) {
                return;
            }
            this.rank_list = Message.copyOf(rankInfo.rank_list);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public RankInfo build(boolean z) {
            return new RankInfo(this, z);
        }
    }

    public RankInfo(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<RankItem> list = builder.rank_list;
            if (list == null) {
                this.rank_list = DEFAULT_RANK_LIST;
                return;
            } else {
                this.rank_list = Message.immutableCopyOf(list);
                return;
            }
        }
        this.rank_list = Message.immutableCopyOf(builder.rank_list);
    }
}
