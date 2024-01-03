package tbclient.GetBgByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
/* loaded from: classes2.dex */
public final class DataRes extends Message {
    public static final List<ThemeBgInMain> DEFAULT_BGS = Collections.emptyList();
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeBgInMain> bgs;
    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public List<ThemeBgInMain> bgs;
        public ThemeRecommand recommend;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes == null) {
                return;
            }
            this.recommend = dataRes.recommend;
            this.bgs = Message.copyOf(dataRes.bgs);
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
            List<ThemeBgInMain> list = builder.bgs;
            if (list == null) {
                this.bgs = DEFAULT_BGS;
                return;
            } else {
                this.bgs = Message.immutableCopyOf(list);
                return;
            }
        }
        this.recommend = builder.recommend;
        this.bgs = Message.immutableCopyOf(builder.bgs);
    }
}
