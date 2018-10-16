package tbclient;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes4.dex */
public final class TwAnchorProfit extends Message {
    public static final List<TwAnchorProfitItem> DEFAULT_PROFIT_LIST = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TwAnchorProfitItem> profit_list;

    private TwAnchorProfit(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.profit_list == null) {
                this.profit_list = DEFAULT_PROFIT_LIST;
                return;
            } else {
                this.profit_list = immutableCopyOf(builder.profit_list);
                return;
            }
        }
        this.profit_list = immutableCopyOf(builder.profit_list);
    }

    /* loaded from: classes4.dex */
    public static final class Builder extends Message.Builder<TwAnchorProfit> {
        public List<TwAnchorProfitItem> profit_list;

        public Builder() {
        }

        public Builder(TwAnchorProfit twAnchorProfit) {
            super(twAnchorProfit);
            if (twAnchorProfit != null) {
                this.profit_list = TwAnchorProfit.copyOf(twAnchorProfit.profit_list);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public TwAnchorProfit build(boolean z) {
            return new TwAnchorProfit(this, z);
        }
    }
}
