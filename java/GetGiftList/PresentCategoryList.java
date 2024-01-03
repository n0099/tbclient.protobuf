package tbclient.GetGiftList;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes2.dex */
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

    /* loaded from: classes2.dex */
    public static final class Builder extends Message.Builder<PresentCategoryList> {
        public Integer category_id;
        public String category_name;
        public List<Integer> gift_ids;

        public Builder() {
        }

        public Builder(PresentCategoryList presentCategoryList) {
            super(presentCategoryList);
            if (presentCategoryList == null) {
                return;
            }
            this.category_id = presentCategoryList.category_id;
            this.category_name = presentCategoryList.category_name;
            this.gift_ids = Message.copyOf(presentCategoryList.gift_ids);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresentCategoryList build(boolean z) {
            return new PresentCategoryList(this, z);
        }
    }

    public PresentCategoryList(Builder builder, boolean z) {
        super(builder);
        if (z) {
            Integer num = builder.category_id;
            if (num == null) {
                this.category_id = DEFAULT_CATEGORY_ID;
            } else {
                this.category_id = num;
            }
            String str = builder.category_name;
            if (str == null) {
                this.category_name = "";
            } else {
                this.category_name = str;
            }
            List<Integer> list = builder.gift_ids;
            if (list == null) {
                this.gift_ids = DEFAULT_GIFT_IDS;
                return;
            } else {
                this.gift_ids = Message.immutableCopyOf(list);
                return;
            }
        }
        this.category_id = builder.category_id;
        this.category_name = builder.category_name;
        this.gift_ids = Message.immutableCopyOf(builder.gift_ids);
    }
}
