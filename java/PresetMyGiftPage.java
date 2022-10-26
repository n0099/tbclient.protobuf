package tbclient;

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
/* loaded from: classes9.dex */
public final class PresetMyGiftPage extends Message {
    public static /* synthetic */ Interceptable $ic;
    public static final Integer DEFAULT_CUR_PAGE;
    public static final Integer DEFAULT_HAS_MORE;
    public static final Integer DEFAULT_TOTAL;
    public transient /* synthetic */ FieldHolder $fh;
    @ProtoField(tag = 1, type = Message.Datatype.UINT32)
    public final Integer cur_page;
    @ProtoField(tag = 2, type = Message.Datatype.UINT32)
    public final Integer has_more;
    @ProtoField(tag = 3, type = Message.Datatype.UINT32)
    public final Integer total;

    /* loaded from: classes9.dex */
    public /* synthetic */ class a {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
    }

    /* loaded from: classes9.dex */
    public final class Builder extends Message.Builder {
        public static /* synthetic */ Interceptable $ic;
        public transient /* synthetic */ FieldHolder $fh;
        public Integer cur_page;
        public Integer has_more;
        public Integer total;

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
        public Builder(PresetMyGiftPage presetMyGiftPage) {
            super(presetMyGiftPage);
            Interceptable interceptable = $ic;
            if (interceptable != null) {
                InitContext newInitContext = TitanRuntime.newInitContext();
                newInitContext.initArgs = r2;
                Object[] objArr = {presetMyGiftPage};
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
            if (presetMyGiftPage == null) {
                return;
            }
            this.cur_page = presetMyGiftPage.cur_page;
            this.has_more = presetMyGiftPage.has_more;
            this.total = presetMyGiftPage.total;
        }

        /* JADX DEBUG: Method merged with bridge method */
        @Override // com.squareup.wire.Message.Builder
        public PresetMyGiftPage build(boolean z) {
            InterceptResult invokeZ;
            Interceptable interceptable = $ic;
            if (interceptable == null || (invokeZ = interceptable.invokeZ(Constants.METHOD_GET_CONTACTER_INFO_FOR_SESSION, this, z)) == null) {
                return new PresetMyGiftPage(this, z, null);
            }
            return (PresetMyGiftPage) invokeZ.objValue;
        }
    }

    static {
        InterceptResult invokeClinit;
        ClassClinitInterceptable classClinitInterceptable = ClassClinitInterceptorStorage.$ic;
        if (classClinitInterceptable != null && (invokeClinit = classClinitInterceptable.invokeClinit(734966759, "Ltbclient/PresetMyGiftPage;")) != null) {
            Interceptable interceptable = invokeClinit.interceptor;
            if (interceptable != null) {
                $ic = interceptable;
            }
            if ((invokeClinit.flags & 1) != 0) {
                classClinitInterceptable.invokePostClinit(734966759, "Ltbclient/PresetMyGiftPage;");
                return;
            }
        }
        DEFAULT_CUR_PAGE = 0;
        DEFAULT_HAS_MORE = 0;
        DEFAULT_TOTAL = 0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PresetMyGiftPage(Builder builder, boolean z) {
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
            Integer num = builder.cur_page;
            if (num == null) {
                this.cur_page = DEFAULT_CUR_PAGE;
            } else {
                this.cur_page = num;
            }
            Integer num2 = builder.has_more;
            if (num2 == null) {
                this.has_more = DEFAULT_HAS_MORE;
            } else {
                this.has_more = num2;
            }
            Integer num3 = builder.total;
            if (num3 == null) {
                this.total = DEFAULT_TOTAL;
                return;
            } else {
                this.total = num3;
                return;
            }
        }
        this.cur_page = builder.cur_page;
        this.has_more = builder.has_more;
        this.total = builder.total;
    }

    public /* synthetic */ PresetMyGiftPage(Builder builder, boolean z, a aVar) {
        this(builder, z);
    }
}
