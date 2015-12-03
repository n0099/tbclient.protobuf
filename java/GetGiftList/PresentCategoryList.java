package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class PresentCategoryList extends Message {
    public static final String DEFAULT_CATEGORY_NAME = "";
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer category_id;
    @ProtoField(tag = 2, type = Message.Datatype.STRING)
    public final String category_name;
    @ProtoField(label = Message.Label.REPEATED, tag = 3, type = Message.Datatype.UINT32)
    public final List<Integer> gift_ids;
    public static final Integer DEFAULT_CATEGORY_ID = 0;
    public static final List<Integer> DEFAULT_GIFT_IDS = Collections.emptyList();

    /* synthetic */ PresentCategoryList(Builder builder, boolean z, PresentCategoryList presentCategoryList) {
        this(builder, z);
    }

    private PresentCategoryList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.category_id == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = builder.category_id;
            }
            if (builder.category_name == null) {
                this.category_name = "";
            } else {
                this.category_name = builder.category_name;
            }
            if (builder.gift_ids == null) {
                this.gift_ids = DEFAULT_GIFT_IDS;
                return;
            } else {
                this.gift_ids = immutableCopyOf(builder.gift_ids);
                return;
            }
        }
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
        this.gift_ids = immutableCopyOf(builder.gift_ids);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<PresentCategoryList> {
        public Integer category_id;
        public String category_name;
        public List<Integer> gift_ids;

        public Builder() {
        }

        public Builder(PresentCategoryList presentCategoryList) {
            super(presentCategoryList);
            if (presentCategoryList != null) {
                this.category_id = presentCategoryList.category_id;
                this.category_name = presentCategoryList.category_name;
                this.gift_ids = PresentCategoryList.copyOf(presentCategoryList.gift_ids);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentCategoryList build(boolean z) {
            return new PresentCategoryList(this, z, null);
        }
    }
}
