package tbclient.Personalized;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
/* loaded from: classes.dex */
public final class AgeSexModule extends Message {
    @ProtoField(label = Message.Label.REPEATED, tag = 2)
    public final List<TagStruct> age_tag;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<TagStruct> sex_tag;
    public static final List<TagStruct> DEFAULT_SEX_TAG = Collections.emptyList();
    public static final List<TagStruct> DEFAULT_AGE_TAG = Collections.emptyList();

    /* synthetic */ AgeSexModule(Builder builder, boolean z, AgeSexModule ageSexModule) {
        this(builder, z);
    }

    private AgeSexModule(Builder builder, boolean z) {
        super(builder);
        if (z) {
            if (builder.sex_tag == null) {
                this.sex_tag = DEFAULT_SEX_TAG;
            } else {
                this.sex_tag = immutableCopyOf(builder.sex_tag);
            }
            if (builder.age_tag == null) {
                this.age_tag = DEFAULT_AGE_TAG;
                return;
            } else {
                this.age_tag = immutableCopyOf(builder.age_tag);
                return;
            }
        }
        this.sex_tag = immutableCopyOf(builder.sex_tag);
        this.age_tag = immutableCopyOf(builder.age_tag);
    }

    /* loaded from: classes.dex */
    public static final class Builder extends Message.Builder<AgeSexModule> {
        public List<TagStruct> age_tag;
        public List<TagStruct> sex_tag;

        public Builder() {
        }

        public Builder(AgeSexModule ageSexModule) {
            super(ageSexModule);
            if (ageSexModule != null) {
                this.sex_tag = AgeSexModule.copyOf(ageSexModule.sex_tag);
                this.age_tag = AgeSexModule.copyOf(ageSexModule.age_tag);
            }
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public AgeSexModule build(boolean z) {
            return new AgeSexModule(this, z, null);
        }
    }
}
