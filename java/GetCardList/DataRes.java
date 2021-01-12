package tbclient.GetCardList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeCardPropMain;
import tbclient.ThemeRecommand;
/* loaded from: classes8.dex */
public final class DataRes extends Message {
    public static final List<ThemeCardPropMain> DEFAULT_CARDS = Collections.emptyList();
    public static final Integer DEFAULT_HAS_MORE = 0;
    public static final Integer DEFAULT_IS_DEFAULT = 0;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeCardPropMain> cards;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 4, type = Message.Datatype.UINT32)
    public final Integer is_default;
    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recommend = builder.recommend;
            if (builder.cards == null) {
                this.cards = DEFAULT_CARDS;
            } else {
                this.cards = immutableCopyOf(builder.cards);
            }
            if (builder.has_more == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = builder.has_more;
            }
            if (builder.is_default == null) {
                this.is_default = DEFAULT_IS_DEFAULT;
                return;
            } else {
                this.is_default = builder.is_default;
                return;
            }
        }
        this.recommend = builder.recommend;
        this.cards = immutableCopyOf(builder.cards);
        this.has_more = builder.has_more;
        this.is_default = builder.is_default;
    }

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemeCardPropMain> cards;
        public Integer has_more;
        public Integer is_default;
        public ThemeRecommand recommend;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.recommend = dataRes.recommend;
                this.cards = DataRes.copyOf(dataRes.cards);
                this.has_more = dataRes.has_more;
                this.is_default = dataRes.is_default;
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
