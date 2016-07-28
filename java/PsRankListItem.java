package tbclient;

import com.squareup.wire.Message;
/* loaded from: classes.dex */
public final class PsRankListItem extends Message {
    /* synthetic */ PsRankListItem(Builder builder, boolean z, PsRankListItem psRankListItem) {
        this(builder, z);
    }

    private PsRankListItem(Builder builder, boolean z) {
        super(builder);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PsRankListItem> {
        public Builder() {
        }

        public Builder(PsRankListItem psRankListItem) {
            super(psRankListItem);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PsRankListItem build(boolean z) {
            return new PsRankListItem(this, z, null);
        }
    }
}
