package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes7.dex */
public final class AgeSexModule extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TagStruct> age_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TagStruct> sex_tag;
    public static final List<TagStruct> DEFAULT_SEX_TAG = Collections.emptyList();
    public static final List<TagStruct> DEFAULT_AGE_TAG = Collections.emptyList();

    /* loaded from: classes7.dex */
    public static final class Builder extends Message.Builder<AgeSexModule> {
        public List<TagStruct> age_tag;
        public List<TagStruct> sex_tag;

        public Builder() {
        }

        public Builder(AgeSexModule ageSexModule) {
            super(ageSexModule);
            if (ageSexModule == null) {
                return;
            }
            this.sex_tag = Message.copyOf(ageSexModule.sex_tag);
            this.age_tag = Message.copyOf(ageSexModule.age_tag);
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgeSexModule build(boolean z) {
            return new AgeSexModule(this, z);
        }
    }

    public AgeSexModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            List<TagStruct> list = builder.sex_tag;
            if (list == null) {
                this.sex_tag = DEFAULT_SEX_TAG;
            } else {
                this.sex_tag = Message.immutableCopyOf(list);
            }
            List<TagStruct> list2 = builder.age_tag;
            if (list2 == null) {
                this.age_tag = DEFAULT_AGE_TAG;
                return;
            } else {
                this.age_tag = Message.immutableCopyOf(list2);
                return;
            }
        }
        this.sex_tag = Message.immutableCopyOf(builder.sex_tag);
        this.age_tag = Message.immutableCopyOf(builder.age_tag);
    }
}
