package tbclient.GetCardByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
/* loaded from: classes6.dex */
public final class DataRes extends Message {
    public static final List<ThemeCardInMain> DEFAULT_CARDS = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeCardInMain> cards;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;

    /* loaded from: classes6.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemeCardInMain> cards;
        public Integer has_more;
        public ThemeRecommand recommend;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recommend = dataRes.recommend;
            this.cards = Message.copyOf(dataRes.cards);
            this.has_more = dataRes.has_more;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }

    public DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recommend = builder.recommend;
            List<ThemeCardInMain> list = builder.cards;
            if (list == null) {
                this.cards = DEFAULT_CARDS;
            } else {
                this.cards = Message.immutableCopyOf(list);
            }
            Integer num = builder.has_more;
            if (num == null) {
                this.has_more = DEFAULT_HAS_MORE;
                return;
            } else {
                this.has_more = num;
                return;
            }
        }
        this.recommend = builder.recommend;
        this.cards = Message.immutableCopyOf(builder.cards);
        this.has_more = builder.has_more;
    }
}
