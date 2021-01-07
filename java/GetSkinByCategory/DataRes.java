package tbclient.GetSkinByCategory;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.ThemeRecommand;
/* loaded from: classes9.dex */
public final class DataRes extends Message {
    public static final List<ThemeSkinInMain> DEFAULT_SKINS = Collections.emptyList();
    @ProtoField(tag = 1)
    public final ThemeRecommand recommend;
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<ThemeSkinInMain> skins;

    private DataRes(Builder builder, boolean z) {
        super(builder);
        if (z) {
            this.recommend = builder.recommend;
            if (builder.skins == null) {
                this.skins = DEFAULT_SKINS;
                return;
            } else {
                this.skins = immutableCopyOf(builder.skins);
                return;
            }
        }
        this.recommend = builder.recommend;
        this.skins = immutableCopyOf(builder.skins);
    }

    /* loaded from: classes9.dex */
    public static final class Builder extends Message.Builder<DataRes> {
        public ThemeRecommand recommend;
        public List<ThemeSkinInMain> skins;

        public Builder() {
        }

        public Builder(DataRes dataRes) {
            super(dataRes);
            if (dataRes != null) {
                this.recommend = dataRes.recommend;
                this.skins = DataRes.copyOf(dataRes.skins);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public DataRes build(boolean z) {
            return new DataRes(this, z);
        }
    }
}
