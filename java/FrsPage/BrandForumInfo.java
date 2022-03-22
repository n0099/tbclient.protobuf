package tbclient.FrsPage;

import com.baidu.android.imsdk.internal.Constants;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptable;
import com.baidu.titan.sdk.runtime.ClassClinitInterceptorStorage;
import com.baidu.titan.sdk.runtime.FieldHolder;
import com.baidu.titan.sdk.runtime.InitContext;
import com.baidu.titan.sdk.runtime.InterceptResult;
import com.baidu.titan.sdk.runtime.Interceptable;
import com.baidu.titan.sdk.runtime.TitanRuntime;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.util.Collections;
import java.util.List;
import tbclient.OriForumInfo;
/* loaded from: classes8.dex */
public final class BrandForumInfo extends Message {
    public static /* synthetic */ Interceptable $ic = null;
    public static final String DEFAULT_BRAND_DESC = "";
    public static final String DEFAULT_JUMP_DESC = "";
    public static final String DEFAULT_JUMP_URL = "";
    public static final List<OriForumInfo> DEFAULT_RELATION_FORUM;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 3, type = Message.Datatype.STRING)
    public final String brand_desc;
    @ProtoField(tag = 2)
    public final HeadImgs head_imgs;
    @ProtoField(tag = 5, type = Message.Datatype.STRING)
    public final String jump_desc;
    @ProtoField(tag = 4, type = Message.Datatype.STRING)
    public final String jump_url;
    @ProtoField(label = Message.Label.REPEATED, tag = 1)
    public final List<OriForumInfo> relation_forum;

    /* loaded from: classes8.dex */
    public static final class Builder extends Message.Builder<BrandForumInfo> {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public String brand_desc;
        public HeadImgs head_imgs;
        public String jump_desc;
        public String jump_url;
        public List<OriForumInfo> relation_forum;

        public Builder() {
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                interceptable.invokeUnInit(65536, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65536, newInitContext);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Builder(BrandForumInfo brandForumInfo) {
            super(brandForumInfo);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {brandForumInfo};
                interceptable.invokeUnInit(65537, newInitContext);
                int i = newInitContext.flag;
                if ((i & 1) != 0) {
                    int i2 = i & 2;
                    super((Message) newInitContext.callArgs[0]);
                    newInitContext.thisArg = this;
                    interceptable.invokeInitBody(65537, newInitContext);
                    return;
                }
            }
            if (brandForumInfo == null) {
                return;
            }
            this.relation_forum = Message.copyOf(brandForumInfo.relation_forum);
            this.head_imgs = brandForumInfo.head_imgs;
            this.brand_desc = brandForumInfo.brand_desc;
            this.jump_url = brandForumInfo.jump_url;
            this.jump_desc = brandForumInfo.jump_desc;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public BrandForumInfo build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            return (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) ? new BrandForumInfo(this, z, null) : (BrandForumInfo) invokeZ.objValue;
        }
    }

    /* loaded from: classes8.dex */
    public static /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(1935109008, "Ltbclient/FrsPage/BrandForumInfo;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(1935109008, "Ltbclient/FrsPage/BrandForumInfo;");
                return;
            }
        }
        DEFAULT_RELATION_FORUM = Collections.emptyList();
    }

    public /* synthetic */ BrandForumInfo(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BrandForumInfo(Builder builder, boolean z) {
        super(builder);
        Interceptable interceptable = $ic;
        if (interceptable != null) {
            InitContext newInitContext = TitanRuntime.newInitContext();
            newInitContext.initArgs = r2;
            Object[] objArr = {builder, Boolean.valueOf(z)};
            interceptable.invokeUnInit(65537, newInitContext);
            int i = newInitContext.flag;
            if ((i & 1) != 0) {
                int i2 = i & 2;
                super((Message.Builder) newInitContext.callArgs[0]);
                newInitContext.thisArg = this;
                interceptable.invokeInitBody(65537, newInitContext);
                return;
            }
        }
        if (z) {
            List<OriForumInfo> list = builder.relation_forum;
            if (list == null) {
                this.relation_forum = DEFAULT_RELATION_FORUM;
            } else {
                this.relation_forum = Message.immutableCopyOf(list);
            }
            this.head_imgs = builder.head_imgs;
            String str = builder.brand_desc;
            if (str == null) {
                this.brand_desc = "";
            } else {
                this.brand_desc = str;
            }
            String str2 = builder.jump_url;
            if (str2 == null) {
                this.jump_url = "";
            } else {
                this.jump_url = str2;
            }
            String str3 = builder.jump_desc;
            if (str3 == null) {
                this.jump_desc = "";
                return;
            } else {
                this.jump_desc = str3;
                return;
            }
        }
        this.relation_forum = Message.immutableCopyOf(builder.relation_forum);
        this.head_imgs = builder.head_imgs;
        this.brand_desc = builder.brand_desc;
        this.jump_url = builder.jump_url;
        this.jump_desc = builder.jump_desc;
    }
}
